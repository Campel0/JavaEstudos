/* 
 * Arquivo: capitulo02/EstruturasCondicionaisOperadorTernarioIf.java
 * Autor: Prof. Dr. David Buzatto
 */
 
public class EstruturasCondicionaisOperadorTernarioIf {

    public static void main( String[] args ) {
    
        int n = 20;
        int v;
        
        // n é par? se sim, atribui 1 a v, caso contrário, atribui 0
        if ( n % 2 == 0 ) {
            v = 1;
        } else {
            v = 0;
        }

        System.out.println( v );

    }
    
}