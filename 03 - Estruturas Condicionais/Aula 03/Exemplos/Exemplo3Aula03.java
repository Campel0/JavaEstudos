public class Exemplo3Aula03 {
    
    public static void main( String[] args ) {
        
        // Exemplo 3: if...else if...else (múltiplas condições)

        double nota = 7.5;
        if ( nota >= 9 ){
            System.err.println( "Excelente!" );
        }
            else if( nota >= 7 ){
                System.out.println( "Otimo!" );
            }
                else if( nota >= 5 ){
                    System.out.println( "Recuperacao" );
                }
                    else{
                        System.out.println( "Reprovado" );
                    }

    }
    
}
