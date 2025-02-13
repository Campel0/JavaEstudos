/* 
 * Arquivo: capitulo11/TestePessoa.java
 * Autor: Prof. Dr. David Buzatto
 */
public class TestePessoa {
    
    public static void main( String[] args ) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa( "David", "Buzatto", 104.5 );

        System.out.println( p1 );
        System.out.println( p2 );

    }

}