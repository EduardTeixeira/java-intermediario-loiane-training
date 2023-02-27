package aula60;

public class EscopoVariaveis {

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int calculaValor(int valor) {

        valor = valor + 10;

        return valor;
    }

    public int teste() {

        int valor = 5;

        valor--;

        //this.valor = valor; // referencial valor global/atributo da classe

        return valor;
    }

    public void outroTeste() {

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        int j;

        for (j = 0; j < 6; j++) {
            System.out.println(j);
        }

        System.out.println(j);
    }

}
