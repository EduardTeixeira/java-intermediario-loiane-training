package aula56;

public class TesteDocumento {

    public static void main(String[] args) {

        for (TipoDocumento doc : TipoDocumento.values()) {
            System.out.println(doc + " - " + doc.geraNumeroTeste());
        }

        Pessoa pf1 = new Pessoa();
        pf1.setTipoDocumento(TipoDocumento.CPF);
        pf1.setNumeroDocumento(pf1.getTipoDocumento().geraNumeroTeste());
        System.out.println(pf1.toString());

        Pessoa pj1 = new Pessoa();
        pj1.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pj1.setNumeroDocumento(pj1.getTipoDocumento().geraNumeroTeste());
        System.out.println(pj1.toString());

    }

}
