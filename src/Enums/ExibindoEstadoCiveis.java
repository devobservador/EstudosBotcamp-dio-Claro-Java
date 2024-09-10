package Enums;

public class ExibindoEstadoCiveis {

    public static void main(String[] args) {
        for(EstadoCivil e: EstadoCivil.values()){
            //System.out.println(e.getSigla()+"-"+e.getName());

        }
        EstadoCivil eb=EstadoCivil.Solteiro;
        System.out.println(eb.getSigla());
        System.out.println(eb.getName());
        System.out.println(eb.getNomeMaisculo());

    }
}
