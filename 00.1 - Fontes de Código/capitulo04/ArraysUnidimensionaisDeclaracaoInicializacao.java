/*
 * Arquivo: capitulo04/ArraysUnidimensionaisDeclaracaoInicializacao.java
 * Autor: Prof. Dr. David Buzatto
 */

public class ArraysUnidimensionaisDeclaracaoInicializacao {

    public static void main( String[] args ) {

        // definição de constante
        final int N = 2;

        /*
         * Na linguagem Java, a convenção para nomear
         * constantes é a de usar apenas letras maiúsculas
         * e/ou dígitos. Para constantes onde o identificador
         * precisa de mais de uma palavra, essas palavras são
         * separadas usando o caractere underscore (_)
         */
        
        /* 
         * Declaração de uma variável do tipo array de inteiros
         * e inicialização com um novo objeto do tipo array de
         * inteiros de 5 posições.
         */
        int[] array1 = new int[5];

        /* 
         * Todo array, quando não especificado, tem os valores
         * de suas posições inicializados com o valor padrão
         * do tipo primitivo que ele contém ou um valor nulo
         * (null) caso o tipo seja de referência.
         * 
         * Valores padrão:     tipo | valor
         *                     byte |   0
         *                    short |   0
         *                      int |   0
         *                     long |   0
         *                     char |  '\0'
         *                    float |  0.0
         *                   double |  0.0
         *                  boolean |  false
         *               referência |  null
         */
        
        // declarando um array e inicializando com valores 2
        // valor inicializado = { 2, 2, 2, 2, 2 }
        int[] array2 = new int[]{ 2, 2, 2, 2, 2 };

        // declarando um array e inicializando com valores 3
        // valor inicializado = { 3, 3, 3, 3, 3 }
        int[] array3 = { 3, 3, 3, 3, 3 };

        // declaração de um array de inteiros de N posições
        int[] array4 = new int[N];

        /* 
         * Todo array possui uma propriedade chamada length 
         * (comprimento) que é inicializada com o tamanho
         * do array durante a criação do objeto.
         */
        for ( int i = 0; i < array1.length; i++ ) {
            System.out.print( array1[i] + " " );
        }
        System.out.println();

        for ( int i = 0; i < array2.length; i++ ) {
            System.out.print( array2[i] + " " );
        }
        System.out.println();

        for ( int i = 0; i < array3.length; i++ ) {
            System.out.print( array3[i] + " " );
        }
        System.out.println();

        for ( int i = 0; i < array4.length; i++ ) {
            System.out.print( array4[i] + " " );
        }

    }

}
