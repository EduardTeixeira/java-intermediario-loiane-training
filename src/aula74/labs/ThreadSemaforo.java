package aula74.labs;

public class ThreadSemaforo implements Runnable {

    private CorSemaforo cor;
    private boolean parar;
    private boolean corMudou;

    Thread thread;

    public ThreadSemaforo(CorSemaforo cor) {
        this.cor = cor;
        this.parar = false;
        this.corMudou = false;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {

        while (!parar) {
            try {
                switch (this.cor) {
                    case VERMELHO:
                        Thread.sleep(2500);
                        break;
                    case AMARELO:
                        Thread.sleep(500);
                        break;
                    case VERDE:
                        Thread.sleep(1500);
                        break;
                    default:
                        break;
                }
                this.mudarCor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private synchronized void mudarCor() {
        switch (this.cor) {
            case VERMELHO:
                this.cor = CorSemaforo.VERDE;
                break;
            case VERDE:
                this.cor = CorSemaforo.AMARELO;
                break;
            case AMARELO:
                this.cor = CorSemaforo.VERMELHO;
                break;
            default:
                break;
        }
        this.corMudou = true;
        notify();
    }

    public synchronized void esperaTrocaCor() {
        try {
            while (!this.corMudou) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.corMudou = false;
    }

    public synchronized void pararSemaforo() {
        this.parar = true;
    }

    public CorSemaforo getCor() {
        return cor;
    }

}
