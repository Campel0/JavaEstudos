/*
 * Arquivo: capitulo11/Data.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Em Java, assim como nas linguagens Orientadas a Objetos, a unidade
 * básica de programação é chamada de Classe.
 * 
 * Uma classe, fazendo um paralelo com o mundo real, seria como
 * uma planta de uma casa. A planta contém as informações básicas
 * de como será uma casa construída usando aquela planta, ou seja,
 * a medida das paredes, a altura do piso em relação ao terreno, onde
 * passarão as redes de água, esgoto, elétrica, lógica, gás etc.
 * 
 * Sendo assim, ao se usar a planta como um modelo, constroi-se uma ou
 * mais casas. Claro que aqui estamos tratando do assunto de forma um
 * pouco mais abstrata, pois na realidade precisaríamos de mais de um
 * projeto para registrar na prefeitura da cidade etc., mas acredito que
 * você tenha entendido até aqui.
 * 
 * Voltando às Classes e à nossa analogia, uma classe contém as "instruções"
 * de como objetos criados ou instanciados a partir dela se comportarão, ou
 * seja, quais suas operações (ou métodos) e quais serão suas caracte-
 * rísticas (ou atributos). Existem diversos outros conceitos atrelados ao
 * que é uma classe nas linguagens de programação Orinetadas a Objetos, mas
 * por enquanto, isso nos basta. Agora vamos partir para detalhes inerentes
 * à linguagem Java.
 * 
 * Cada arquivo de código fonte precisa conter pelo menos uma classe.
 * Usualmente definimos uma classe pública por arquivo e essa classe,
 * por ser pública, precisa, obrigatoriamente, ter o mesmo nome do
 * arquivo ou vice-versa.
 * 
 * Toda classe pública poderá ser usada dentro dos arquivos de código
 * do projeto em que ela foi criada para criarmos variáveis do tipo
 * daquela classe. Esses tipos que conseguimos criar a partir da definição
 * de novas classes são chamados de Tipos Abstratos de Dados (TAD).
 * 
 * Nomeamos nossas classes sempre usando CamelCase e iniciamos o nome
 * das mesmas sempre usando letra maiúscula. Usualmente, uma classe
 * representa uma "coisa" do mundo real, sendo assim, seu nome normalmente
 * será um substantivo.
 * 
 * No arquivo Data.java temos a classe pública Data que representa
 * uma data do mundo real. Podemos representar uma data de algumas formas,
 * mas talvez a mais fácil de entender seja armazenarmos três valores
 * inteiros: um para o dia, um para o mês e um para o ano.
 */
public class Data {

    /*
     * Em Java, normalmente, no início do código da classe, declaramos
     * seus atributos. Como dito anteriormente, a classe Data tem os
     * atributos dia, mês e ano. Os atributos, quando declarados SEM usar
     * a palavra chava static, são chamados de atributos de instância
     * e fazem parte de um tipo maior de elementos chamados de membros de
     * instância. Também podemos chamar esses atributos de variáveis
     * de instância, visto que esses atributos só existirão a partir do
     * momento que novos objetos dessa classe forem criados, por isso seus
     * nomes são "de instância" (de objeto).
     * 
     * Usualmente os atributos são marcados como privados (private), ou
     * seja, só são acessíveis (ou enxergados) dentro da própria classe. 
     * De forma contrária, quando marcamos membros como públicos (public),
     * os membros da classe poderão ser acessados por qualquer parte de
     * qualquer código que use a nossa classe. A ideia de marcar atributos
     * como privados e criar formas de acessá-los tem a ver com o conceito
     * de Encapsulamento, que iremos abordar das próximas aulas com mais
     * detalhes.
     */

    // declaração do atributo inteiro privado "dia"
    private int dia;
    private int mes;
    private int ano;

    /* 
     * Atributos de instância recebem valores padrão quando objetos das
     * classes que os contém são criados, da mesma forma que elementos
     * de arrays são inicializados na criação de novos arrays, ou seja:
     * 
     * Valores padrão:     tipo | valor
     *                     byte |   0
     *                    short |   0
     *                      int |   0
     *                     long |   0
     *                     char |  '\0'
     *                    float |  0.0
     *                   double |  0.0
     *                  boolean |  false
     *               referência |  null
     */

