package aula65;

public @interface InformacaoAula {

    String autor();

    int aulaNumero();

    String blog() default "https://github.com";

    String site() default "https://github.com/EduardTeixeira";

}
