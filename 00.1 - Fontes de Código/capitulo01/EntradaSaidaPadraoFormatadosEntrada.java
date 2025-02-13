/* 
 * Arquivo: capitulo01/EntradaSaidaPadraoFormatadosEntrada.java
 * Autor: Prof. Dr. David Buzatto
 */

// importa a classe Scanner do pacote java.util para ser utilizada
import java.util.Scanner;

public class EntradaSaidaPadraoFormatadosEntrada {

    public static void main( String[] args ) {
    
       /* 
        * Para realizar a entrada de dados em um programa
        * pelo dispositivo de entrada padrão configurado no sistema
        * operacional (usualmente o teclado) usa-se a classe Scanner.
        *
        * Um objeto dessa essa classe será "ligado" ao fluxo de
        * entrada padrão do processo e, através desse objeto,
        * processaremos os dados que serão fornecidos, convertendo-os
        * para os tipos apropriados.
        */
        
        char primeiraLetra;
        int idade;
        double peso;
        double altura;
        double imc;

        /* 
         * Declara uma variável do tipo Scanner, chamada scan
         * e a inicializa com um novo objeto do tipo Scanner
         * ligado ao fluxo de entrada padrão do processo (System.in)
         */
        Scanner scan = new Scanner( System.in );
        
        System.out.printf( "Entre com sua idade: " );

        /* 
         * Para evitar problemas, por enquanto sempre leremos
         * uma linha INTEIRA do Scanner e então converteremos
         * esses dados lidos. A leitura da linha é feita através
         * do método nextLine().
         * 
         * Perceba que na linha abaixo, usamos o método parseInt
         * da classe empacotadora Integer para converter o texto
         * lido através do método nextLine(), do objeto do tipo
         * Scanner, para um valor inteiro. 
         */
        idade = Integer.parseInt( scan.nextLine() );
        
        System.out.printf( "Entre com seu peso: " );

        /* 
         * Na linha abaixo, usamos o método parseDouble
         * da classe empacotadora Double para converter o texto
         * lido através do método nextLine(), do objeto do tipo
         * Scanner, para um valor decimal. A entrada dos dados
         * deve ser feita usando o ponto (.) como separador decimal.
         */
        peso = Double.parseDouble( scan.nextLine() );
        
        System.out.printf( "Entre com sua altura: " );
        altura = Double.parseDouble( scan.nextLine() );

        System.out.printf( 
                "Entre com a primeira letra de seu primeiro nome: "
        );

        /* 
         * Para a leitura de um caractere, basta pegarmos o
         * primeiro caractere da linha lida.
         */
        primeiraLetra = scan.nextLine().charAt( 0 );
        
        imc = peso / ( altura * altura );
        
        System.out.printf( "%c (idade %d), seu IMC é: %.2f",
                primeiraLetra, idade, imc );

        /* 
         * Após o uso do Scanner, precisamos liberar os recursos
         * alocados à ele, nesse caso, a entrada padrão. Como
         * nossos programas serão simples e não ficarão ocupando
         * tal recurso por muito tempo, podemos omitir a linha
         * abaixo nos exercícios, pois ao terminar a execução
         * do método main, a máquina virtual Java será finalizada
         * e quaisquer recursos ocupados por ela serão liberados.
         */
        scan.close();

    }
    
}