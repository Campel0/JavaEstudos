/*
 * Arquivo: capitulo04/ArraysUnidimensionaisForMelhorado.java
 * Autor: Prof. Dr. David Buzatto
 */

public class ArraysUnidimensionaisForMelhorado {

    public static void main( String[] args ) {

        int[] array = { 2, 4, 6, 8, 10 };

        /* 
         * Além da estrutura de repetição for tradicional, existe
         * também na linguagem Java um outro tipo tipo de for
         * chamado de "enhanced for" (for melhorado) ou "for each".
         * 
         * Esse for é usado para iterar sobre coleções de itens iteráveis.
         * os arrays são estruturas iteráveis em Java, assim como outras
         * construções que veremos adiante e depois estudaremos
         * na disciplina de estruturas de dados.
         * 
         * Veja os trechos de código abaixo, onde ambos serão usados para
         * apresentar os dados do array criado acima.
         */
        System.out.println( "Usando o for melhorado: " );
        for ( int valor : array ) {
            // cada item de array será atribuído à valor a cada iteração
            System.out.print( valor + " " );
        }
        
        System.out.println();

        /* 
         * For tradicional escrito de forma a mostrar como o for melhorado 
         * funciona
         */
        System.out.println( "Usando o for tradicional: " );
        for ( int i = 0; i < array.length; i++ ) {
            int valor = array[i];
            System.out.print( valor + " " );
        }

        /* 
         * Perceba que o for melhorado é usado primariamente para 
         * processar cada elemento do array, item por item, em ordem,
         * mas sem se preocupar exatamente com a posição do mesmo.
         * 
         * No for tradicional, apesar de ter que escrever mais código, 
         * você tem acesso à posição, visto que é o objetivo da variável
         * i controlar esse processo.
         * 
         * Sendo assim, quando apenas quiser processar os elementos do
         * array e não precisar saber em qual posição está no momento,
         * o for melhorado basta e é mais enxuto. se precisar saber a 
         * posição atual do elemento, ai você vai precisar usar o for
         * tradicional. note também que, obviamente, você poderia ter
         * o controle da posição no for melhorado tendo uma variável
         * que inicia em zero e é incrementada a cada iteração, mas isso
         * acaba não sendo tão útil, visto que com o for tradicional você
         * já obtém esse comportamento.
         */

    }

}
