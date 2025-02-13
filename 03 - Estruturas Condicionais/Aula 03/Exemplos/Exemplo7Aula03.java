public class Exemplo7Aula03 {

    public static void main(String[] args) {
        
        // Exemplo: Dias da semana

        int dia = 3;

        switch ( dia ) {
            case 1:
                System.out.println( "Domingo" );
                break;

            case 2:
                System.out.println( "Segunda" );
                break;

            case 3:
                System.out.println( "Terca" );
                break;

            case 4:
                System.out.println( "Quarta" );
                break;

            case 5:
                System.out.println( "Quinta" );
                break;

            case 6:
                System.out.println( "Sexta" );
                break;

            case 7:
                System.out.println( "Sabado" );
                break;

            default:
                break;
        }

        // Switch moderno (Java 13+):

        String diaSemana = switch( dia ){
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terca";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sabado";
            default -> "Dia invalido";
        };
        
        System.out.println( diaSemana );
    }
    
}
