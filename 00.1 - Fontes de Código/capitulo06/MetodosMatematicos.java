/*
 * Arquivo: capitulo06/MetodosMatematicos.java
 * Autor: Prof. Dr. David Buzatto
 */

public class MetodosMatematicos {

    public static void main( String[] args ) {

        /* 
         * A classe Math está contida no pacote java.lang,
         * não havendo necessidade de ser importada, visto que
         * todas as classes desse pacote são importadas automaticamente
         */

        // constante matemática PI: Math.PI
        
        System.out.println( "**** modulo (valor absoluto) ****" );

        // método Math.abs: retorna o valor absoluto de um valor numérico
        System.out.printf( "Math.abs(+3)   = %d\n", Math.abs(+3) );
        System.out.printf( "Math.abs(-3)   = %d\n", Math.abs(-3) );
        System.out.printf( "Math.abs(+3.5) = %.2f\n", Math.abs(+3.5) );
        System.out.printf( "Math.abs(-3.5) = %.2f\n\n", Math.abs(-3.5) );

        /* 
         * Perceba que as funções matemáticas implementadas nos métodos
         * da classe Math possuem diversas versões para lidar com vários
         * tipos numéricos.
         */

        
        System.out.println( "**** minimo e maximo ****" );

        // método Math.min: retorna o menor valor entre dois valores.
        System.out.printf( "Math.min(2, 1)     = %d\n", Math.min(2, 1) );
        System.out.printf( "Math.min(2.5, 1.1) = %.2f\n",
                Math.min(2.5, 1.1) );

        // método Math.max: retorna o maior valor entre dois valores.
        System.out.printf( "Math.max(2, 1)     = %d\n", Math.max(2, 1) );
        System.out.printf( "Math.max(2.5, 1.1) = %.2f\n\n",
                Math.max(2.5, 1.1) );


        System.out.println( "**** potenciacao e radiciacao ****" );

        // método Math.pow (power): eleva uma base a um expoente
        System.out.printf( "Math.pow(2, 10)        = %.2f\n",
                Math.pow(2, 10) );
        System.out.printf( "Math.pow(1024, 1.0/10) = %.2f\n",
                Math.pow(1024, 1.0/10) );

        /*
         * Método Math.sqrt (square root): calcula a raiz quadrada de um
         * valor numérico.
         */
        System.out.printf( "Math.sqrt(100)         = %.2f\n",
                Math.sqrt(100) );

        /*
         * Método Math.cbrt (cube root): calcula a raiz cúbica de um valor
         * numérico.
         */
        System.out.printf( "Math.cbrt(729)         = %.2f\n\n",
                Math.cbrt(729) );


        System.out.println( "**** metodos trigonometricos ****" );

        /*
         * Método Math.sin (sine): calcula o seno de um ângulo com medida
         * em radianos.
         */
        // Math.PI/6 = 30 graus
        System.out.printf( "Math.sin(pi/6) = %.2f\n", Math.sin(Math.PI/6));

        /*
         * Método Math.cos (cosine): calcula o cosseno de um ângulo com
         * medida em radianos.
         */
        // Math.PI/3 = 60 graus
        System.out.printf( "Math.cos(pi/3) = %.2f\n", Math.cos(Math.PI/3));

        /*
         * Método Math.tan (tangent): calcula a tangente de um ângulo com
         * medida em radianos.
         */
        // Math.PI/4 = 45 graus
        System.out.printf( "Math.tan(pi/4) = %.2f\n\n", Math.tan(Math.PI/4));


        System.out.println( "**** metodos trigonometricos " + 
                            "inversos (funcoes arco) ****" );

        /*
         * Método Math.asin (arcsine): calcula o grau em radianos de um
         * seno.
         */
        System.out.printf( "Math.asin(0.5) = %.2f radianos => %.2f graus\n",
                Math.asin(0.5), 180/Math.PI * Math.asin(0.5) );

        /*
         * Método Math.acos (arccosine): calcula o grau em radianos de
         * um cosseno.
         */
        System.out.printf( "Math.acos(0.5) = %.2f radianos => %.2f graus\n",
                Math.acos(0.5), 180/Math.PI * Math.acos(0.5) );

        /*
         * Método Math.atan (arctangent): calcula o grau em radianos
         * de uma tangente.
         */
        System.out.printf( 
                "Math.atan(1)   = %.2f radianos => %.2f graus\n\n",
                Math.atan(1), 180/Math.PI * Math.atan(1)
        );

        /*
         * Método Math.hypot (hypotenuse): calcula o valor da hipotenusa
         * com base no valor dos dois catetos.
         */
        System.out.printf( "Math.hypot(3, 4) = %f\n", Math.hypot(3, 4) );

        /*
         * Método Math.atan2 (arctangent2): obtém o ângulo de uma
         * coordenada cartesiana.
         */
        System.out.printf( "Math.atan2(4, 3) = (3; 4) cartesiano " );
        System.out.printf( "corresponde a (%.2f, %.2f) polar\n",
                Math.hypot(4, 3), Math.atan2(4, 3) );
        System.out.printf( "                   note que %.2f radianos => ",
                Math.atan2(4, 3) );
        System.out.printf( 
                "%.2f graus\n\n", 180/Math.PI * Math.atan2(4, 3)
        );


        System.out.println( "**** conversao entre graus e radianos ****" );

        /*
         * Método Math.toDegrees: converte um valor expresso em radianos
         * para graus.
         */
        System.out.printf( "Math.toDegrees(pi/3) = %.2f graus\n",
                Math.toDegrees(Math.PI/3) );

        /*
         * Método Math.toRadians: converte um valor expresso em graus
         * para graus.
         */
        System.out.printf( "Math.toRadians(60)   = %f radianos\n\n",
                Math.toRadians(60) );


        System.out.println( "**** metodos de arredondamento ****" );

        /*
         * Método Math.ceil: arredonda um número decimal para o maior
         * inteiro mais próximo.
         */
        System.out.printf( "Math.ceil(+2.4)  =  %.2f\n", Math.ceil(2.4) );
        System.out.printf( "Math.ceil(-2.4)  = %.2f\n\n", Math.ceil(-2.4) );

        /*
         * Método Math.floor: arredonda um número decimal para o menor
         * inteiro mais próximo.
         */
        System.out.printf( "Math.floor(+2.7) =  %.2f\n", Math.floor(2.7) );
        System.out.printf( "Math.floor(-2.7) = %.2f\n\n", Math.floor(-2.7) );

        // método Math.round: arredonda para o inteiro mais próximo
        System.out.printf( "Math.round(+2.3) =  %d\n", Math.round(2.3) );
        System.out.printf( "Math.round(+2.5) =  %d\n", Math.round(2.5) );
        System.out.printf( "Math.round(+2.7) =  %d\n", Math.round(2.7) );
        System.out.printf( "Math.round(-2.3) = %d\n", Math.round(-2.3) );
        System.out.printf( "Math.round(-2.5) = %d\n", Math.round(-2.5) );
        System.out.printf( "Math.round(-2.7) = %d\n", Math.round(-2.7) );

        /* 
         * Não existe um método para remover a parte de decimal de um 
         * número, mas podemos fazer isso usando uma conversão
         * explícita de tipos chada de cast ou coerção.
         */
        System.out.printf( "+2.7 truncado    =  %d\n", (int) 2.7 );
        System.out.printf( "-2.7 truncado    = %d\n\n", (int) -2.7 );


        System.out.println( "**** geracao de numeros aleatorios ****" );

        /*
         * Método Math.random: retorna um valor decimal no intervalo [0, 1[.
         */
        System.out.printf( "Math.random() = %f\n", Math.random() );
        System.out.println( "Intervalos:" );
        System.out.printf( "    [0, 10[ = %d\n",
                (int) ( Math.random() * 10 ) );
        System.out.printf( "    [0, 10] = %d\n",
                (int) ( Math.random() * 11 ) );

        /*
         * Para gerar valores em intervalos personalizados precisamos
         * usar um pouco de álgebra.
         */
        int inicio = 5;
        int fim = 10;
        System.out.printf( "    [%d, %d[ = %d\n", inicio, fim,
                inicio + (int) ( Math.random() * ( fim - inicio ) ) );
        System.out.printf( "    [%d, %d] = %d", inicio, fim,
                inicio + (int) ( Math.random() * ( fim - inicio + 1 ) ) );

    }

}
