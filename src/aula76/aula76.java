package aula76;

public class aula76 {

    public static void main(String[] args) {

        String curso = "Curso ";
        String java = "Java";

        String cursoJava = curso + java;

        System.out.println(cursoJava);

        String resultado2com2 = "Resultado de 2+2 = " + (2 + 2);
        System.out.println(resultado2com2);

        String resultado2com2_ = "Resultado de 2+2 = " + 2 + 2;
        System.out.println(resultado2com2_);

        String um = String.valueOf(1);
        System.out.println(um);

        String concatenacao = "Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, " +
                "e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja" +
                " de tipos e os embaralhou para fazer um livro de modelos de tipos. " +
                "Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica," +
                " permanecendo essencialmente inalterado. Se popularizou na década de 60," +
                " quando a Letraset lançou decalques contendo passagens de Lorem Ipsum," +
                " e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.";

        System.out.println(concatenacao);

        String concatenacao2 = "Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, ";
        concatenacao2 += "e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja";
        concatenacao2 += " de tipos e os embaralhou para fazer um livro de modelos de tipos. ";
        concatenacao2 += "Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica,";
        concatenacao2 += " permanecendo essencialmente inalterado. Se popularizou na década de 60,";
        concatenacao2 += " quando a Letraset lançou decalques contendo passagens de Lorem Ipsum,";
        concatenacao2 += " e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.";

        System.out.println(concatenacao2);

    }

}
