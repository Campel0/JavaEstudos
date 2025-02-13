/* 
 * Arquivo: capitulo09/ArquivosEscrita.java
 * Autor: Prof. Dr. David Buzatto
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArquivosEscrita {

    public static void main( String[] args ) {

        String dados;
        int inteiro;
        double decimal;
        File arquivo = new File( "arquivoEscrita.txt" );

        try {

            Scanner scan = new Scanner( System.in );
            PrintWriter pw = new PrintWriter( arquivo );

            System.out.print( "Entre um uma frase: " );
            dados = scan.nextLine();

            System.out.println( "Escrevendo no arquivo..." );

            // escrevendo no arquivo o que foi lido da entrada
            pw.print( dados );

            // escreve no arquivo um caractere
            pw.print( '\n' );

            // escreve no arquivo uma string pulando linha
            pw.println( "mais uma linha para o arquivo!" );


            System.out.print( "Entre com um inteiro: " );
            inteiro = Integer.parseInt( scan.nextLine() );

            System.out.print( "Entre com um decimal: " );
            decimal = Double.parseDouble( scan.nextLine() );

            // escreve o inteiro e o decimal no arquivo
            pw.print( inteiro );
            pw.print( '\n' );
            pw.print( decimal );

            pw.close();
            scan.close();

        } catch ( FileNotFoundException exc ) {
            System.out.printf( "O arquivo nao existe!" );
        }

        // imprimindo dados
        imprimeConteudo( arquivo );

    }

    public static void imprimeConteudo( File arquivo ) {

        try {

            Scanner scan = new Scanner( arquivo );

            while ( scan.hasNextLine() ) {
                System.out.println( scan.nextLine() );
            }

            scan.close();

        } catch ( FileNotFoundException exc ) {
            System.out.printf( "O arquivo nao existe!" );
        }
    }
}
