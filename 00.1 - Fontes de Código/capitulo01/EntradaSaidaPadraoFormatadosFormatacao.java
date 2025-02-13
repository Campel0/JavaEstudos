/* 
 * Arquivo: capitulo01/EntradaSaidaPadraoFormatadosFormatacao.java
 * Autor: Prof. Dr. David Buzatto
 */

public class EntradaSaidaPadraoFormatadosFormatacao {

    public static void main( String[] args ) {
    
       /* 
        * O método printf é capaz de interpolar dados dentro
        * do texto (string) que irá imprimir na saída padrão.
        * seu funcionamento é similar ao da linguagem C.
        *
        * Para isso, é necessário marcar posições dentro da string
        * usando o caractere % (porcento) e utilizar um especificador
        * de formato específico para cada tipo de variável.
        *
        * Os specificadores de formato que serão usados por
        * enquanto são:
        *    %d: para variáveis inteiras (int)
        *    %c: para variáveis de caracteres (char)
        *    %f: para variáveis decimais (double)
        *
        * Alguns especificadores possuem opções de formatação.
        * por exemplo, para fixar a quantidade de casas decimais
        * que serão exibidas para uma variável double, usa-se:
        *     %.nf: onde "n" é a quantidade de casas decimais.
        *     Exemplo: %.2f => o valor da variável double
        *              será formatado usando duas casas decimais
        */
        
        double pi = 3.1415;
        double raio = 20.78;
        double circunferencia = 2 * pi * raio;
        double area = pi * raio * raio;
        
        System.out.printf( "O circulo de raio %f tem:\n", raio );
        System.out.printf( "\tCircunferencia = %.2f\n", circunferencia );
        System.out.printf( "\tArea = %.2f\n", area );
    
    }
    
}