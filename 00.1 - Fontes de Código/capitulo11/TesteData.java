/*
 * Arquivo: capitulo11/TesteData.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Agora nós vamos testar a classe Data. Tendo as duas classes no mesmo
 * diretório, ao compilarmos esta classe, a classe Data também será
 * compilada automaticamente. Não estamos preocupados, por enquanto,
 * em como as classes podem ser organizadas em pacotes. Basta que você as
 * defina no mesmo diretório que, para o que precisamos no momento, bastará.
 */

public class TesteData {
    
    public static void main( String[] args ) {

        /*
         * Declaração de uma variável local do tipo Data chamada d1
         * inicializando-a com um novo objeto do tipo Data, instanciado
         * usando o operador new e o construtor padrão.
         */
        Data d1 = new Data();

        /*
         * Declaração de uma variável local do tipo Data chamada d2
         * inicializando-a com um novo objeto do tipo Data, instanciado
         * usando o operador new e o construtor padrão que recebe como
         * parâmetro o dia, o mês e o ano.
         */
        Data d2 = new Data( 25, 2, 1985 );

        /*
         * Declaração de uma variável local do tipo Data chamada d3
         * inicializando-a com um novo objeto do tipo Data, instanciado
         * usando o operador new e o construtor padrão que recebe como
         * parâmetro o dia, o mês e o ano, mas usando valores incorretos.
         */
        Data d3 = new Data( 40, 14, 2022 );

        /*
         * Usando o método toString para obter uma representação textual
         * dos objetos criados.
         * 
         * Note que, ao concatenarmos uma String com um objeto, o método
         * toString será invocado implicitamente, não havendo a necessidade
         * de chamá-lo explicitamente.
         */
        System.out.println( "d1: " + d1.toString() );
        System.out.println( "d2: " + d2 );
        System.out.println( "d3: " + d3 );

        /*
         * Para terminar esse exemplo, vamos pensar no seguinte: e se
         * quiséssemos acessar cada atributo da classe Data separadamente? 
         * Ou seja, queremos usar o dia para realizar algum cálculo, ou
         * simplesmente para exibí-lo. Como faríamos? 
         * 
         * No estado que nossa implementação está ainda não conseguimos
         * fazer isso, o que acaba tornando nossa Data algo quase inútil,
         * mas iremos começar a sanar isso logo logo.
         * 
         * Por enquanto estamos preocupados em criar novas classes com
         * seus atributos e inicializar tais valores. Uma coisa de cada vez.
         */

    }

}