/*
 * Arquivo: capitulo04/ArraysUnidimensionaisEntradaDados.java
 * Autor: Prof. Dr. David Buzatto
 */

import java.util.Scanner;

public class ArraysUnidimensionaisEntradaDados {

    public static void main( String[] args ) {

        // declaração de um array de inteiros de 5 posições
        int[] array = new int[5];
        Scanner scan = new Scanner( System.in );

        // lista os dados do array (inicializados com 0)
        for ( int i = 0; i < array.length; i++ ) {
            System.out.print( array[i] + " " );
        }
        System.out.println();

        // inserção dos dados
        for ( int i = 0; i < array.length; i++ ) {
            System.out.printf( "Entre com o valor da posicao %d: ", i );
            array[i] = Integer.parseInt( scan.nextLine() );
        }

        System.out.print( "Dados inseridos: " );
        for ( int i = 0; i < array.length; i++ ) {
            System.out.print( array[i] + " " );
        }
        
        scan.close();
        
    }

}
