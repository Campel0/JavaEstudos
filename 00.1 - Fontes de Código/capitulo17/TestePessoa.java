/*
 * Arquivo: capitulo17/TestePessoa.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Teste do record Pessoa.
 */
public class TestePessoa {
    
    public static void main( String[] args ) {
        
        // instancia um record Pessoa (como um objeto comum)
        Pessoa p1 = new Pessoa( "Joao", "da Silva", 1985 );

        // instancia mais dois records do tipo Pessoa
        Pessoa p2 = new Pessoa( "Joao", "da Silva", 1985 );
        Pessoa p3 = new Pessoa( "Maria", "da Silva", 1990 );

        // uma referência chamada p4 para o record referenciado por p1
        Pessoa p4 = p1;

        // invoca o toString
        System.out.println( p1 );

        // get do nome
        System.out.println( p1.nome() );

        // get do sobrenome
        System.out.println( p1.sobrenome() );

        // get do ano de nascimento
        System.out.println( p1.anoNascimento() );

        System.out.println( "p1 igual a p2? " + p1.equals( p2 ) );
        System.out.println( "p1 igual a p3? " + p1.equals( p3 ) );
        System.out.println( "p1 igual a p4? " + p1.equals( p4 ) );
        System.out.println( "p2 igual a p3? " + p2.equals( p3 ) );
        System.out.println( "p1 == p2? " + ( p1 == p2 ) );
        System.out.println( "p1 == p3? " + ( p1 == p3 ) );
        System.out.println( "p1 == p4? " + ( p1 == p4 ) );
        System.out.println( "p2 == p3? " + ( p2 == p3 ) );

    }

}
