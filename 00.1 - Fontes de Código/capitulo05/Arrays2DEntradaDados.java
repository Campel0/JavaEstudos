/*
 * Arquivo: capitulo05/Arrays2DEntradaDados.java
 * Autor: Prof. Dr. David Buzatto
 */

import java.util.Scanner;

public class Arrays2DEntradaDados {

    public static void main( String[] args ) {

        // declaração de um array de inteiros de dimensões 2x3
        int[][] array = new int[2][3];
        Scanner scan = new Scanner( System.in );

        // lista os dados do array (inicializados com 0)
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                System.out.print( array[i][j] + " " );
            }
            System.out.println();
        }
        System.out.println();

        // inserção dos dados
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                System.out.printf( 
                        "Entre com o valor da posicao [%d][%d]: ", i, j );
                array[i][j] = Integer.parseInt( scan.nextLine() );
            }
        }

        System.out.println( "Dados inseridos:" );
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                System.out.print( array[i][j] + " " );
            }
            System.out.println();
        }

        scan.close();

    }

}
