/* 
 * Arquivo: capitulo09/ArquivosAberturaLeitura.java
 * Autor: Prof. Dr. David Buzatto
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArquivosAberturaLeitura {

    public static void main( String[] args ) {

        String dadosLinha;
        int inteiro;
        double decimal;

        /* 
         * Uma referência para o arquivo contido no mesmo diretório
         * em que a JVM está executando.
         */
        File arquivo = new File( "arquivoDados.txt" );

        // tentaremos processar o arquivo.
        try {

            /* 
             * Usaremos um Scanner para processar o arquivo.
             * o construtor utilizado, ou seja, o que recebe um arquivo
             * como parâmetro lança uma exceção checada caso o arquivo não
             * exista. Essa exceção (FileNotFoundException) precisa ser
             * tratada no nosso caso.
             */
            Scanner scan = new Scanner( arquivo );

            // lê uma linha do arquivo três vezes e a imprime
            for ( int i = 0; i < 3; i++ ) {
                dadosLinha = scan.nextLine();
                System.out.println( "Linha lida: " + dadosLinha );
            }

            // lê um inteiro do arquivo
            inteiro = Integer.parseInt( scan.nextLine() );
            System.out.printf( "Inteiro lido: %d\n", inteiro );

            // mais uma linha!
            dadosLinha = scan.nextLine();
            System.out.println( "Linha lida: " + dadosLinha );

            // lê um double do arquivo
            decimal = Double.parseDouble( scan.nextLine() );
            System.out.printf( "Decimal lido: %f\n", decimal );

            // verifica se chegou no fim do arquivo
            System.out.printf( "Fim do arquivo? %s\n", 
                    scan.hasNextLine() ? "sim" : "nao" );

            // mais uma linha!
            dadosLinha = scan.nextLine();
            System.out.println( "Linha lida: " + dadosLinha );

            /* 
             * Nesse ponto, devido aos dados do arquivo, não há
             * mais dados para serem lidos!
             */
            System.out.printf( "Fim do arquivo? %s\n", 
                    scan.hasNextLine() ? "sim" : "nao" );

            // fechando o Scanner que está lendo o arquivo, liberando-o 
            scan.close();

        } catch ( FileNotFoundException exc ) {
            System.out.printf( "O arquivo nao existe!" );
        }
    }
}
