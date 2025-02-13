/* 
 * Arquivo: capitulo01/EntradaSaidaPadraoFormatadosSaida.java
 * Autor: Prof. Dr. David Buzatto
 */
 
public class EntradaSaidaPadraoFormatadosSaida {

    public static void main( String[] args ) {
        
        // comentários de múltiplas linhas iniciam com /* e terminam com */
        
        /* 
         * O método print direciona o texto inserido (entre aspas duplas)
         * para a saída padrão, sem pular linha ao final.
         * 
         * O caractere \ (contra barra) é usado para "escapar" caracteres
         * especiais. Os principais são \n e \t servindo, respectivamente,
         * para pular uma linha do console e continuar a saída de texto
         * no ínicio da próxima linha e para inserir um caractere de
         * tabulação.
         */
        System.out.print( "Um texto!\n" );
        System.out.print( "Outro texto, na linha de baixo!\n" );
        System.out.print( "\tEssa linha inicia tabulada!" );

    }
    
}