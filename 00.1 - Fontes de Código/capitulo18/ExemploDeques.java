/*
 * Arquivo: capitulo18/ExemploDeques.java
 * Autor: Prof. Dr. David Buzatto
 */
import java.util.Deque;
import java.util.LinkedList;

public class ExemploDeques {

    public static void main( String[] args ) {

        // Uma deque implementada como uma lista encadeada/ligada.
        Deque<Integer> deque = new LinkedList<>();

        /* 
         * void offer( T elemento )
         * void offerLast( T elemento )
         * 
         * Insere um elemento no fim da deque.
         * 
         * T é o tipo genérico utilizado para construir a deque.
         */
        deque.offer( 10 );
        System.out.println( deque );

        deque.offerLast( 20 );
        System.out.println( deque );

        deque.offer( 30 );
        System.out.println( deque );

        /* 
         * void offerFirst( T elemento )
         * 
         * Insere um elemento no início da deque.
         * 
         * T é o tipo genérico utilizado para construir a deque.
         */
        deque.offerFirst( 40 );
        System.out.println( deque );

        // itera pelos elementos da deque (do início ao fim)
        for ( Integer elemento : deque ) {
            System.out.println( elemento );
        }

        /* 
         * T peek()
         * T peekFirst()
         * 
         * Consulta o elemento do início da deque.
         * Esse método não remove o elemento!
         * 
         * T é o tipo genérico utilizado para construir a deque.
         */
        System.out.println( deque.peek() );      // imprime 40
        System.out.println( deque.peekFirst() ); // imprime 40

        /* 
         * T peekLast()
         * 
         * Consulta o elemento do fim da deque.
         * Esse método não remove o elemento!
         * 
         * T é o tipo genérico utilizado para construir a deque.
         */
        System.out.println( deque.peekLast() );  // imprime 30

        System.out.println( deque );
        /* 
         * T poll()
         * T pollFirst()
         * 
         * Remove o elemento do início da deque.
         * 
         * T é o tipo genérico utilizado para construir a deque.
         */
        System.out.println( deque.poll() );      // imprime 40
        System.out.println( deque.pollFirst() ); // imprime 10

        /* 
         * T pollLast()
         * 
         * Remove o elemento do fim da deque.
         * 
         * T é o tipo genérico utilizado para construir a deque.
         */
        System.out.println( deque.pollLast() );  // imprime 30

    }

}