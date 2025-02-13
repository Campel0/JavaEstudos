/*
 * Arquivo: capitulo15/TesteData.java
 * Autor: Prof. Dr. David Buzatto
 */

import java.util.Arrays;

public class TesteData {

    public static void main( String[] args ) {

        Data d1 = new Data( 1, 2, 1990 );
        Data d2 = new Data( 25, 2, 1985 );

        System.out.println( "Comparando datas:" );

        int comparacao = d1.compareTo( d2 );
        if ( comparacao < 0 ) {
            System.out.println( d1 + " < " + d2 );
        } else if ( comparacao > 0 ) {
            System.out.println( d1 + " > " + d2 );
        } else { // comparacao == 0
            System.out.println( d1 + " == " + d2 );
        }
        System.out.println();


        System.out.println( "Ordenando datas:" );
        
        Data[] datas = {
            new Data( 2, 1, 1980 ),
            new Data( 7, 7, 2023 ),
            new Data( 18, 5, 1960 ),
            new Data( 25, 7, 2015 )
        };

        System.out.println( "          Datas: " + Arrays.toString( datas ) );

        // ordena
        Arrays.sort( datas );

        System.out.println( "Datas ordenadas: " + Arrays.toString( datas ) );

    }

}