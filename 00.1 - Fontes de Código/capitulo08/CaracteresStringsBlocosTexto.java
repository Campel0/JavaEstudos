/* 
 * Arquivo: capitulo08/CaracteresStringsBlocosTexto.java
 * Autor: Prof. Dr. David Buzatto
 */

public class CaracteresStringsBlocosTexto {

    public static void main( String[] args ) {

        /* 
         * A partir da versão 15 da linguagem Java foi adicionado
         * um novo artifício sintático que permite a criação de
         * blocos de texto, facilitando a definição de Strins que
         * contém muitos pulos de linha. Imagine uma String que
         * contém como texto esse comentário. Antes da versão 15,
         * teríamos que fazer da seguinte maneira:
         */
        String textoString = 
            "A partir da versão 15 da linguagem Java foi adicionado\n" +
            "um novo artifício sintático que permite a criação de\n" +
            "blocos de texto, facilitando a definição de Strins que\n" +
            "contém muitos pulos de linha. Imagine uma String que\n" +
            "contém como texto esse comentário. Antes da versão 15,\n" +
            "teríamos que fazer da seguinte maneira:";

        System.out.println( textoString );

        /*
         * Obviamente poderíamos inicializar essa String com um conteúdo
         * sem quebras (tudo em uma linha), mas isso dificultaria a leitura
         * do código. Esse é apenas um exemplo básico, pois não quero
         * misturar vários assuntos aqui, mas um exemplo mais útil seria
         * uma String que contém um trecho de um documento HTML. Veja agora,
         * a mesma String anterior inicializada com a sintaxe de bloco de
         * texto, que consiste em uma String delimitada entre um par de três
         * aspas duplas (""").
         */
        String textoUsandoBloco =
            """
            A partir da versão 15 da linguagem Java foi adicionado
            um novo artifício sintático que permite a criação de
            blocos de texto, facilitando a definição de Strins que
            contém muitos pulos de linha. Imagine uma String que
            contém como texto esse comentário. Antes da versão 15,
            teríamos que fazer da seguinte maneira:
            """;

        System.out.println( textoUsandoBloco );

        /*
         * Note que ao inicializar a String dessa forma, ganhamos em
         * legibilidade. A margem esquerda da String sempre será dada
         * a partir do caractere válido mais à esquerda do bloco. Caso queira
         * que caracteres de espaço sejam adicionados ao final de uma linha,
         * há a necessidade de inserir o caractere de escape \s.
         */
        String blocoUsandoEspaco =
            """
            Bloco de texto com três espaços no fim desta linha.\s\s\s
              Dois espaços no início desta linha.
            Nenhum nesta.
            """;
        
        // verifique a saída do for abaixo ao executar essa classe!
        for ( String s : blocoUsandoEspaco.split( "\n" ) ) {
            System.out.println( "***" + s + "***" );
        }

    }

}
