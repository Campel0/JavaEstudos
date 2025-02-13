/* 
 * Arquivo: capitulo09/ArquivosLeituraTodasLinhas.java
 * Autor: Prof. Dr. David Buzatto
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArquivosLeituraTodasLinhas {

    public static void main( String[] args ) {

        String dadosLinha;
        File arquivo = new File( "arquivoDados.txt" );

        try {

            Scanner scan = new Scanner( arquivo );

            // lê o arquivo, linha por linha, e imprime na tela
            while ( scan.hasNextLine() ) {
                dadosLinha = scan.nextLine();
                System.out.println( dadosLinha );
            }

            scan.close();

        } catch ( FileNotFoundException exc ) {
            System.out.printf( "O arquivo nao existe!" );
        }
    }
}
