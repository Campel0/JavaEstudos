/* 
 * Arquivo: capitulo12/TesteConta.java
 * Autor: Prof. Dr. David Buzatto
 */
public class TesteConta {
    
    public static void main( String[] args ) {

        Conta conta = new Conta( "123", -1000, -500 );
        System.out.println( conta + "\n" );

        System.out.println( "Depositando R$500,00" );
        conta.depositar( 500 );
        System.out.println( conta + "\n" );

        System.out.print( "Sacando R$1000,00: " );
        if ( conta.sacar( 1000 ) ) {
            System.out.println( "Saque realizado!" );
        } else {
            System.out.println( "Limite insuficiente!" );
        }
        System.out.println( conta + "\n" );

        System.out.print( "Sacando R$2000,00: " );
        if ( conta.sacar( 2000 ) ) {
            System.out.println( "Saque realizado!" );
        } else {
            System.out.println( "Limite insuficiente!" );
        }
        System.out.println( conta + "\n" );

        System.out.print( "Sacando R$200,00: " );
        if ( conta.sacar( 200 ) ) {
            System.out.println( "Saque realizado!" );
        } else {
            System.out.println( "Limite insuficiente!" );
        }
        System.out.println( conta + "\n" );

        System.out.print( "Sacando R$400,00: " );
        if ( conta.sacar( 400 ) ) {
            System.out.println( "Saque realizado!" );
        } else {
            System.out.println( "Limite insuficiente!" );
        }
        System.out.println( conta + "\n" );

        System.out.print( "Sacando R$300,00: " );
        if ( conta.sacar( 300 ) ) {
            System.out.println( "Saque realizado!" );
        } else {
            System.out.println( "Limite insuficiente!" );
        }
        System.out.println( conta + "\n" );

        System.out.println( "Depositando R$1800,00" );
        conta.depositar( 1800 );
        System.out.println( conta );

    }

}