/* 
 * Arquivo: capitulo13/TesteAssociacoes.java
 * Autor: Prof. Dr. David Buzatto
 */
public class TesteAssociacoes {
    
    public static void main( String[] args ) {

        Cliente cliente = new Cliente( 
                "João", "da Silva", 
                new Data( 20, 5, 1990 ), 
                new CPF( "123.123.123-12" ) );
        
        Gerente gerente = new Gerente( 
                "6789", "Marcos", "Oliveira", 
                new CPF( "456.456.456-45" ) );

        Conta conta = new Conta( 
                "88888", 5000, 2000, 
                new Data( 7, 7, 2023 ), 
                cliente, gerente );

        gerente.getContas().add( conta );
        
        System.out.println( "Cliente: " + cliente + "\n" );
        System.out.println( "Gerente: " + gerente + "\n" );
        System.out.println( conta );

    }

}