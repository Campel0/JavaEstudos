/*
 * Arquivo: capitulo12/Data.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Um dos conceitos importantes relacionados ao Paradigma Orientado a 
 * Objetos é o Encapsulamento. Como o próprio nome diz, o encapsulamento
 * tem como objetivo encapsular alguma coisa na nossa implementação, mas
 * o que seria essa coisa?
 * 
 * A ideia gira em torno do processo de esconder a implementação da classe
 * de seu cliente. Quando dizemos cliente, estamos nos referindo a quem
 * usa a classe em questão, ou seja, outras classes, que por sua vez
 * são escritas por outros programadores ou até nós mesmos.
 * 
 * O cliente da classe precisa saber apenas qual é a interface pública
 * da mesma, ou seja, quais são os membros públicos que podem ser acessados.
 * Como esses membros foram programados não é de responsabilidade do cliente
 * da classe. O desenvolvedor da classe, por sua vez, precisa garantir que
 * através da interface pública da mesma, o usuário não conseguirá colocar
 * objetos criados a partir dela em um estado inválido.
 * 
 * De forma análoga a um exemplo da vida real, podemos pensar em medicações.
 * Cada cápsula ou comprimido de um remédio é feito para ser consumido em
 * determinados intervalos de tempo por um determinado período. Nós sabemos
 * os componentes do remédio, temos ideia de para o que ele serve, mas não
 * sabemos exatamente quais são as vias metabólicas que serão ativadas ou
 * reprimidas no organismo que está recebendo aquela medicação. Veja, a
 * ideia é a mesma. Sabemos para que serve e como deve ser usado, mas não
 * precisamos saber exatamente como o remédio foi feito, desde que ele
 * funcione. 
 * 
 * No contexto da classe Data, um exemplo poderia ser um mês fora do
 * intervalo aceitável que é entre 1 e 12, ambos inclusivos. Há situações
 * onde queremos criar classes para representar tipos com o objetivo de
 * apenas transportar dados e, nesses casos, na maioria das vezes, não há
 * a necessidade de se usar o Encapsulamento de forma tão restritiva.
 * 
 * Nesse e nos próximos exemplos iremos lidar com um padrão da plataforma 
 * Java chamado Java Beans, onde a ideia é definir uma interface pública
 * com nomenclatura padronizada para que possamos encapsular principalmente
 * os atributos das nossas classes e, ao mesmo tempo, torná-las componentes
 * reutilizáveis. Há uma certa burocracia envolvida e existem assistentes
 * nas ferramentas de desenvolvimento que permitem a criação automática de
 * alguns trechos de código para nós, além de bibliotecas dedicadas a isso,
 * como a Lombok, mas primeiramente vamos ver e entender como é feito
 * manualmente.
 * 
 * Note ainda que Java Beans não é necessariamente sinônimo de 
 * Encapsulamento. Encapsulamento é um conceito mais abrangente do que uma
 * padronização da linguagem que estamos trabalhando. Por fim, o padrão
 * Java Beans ainda engloba diversas outras regras a serem seguidas, mas que
 * não veremos por enquanto.
 */
public class Data {

    // atributos privados
    private int dia;
    private int mes;
    private int ano;

    /**
     * Construtor padrão.
     */
    public Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    /**
     * Construtor com três parâmetros.
     * 
     * @param dia O dia da Data
     * @param mes O mês da Data
     * @param ano O ano da Data
     */
    public Data( int dia, int mes, int ano ) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /*
     * ********** métodos acessores ou getters (get) **********
     * 
     * Os métodos get (obter) têm a função de RETORNAR o valor de um
     * atributo, seja ele representado de fato por um atributo privado
     * da instância da classe, ou algo que foi calculado e retornado.
     * 
     * O usuário da classe não precisa saber qual ou quais atributos foram
     * usados para a obtenção do valor em questão.
     * 
     * No padrão Java Beans, cada atributo que queremos que seja exposto à 
     * leitura do cliente receberá um método get correspondente.
     * 
     * O padrão para definição dos métodos get é:
     * 
     * public tipo getNome(),
     * onde:
     *     O nome do método inicia obrigatoriamente com o prefixo get,
     *     seguido do nome do atributo que se quer acessar;
     *     O método é público;
     *     O tipo de retorno é o mesmo do atributo sendo retornado.
     */

    /**
     * Obtém o dia da Data em questão.
     * 
     * @return O dia da Data.
     */
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    /*
     * ********** métodos modificadores ou setters (set) **********
     * 
     * Os métodos set (modificar/colocar/determinar) têm a função de ALTERAR
     * o valor de um atributo, seja ele representado de fato por um atributo
     * privado da instância da classe, ou algo que será calculado.
     * 
     * O usuário da classe não precisa saber qual ou quais atributos foram
     * usados para modificação do valor em questão.
     * 
     * No padrão Java Beans, cada atributo que queremos que seja exposto à 
     * alteração do cliente receberá um método set correspondente.
     * 
     * O padrão para definição dos métodos set é:
     * 
     * public void setNome( tipo parametro ),
     * onde:
     *     O nome do método inicia obrigatoriamente com o prefixo set,
     *     seguido do nome do atributo que se quer alterar;
     *     O método é público;
     *     O método é void, pois a ideia é injetar um valor novo no objeto;
     *     Há obrigatoriamente um parâmetro do mesmo tipo do atributo que
     *     se quer alterar. O valor desse parâmetro será usado para alterar
     *     o atributo do objeto, mudando assim seu estado.
     */

    /**
     * Altera o dia da Data em questão.
     * 
     * @param dia O novo valor do dia para a Data.
     */
    public void setDia( int dia ) {
        this.dia = dia;
    }

    public void setMes( int mes ) {
        this.mes = mes;
    }

    public void setAno( int ano ) {
        this.ano = ano;
    }

    /*
     * É nos métodos set que poderíamos talvez aplicar validações para os
     * atributos que estão sendo definidos. No nosso exemplo da classe Data
     * ficaremos na forma mais simples possível e deixaremos as validações
     * para a classe Conta. No momento a ideia é fixar a ideia dos métodos
     * get e set.
     */

    @Override
    public String toString() {
        return String.format( "%02d/%02d/%04d", dia, mes, ano );
    }

}