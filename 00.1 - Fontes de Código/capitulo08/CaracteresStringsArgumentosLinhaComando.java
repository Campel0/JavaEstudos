/*
 * Arquivo: capitulo08/CaracteresStringsArgumentosLinhaComando.java
 * Autor: Prof. Dr. David Buzatto
 */

public class CaracteresStringsArgumentosLinhaComando {

    /* 
     * Através do parâmetro args o método main consegue processar
     * argumentos enviados na linha de comando ao se executar a classe
     * compilada.
     */
    public static void main( String[] args ) {

        int n1 = 0;
        int n2 = 0;

        if ( args.length > 0 ) {

            switch ( args[0] ) {

                case "/?":
                    System.out.println( 
                        "Programa desenvolvido por David Buzatto." );
                    break;

                case "/calc":
                    if ( args.length == 4 ) {

                        try {
                            n1 = Integer.parseInt( args[1] );
                        } catch ( NumberFormatException exc ) {
                            System.out.println( 
                                "Voce precisa fornecer numeros inteiros!" );
                        }

                        try {
                            n2 = Integer.parseInt( args[3] );
                        } catch ( NumberFormatException exc ) {
                            System.out.println( 
                                "Voce precisa fornecer numeros inteiros!" );
                        }

                        switch ( args[2] ) {
                            case "+":
                                System.out.printf( 
                                    "%d + %d = %d", n1, n2, n1 + n2 ) ;
                                break;
                            case "-":
                                System.out.printf( 
                                    "%d - %d = %d", n1, n2, n1 - n2 ) ;
                                break;
                            case "*":
                                System.out.printf( 
                                    "%d * %d = %d", n1, n2, n1 * n2 ) ;
                                break;
                            case "/":
                                System.out.printf( 
                                    "%d / %d = %d", n1, n2, n1 / n2 ) ;
                                break;
                            case "pow":
                                System.out.printf( 
                                    "Math.pow( %d, %d ) = %d", n1, n2, 
                                    (int) Math.pow( n1, n2 ) ) ;
                                break;
                            default:
                                System.out.println( "Operador invalido!" );
                        }

                    }
                    break;

            }

        }

    }

}
