/*
 * Arquivo: capitulo08/CaracteresStringsConceitosES.java
 * Autor: Prof. Dr. David Buzatto
 */

import java.util.Scanner;

public class CaracteresStringsConceitosES {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        // declarando uma variável do tipo String e a inicializando.
        String nomeCompleto = "David Buzatto";

        // declarando uma String sem inicializar
        String profissao;

        // um array de 5 Strings
        String[] conjuntoStrings = new String[5];

        /* 
         * Imprimindo as strings usando o especificador
         * de formato %s
         */
        System.out.printf( "%s\n", nomeCompleto );

        // imprimindo direto
        System.out.println( nomeCompleto );

        // uma string pode ser "quebrada" para fins de visibilidade.
        System.out.println(
                "Essa eh uma string que ficou feia no " +
                "codigo, pois eh muito comprida e " +
                "dificulta a leitura, entendeu?" );

        // a leitura de Strings é feita usando também a classe Scanner
        System.out.print( "Entre com sua profissao: " );
        profissao = scan.nextLine();
        System.out.println( "A profissao fornecida foi: " + profissao );

        for ( int i = 0; i < 5; i++ ) {
            System.out.printf( "conjuntoStrings[%d]: ", i );
            conjuntoStrings[i] = scan.nextLine();
        }

        for ( int i = 0; i < 5; i++ ) {
            imprimeCaixa( conjuntoStrings[i], 30 );
        }

        scan.close();

    }

    public static void imprimeCaixa( String str, int largura ) {

        int c = largura - 3 - str.length();

        System.out.print( "+" );
        for ( int i = 0; i < largura-2; i++ ) {
            System.out.print( "-" );
        }
        System.out.print( "+\n" );

        System.out.print( "| " + str );
        for ( int i = 0; i < c; i++ ) {
            System.out.print( " " );
        }
        System.out.print( "|\n" );

        System.out.print( "+" );
        for ( int i = 0; i < largura-2; i++ ) {
            System.out.print( "-" );
        }
        System.out.print( "+\n" );

    }

}
