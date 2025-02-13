/* 
 * Arquivo: capitulo01/EntradaSaidaPadraoFormatadosAritmetica.java
 * Autor: Prof. Dr. David Buzatto
 */

public class EntradaSaidaPadraoFormatadosAritmetica {

    public static void main( String[] args ) {
    
       /* 
        * Existem na linguagem Java cinco operadores aritméticos:
        *     +: adição
        *     -: subtração
        *     *: multiplicação
        *     /: divisão
        *     %: módulo (resto da divisão inteira)
        *
        * Esses operadores atuam de forma específica dependendo do
        * tipo numérico sendo operado. Isso se nota principalmente
        * em relação ao operador / (divisão) quando atuado em valores
        * inteiros e de ponto flutuante!
        *
        * O operador de resto/módulo que é dado pelo símbolo
        * % (porcento), é usado apenas para números inteiros.
        */
        
        int numeroInteiro1 = 9;
        int numeroInteiro2 = 2;
        double numeroDecimal1 = 9;
        double numeroDecimal2 = 2;
        
        // resulta em 4
        int divisaoInteira = numeroInteiro1 / numeroInteiro2;
        
        // resulta em 4.5
        double divisaoDecimal = numeroDecimal1 / numeroDecimal2;
        
        System.out.printf( "Inteiros: %d / %d = %d\n", 
                numeroInteiro1, numeroInteiro2, divisaoInteira );
        System.out.printf( "Decimais: %f / %f = %f\n", 
                numeroDecimal1, numeroDecimal2, divisaoDecimal );

    }
    
}