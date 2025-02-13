/*
 * Arquivo: capitulo05/Arrays2DDeclaracaoInicializacao.java
 * Autor: Prof. Dr. David Buzatto
 */

public class Arrays2DDeclaracaoInicializacao {

    public static void main( String[] args ) {

        // definição de constantes
        final int M = 5;
        final int N = 2;

        /* 
         * Declaração de um array de duas dimensões de inteiros
         * e inicialização com um objeto do tipo array de duas
         * dimensões com 3 linhas e 2 colunas.
         */
        int[][] array1 = new int[3][2];

        /* 
         * Em Java, os arrays de mais de uma dimensão são na verdade
         * arrays de arrays. por exemplo, o array acima é um array de
         * três posições que contém, em cada uma delas, um array de duas
         * posições. Essa mesma ideia de aplica a arrays com mais dimensões
         */

        /* 
         * Declarando um array de dimensões 2x2 e inicializando
         * com valores 2
         * valor inicializado = { { 2, 2 },
         *                        { 2, 2 } }
         */
        int[][] array2 = { { 2, 2 }, { 2, 2 } };

        /* 
         * Declarando um array de dimensões 2x3 e inicializando
         * com valores
         * valor inicializado = { { 3, 3, 3 },
         *                        { 0, 0, 0 } }
         */
        int[][] array3 = new int[][]{ 
            new int[]{ 3, 3, 3 }, 
            new int[]{ 0, 0, 0 }
        };

        // declaração de um array de inteiros de dimensões MxN
        int[][] array4 = new int[M][N];


        /* 
         * i será usado normalmente para controlar a linha atual
         * e j será usado normalmente para controlar a coluna atual
         * em um array bidimensional.
         */

        for ( int i = 0; i < array1.length; i++ ) {
            for ( int j = 0; j < array1[i].length; j++ ) {
                System.out.print( array1[i][j] + " " );
            }
            System.out.println();
        }
        System.out.println();

        for ( int i = 0; i < array2.length; i++ ) {
            for ( int j = 0; j < array2[i].length; j++ ) {
                System.out.print( array2[i][j] + " " );
            }
            System.out.println();
        }
        System.out.println();

        for ( int i = 0; i < array3.length; i++ ) {
            for ( int j = 0; j < array3[i].length; j++ ) {
                System.out.print( array3[i][j] + " " );
            }
            System.out.println();
        }
        System.out.println();

        for ( int i = 0; i < array4.length; i++ ) {
            for ( int j = 0; j < array4[i].length; j++ ) {
                System.out.print( array4[i][j] + " " );
            }
            System.out.println();
        }

    }

}
