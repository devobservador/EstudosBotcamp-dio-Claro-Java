package Enums;

public enum EstadoCivil {


    Solteiro ("solteiro","on"),
    CASADO("Casado","of"),
    DIVORCIADO("Separado","offf"),
    FICANTE("ficando sério","on-off")
    ;
    private String name;
    private String sigla;

    private EstadoCivil(String name,String sigla){
        this.name=name;
        this.sigla=sigla;

    }

    public String getName(){
        return  name;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNomeMaisculo(){
        return name.toUpperCase();
    }

}
