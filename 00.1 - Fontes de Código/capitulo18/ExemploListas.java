/*
 * Arquivo: capitulo18/ExemploListas.java
 * Autor: Prof. Dr. David Buzatto
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExemploListas {

    public static void main( String[] args ) {
        
        /* 
         * Uma lista usando a implementação ArrayList, baseada em
         * "redimensionamento" de arrays.
         */
        List<Integer> lista = new ArrayList<>();

        /* 
         * Uma lista usando a implementação LinkedList, baseada em
         * lista encadeada/ligada.
         */
        List<Integer> outraLista = new LinkedList<>();

        /*
         * void add( T elemento )
         * 
         * Insere um elemento no fim da lista.
         * 
         * T é o tipo genérico utilizado para construir a lista.
         */
        lista.add( 10 );
        lista.add( 20 );
        System.out.println( lista ); // imprime [10, 20]

        outraLista.add( 30 );
        outraLista.add( 40 );
        System.out.println( outraLista );  // imprime [30, 40]

        /*
         * void addAll( Collection<? extends T> colecao )
         * 
         * Insere todos os elementos da coleção passada como parâmetro
         * na ordem que eles são iterados na coleção passada.
         * 
         * T é o tipo genérico utilizado para construir a lista.
         */
        lista.addAll( outraLista );
        System.out.println( lista ); // imprime [10, 20, 30, 40]

        // itera pelos elementos da lista (do início ao fim)
        for ( Integer elemento : lista ) {
            System.out.println( elemento );
        }

        /*
         * void add( int posicao, T elemento )
         * 
         * Insere um elemento na posicao especificada.
         * 
         * T é o tipo genérico utilizado para construir a lista.
         */
        lista.add( 3, 50 );
        System.out.println( lista ); // imprime [10, 20, 30, 50, 40]

        /*
         * T get( int posicao )
         * 
         * Obtém o elemento contido na posição especificada.
         * Esse método não remove o elemento!
         * 
         * T é o tipo genérico utilizado para construir a lista.
         */
        System.out.println( lista.get( 2 ) ); // imprime 30
        System.out.println( lista ); // imprime [10, 20, 30, 50, 40]

        /*
         * T remove( int posicao )
         * 
         * Remove o elemento contido na posição especificada.
         * 
         * T é o tipo genérico utilizado para construir a lista.
         */
        System.out.println( lista.remove( 2 ) ); // imprime 30
        System.out.println( lista ); // imprime [10, 20, 50, 40]

    }

}