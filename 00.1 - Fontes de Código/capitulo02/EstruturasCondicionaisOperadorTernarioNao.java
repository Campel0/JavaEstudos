/* 
 * Arquivo: capitulo02/EstruturasCondicionaisOperadorTernarioNao.java
 * Autor: Prof. Dr. David Buzatto
 */
 
public class EstruturasCondicionaisOperadorTernarioNao {

    public static void main( String[] args ) {

        int n = 20;
        
        /* 
         * n é par e menor que zero? retorna 1, caso contrário, 0
         * n é ímpar e maior que zero? retorna 1, caso contrário, 0
         */
        int v = n % 2 == 0 ? n < 0 ? 1 : 0 : n > 0 ? 1 : 0;
        
        // correspondente usando if
        if ( n % 2 == 0 ) {
            if ( n < 0 ) {
                v = 1;
            } else {
                v = 0;
            }
        } else {
            if ( n > 0 ) {
                v = 1;
            } else {
                v = 0;
            }
        }

        System.out.println( v );
    
    }
    
}