    /*
     * Toda classe conterá pelo menos um construtor. Os construtores
     * são responsáveis em preparar os atributos de instância da classe
     * de modo que estejam em um estado válido, trazendo também, por 
     * consequência o validado do estado do objeto que foi construido.
     * 
     * Os construtores se assemelham aos métodos, mas não possuem tipo de
     * retorno. Outro detalhe é que construtores NÃO SÃO MÉTODOS!
     * 
     * O construtor que não tem parâmetros é chamado de construtor padrão
     * e, caso não o forneçamos nenhum construtor para a classe, o
     * compilador da linguagem Java se encarregará de criá-lo para nós.
     * Se por algum motivo definirmos algum construtor diferente do
     * padrão e precisarmos do construtor padrão além do outro ou outros
     * que criamos, o compilador não fornecerá o construtor padrão, sendo
     * nossa responsabilidade o definir.
     * 
     * Usualmente construtores são públicos.
     */
    public Data() {

        /*
         * Todo construtor, implicitamente, invocará outros construtores
         * até que se chegue à classe mãe de todas as classes em Java
         * chamada de Object. Esse não é um detalhe essencial nesse momento,
         * mas é importante sabermos disso.
         * 
         * Para a classe Data, sua superclasse, também implícita, já é a 
         * classe Object. Sendo assim, implicitamente, a primeira instrução
         * do construtor padrão da classe Data é:
         */
        super();

        /* 
         * A linha acima, como já dito, será inserida implicitamente pelo
         * compilador. Caso você remova a linha acima, você verá que sua
         * classe continua a ser compilada sem problema.
         * 
         * Os conceitos de superclasse (classe mãe), subclasse (classe
         * filha) etc. serão tratados no Capítulo de Herança e Polimorfismo.
         */

        /*
         * Agora temos a chance de inicializarmos os atributos da classe
         * com valores que são válidos de acordo com os requisitos de
         * implementação da mesma classe. Caso não o façamos, tanto dia,
         * quanto mes, quanto ano receberão o valor 0. Podemos dizer que
         * uma data válida é o dia primeiro do mês de janeiro do ano de
         * 1970.
         */
        dia = 1;
        mes = 1;
        ano = 1970;

    }

    /* 
     * Como dito, podemos ter mais de um construtor. Agora definiremos um
     * construtor com três parâmetros que permitirá que, quando criarmos
     * objetos da classe Data, possamos fornecer valores iniciais para seus
     * três atributos.
     */
    public Data( int dia, int mes, int ano ) {

        /*
         * Note que agora temos no construtor três parâmetros com os mesmos
         * nomes dos atributos. Em Java isso é permitido, pois há como 
         * resolvermos esse conflito de nomes, chamado tecnicamente de 
         * "shadowing" (sombreamento), pois ainda conseguimos diferenciar
         * atributos de instância de parâmetros de construtores e/ou
         * métodos.
         * 
         * Fazemos isso precedendo os atributos de instância com a palavra-
         * chave "this" (esse), dizendo explicitamente que queremos lidar
         * com determinado atributo desse objeto.
         */
        this.dia = dia;

        /*
         * Na linha acima, é atribuído do valor do parâmetro dia ao atributo
         * dia do objeto (this.dia). Obviamente, poderíamos diferenciar o
         * nome do parâmetro para talvez "d", então o código poderia ter
         * ficado assim:
         * 
         * this.dia = d;
         * 
         * ou simplesmente
         * 
         * dia = d;
         * 
         * Note que como não haveria mais a colisão de nomes entre atributo
         * e parâmetro, não haveria mais a necessidade de diferenciar quem
         * é da instância de quem não é. Note que isso foi feito no cons-
         * trutor padrão, visto que lá não houve conflito. Alguns progra-
         * madores optam por sempre preceder atributos de instância com
         * a palavra-chave this, mesmo em lugares onde não há necessidade.
         * 
         * Vamos agora inicializar cada um dos atributos faltantes.
         */
        this.mes = mes;
        this.ano = ano;

        /*
         * Nesse ponto, os atributos do objeto criado terá recebido os
         * valores fornecidos nos parâmetros do construtor. Note ainda que 
         * nada impede que quem usar a classe Data forneça valores que não
         * fazem sentido, como por exemplo, valores negativos ou valores
         * fora do intervalo de valores aceitáveis para os dias (1 a 31) e
         * meses (1 a 12). Ainda, os valores dos dias dependem do mês em
         * questão, pois podemos ter meses de 28, 29, 30 e 31 dias. Isso é
         * assunto para depois, por enquanto vamos assumir que vivemos num
         * mundo ideal e ninguém usaria valores errados para inicializar o
         * objeto.
         */

    }

    /*
     * Por fim, vamos fornecer à classe Data um método chamado toString.
     * Esse método, herdado da classe Object, é utilizado para criarmos
     * uma representação textual do objeto. No nosso caso, faremos ele
     * retornar os dados da data formatados da forma que usamos no Brasil,
     * ou seja, o dia, uma barra, o mês, outra barra e o ano.
     * 
     * Note que foi usada a anotação @Override nesse método, mas isso também
     * é assunto para depois. Por enquanto vamos assumir que precisamos
     * usá-la.
     */
    @Override
    public String toString() {
        return String.format( "%02d/%02d/%04d", dia, mes, ano );
    }

}