/* 
 * Arquivo: capitulo01/EntradaSaidaPadraoFormatadosExcecoes.java
 * Autor: Prof. Dr. David Buzatto
 */

import java.util.Scanner;

public class EntradaSaidaPadraoFormatadosExcecoes {

    public static void main( String[] args ) {
    
       /* 
        * Na linguagem Java há um mecanismo de tratamento de exceções que
        * tem como objetivo "detectar" situações problemáticas durante
        * a execução do código de modo que, ao ser usado apropriadamente,
        * podemos, na maioria das vezes, escrever código que seja capaz
        * de se "recuperar" de tais situações.
        */
        
        int numeroInteiro;
        double numeroDecimal;
        Scanner scan = new Scanner( System.in );
        
        /*
         * Neste exemplo vamos forçar erros de formatação. Sempre que
         * estivermos usando os métodos "parse" das classes empacotadoras
         * pode ocorrer uma situação onde o usuário fornece os dados
         * esperados da forma incorreta. Por exemplo, fornecer uma letra
         * ou palavra ao invés de um número inteiro ou decimal, ou então
         * errar ao fornecer o valor de um número decimal trocando o
         * separador decimal esperado, que é o ponto por uma vírgula, que
         * é o separador que usamos no Brasil. Ou seja, o valor 1.75 deve
         * ser aceito, mas o valor 1,75 contém um erro em seu formato.
         */
        
         /*
          * O objetivo ao executar essa classe é realmente forçar os erros
          * para vermos o que acontecerá. Execute essa classe e forneça
          * um valor que NÃO representa um valor inteiro.
          */
        System.out.println( "Entre com um valor inteiro incorreto: " );
        numeroInteiro = Integer.parseInt( scan.nextLine() );

        // caso a exceção seja lançada, a próxima linha não será alcançada
        System.out.println( "Valor fornecido: " + numeroInteiro );

        /*
         * Ao fazer o que foi instruído, você deve ter visto algo assim
         * na saída:
         * 
         * Exception in thread "main" java.lang.NumberFormatException...
         * 
         * Veja que a JVM indicou que houve um caso excepcional na execução
         * do código, pois o que estava sendo esperado (um inteiro) não foi
         * fornecido. Para indicar isso, foi lançada uma exceção do tipo
         * NumberFormatException, ou seja, uma exceção que indica um formato
         * numérico incorreto.
         * 
         * Existem dois tipos de exceções na linguagem Java. As exceções 
         * checadas e as não checadas. A NumberFormatException é uma exceção
         * não checada, pois o programador não precisa obrigatoriamente
         * trata-la. Se nós estivermos lidando com a abertua de um arquivo
         * para podemos processá-lo (veremos isso mais adiante) normalmente
         * precisaremos tratar uma exceção checada chamada
         * FileNotFoundException, pois pode se que o arquivo que vai ser
         * lido talvez não exista mais no sistema de arquivos subjacente.
         * 
         * Mesmo que uma exceção não seja checada, podemos tratá-la e é isso
         * que faremos agora. Para isso, usamos a construção "try" (tente).
         * Existem diversas variações de como podemos utilizá-la, mas vamos
         * nos focar na forma mais usual.
         * 
         * Execute novamente essa classe e agora não force o erro anterior,
         * ou seja, forneça de fato um número inteiro, para que a execução
         * chegue nas próximas linhas. O fornecimento do valor decimal
         * que agora deve ser fornecido de forma incorreta.
         */
        try { // tente

            System.out.println( "Entre com um valor decimal incorreto: " );

            // converter o texto fornecido na entrada para um double
            numeroDecimal = Double.parseDouble( scan.nextLine() );

            // caso a exceção seja lançada, a próxima linha não será
            // alcançada
            System.out.println( "Valor fornecido: " + numeroDecimal );

            /* 
             * Caso algo dentro do bloco try lance a exceção
             * NumberFormatException, o catch (capturar) correspondente
             * "capturará" tal exceção e teremos a oportunidade de
             * recolocar o programa em um estado válido.
             */
        } catch ( NumberFormatException exc ) {

            System.out.println( "Formato incorreto fornecido!" );
            numeroDecimal = 0;

        }

        /*
         * Note que agora que aprendemos a usar tal construção, somos
         * capazes de tratar tais situações excepcionais. Nos nossos
         * exercícios não precisamos lidar com isso, mas no mundo real,
         * em muitas situações teremos que realizar tal tratamento.
         */

        scan.close();

    }
    
}