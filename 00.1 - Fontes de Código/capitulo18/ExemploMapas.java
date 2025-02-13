/*
 * Arquivo: capitulo18/ExemploMapas.java
 * Autor: Prof. Dr. David Buzatto
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMapas {

    public static void main( String[] args ) {

        /*
         * Nesse exemplo será implementado uma situação
         * clássica de uso de mapas, principalmente do ponto
         * de vista didático: Como contar a quantidade de cada
         * caractere que aparece em um texto?
         */
        String texto = "o rato roeu a roupa do rei de roma";
        
        // Um mapa implementado como uma tabela de dispersão
        Map<Character, Integer> contador1 = new HashMap<>();

        // Um mapa implementado como uma árvore binária de busca
        Map<Character, Integer> contador2 = new TreeMap<>();

        /*
         * Um mapa implementado como uma tabela de dispersão, onde
         * a ordem de inserção dos elementos é mantida.
         */
        Map<Character, Integer> contador3 = new LinkedHashMap<>();

        // processa os mapas, fazendo a contagem dos caracteres os exibindo.
        processar( contador1, texto );
        processar( contador2, texto );
        processar( contador3, texto );

    }

    /**
     * Processa os mapas, contando os caracteres e os exibindo.
     * 
     * @param contador O mapa que contém as contagens.
     * @param texto O texto a ser processado.
     */
    private static void processar( 
        Map<Character, Integer> contador, 
        String texto ) {

        // processa todos os caracteres do texto, ignorando os espaços
        for ( char c : texto.toCharArray() ) {
            if ( c != ' ' ) {
                contar( contador, c );
            }
        }

        // exibe o mapa
        System.out.println( contador );

        /*
         * Set<K> keySet()
         * 
         * Retorna um conjunto com todas as chaves do mapa. O tipo do
         * conjunto depende do tipo do mapa.
         * 
         * K é o tipo da chave (obrigatoriamente um Comparable) usado
         * para construir o mapa.
         */
        System.out.println( contador.keySet() );

        /*
         * Collection<V> values()
         * 
         * Retorna uma coleção com todos os valores do mapa. A ordem dos
         * valores depende do tipo do mapa.
         * 
         * V é o tipo do valor usado para construir o mapa.
         */
        System.out.println( contador.values() );

        System.out.println( "Contém 'a'? " + contador.containsKey( 'a' ) );
        System.out.println( "Contém 'b'? " + contador.containsKey( 'b' ) );

        imprimir( contador );

    }

    /**
     * Conta as ocorrências de um caractere.
     * 
     * @param contador O mapa que conterá a contagem.
     * @param c O caractere a ser contado.
     */
    private static void contar( Map<Character, Integer> contador, char c ) {

        /*
         * boolean containsKey( K chave )
         * 
         * Verifica se existe uma determinada chave no mapa.
         * 
         * K é o tipo da chave (obrigatoriamente um Comparable) usado
         * para construir o mapa.
         */
        if ( !contador.containsKey( c ) ) {

            /*
             * void put( K chave, V valor )
             * 
             * Associa uma chave a um valor no mapa. Caso a chave não
             * exista, ela é inserida. Caso já exista, o valor anterior
             * é sobrescrito.
             * 
             * K é o tipo da chave (obrigatoriamente um Comparable) usado
             * para construir o mapa.
             * V é o tipo do valor usado para construir o mapa.
             */
            contador.put( c, 0 );

        }

        /*
         * V get( K chave )
         * 
         * Retorna o valor associado à chave. Caso a chave não exista,
         * retorna null.
         * 
         * K é o tipo da chave (obrigatoriamente um Comparable) usado
         * para construir o mapa.
         * V é o tipo do valor usado para construir o mapa.
         */
        contador.put( c, contador.get( c ) + 1 );

    }

    /**
     * Processa o mapa passado como parâmetro.
     * A ordem dos elementos visitados dependerá da implementação.
     * 
     * HashMap: ordem não garantida;
     * TreeMap: ordem garantida pela árvore;
     * LinkedHashMap: ordem de inserção.
     * 
     * @param mapa O mapa a ser processado.
     */
    private static void imprimir( Map<Character, Integer> mapa ) {

        /*
         * Set<Map.Entry<K, V>> entrySet()
         * 
         * Retorna um conjunto com todos as associações entre chaves 
         * e valores no mapa.
         * 
         * K é o tipo da chave (obrigatoriamente um Comparable) usado
         * para construir o mapa.
         * V é o tipo do valor usado para construir o mapa.
         */
        for ( Map.Entry<Character, Integer> e : mapa.entrySet() ) {
            System.out.printf( "%c -> %d\n", e.getKey(), e.getValue() );
        }

    }

}