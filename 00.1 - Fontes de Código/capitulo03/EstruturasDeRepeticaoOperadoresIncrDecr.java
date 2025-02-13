/*
 * Arquivo: capitulo03/EstruturasDeRepeticaoOperadoresIncrDecr.java
 * Autor: Prof. Dr. David Buzatto
 */

public class EstruturasDeRepeticaoOperadoresIncrDecr {

    public static void main( String[] args ) {

        /* 
         * O funcionamento do operador unário de decremento (--)
         * é análogo ao operador unário de incremento (++).
         */
        int i = 0;

        System.out.println( i );   // imprime 0

        i++;  // incremento pós-fixado
        System.out.println( i );   // imprime 1

        ++i;  // incremento pré-fixado
        System.out.println( i );   // imprime 2

        /* 
         * Incremento pós-fixado em uma expressão:
         *     usa o valor, depois incrementa.
         */
        System.out.println( i++ ); // imprime 2
        System.out.println( i );   // imprime 3

        /* 
         * Incremento pré-fixado em uma expressão:
         *     incrementa depois usa o valor.
         */
        System.out.println( ++i ); // imprime 4
        System.out.println( i );   // imprime 4

    }

}
