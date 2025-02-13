/*
 * Arquivo: capitulo18/ExemploFilas.java
 * Autor: Prof. Dr. David Buzatto
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploFilas {

    public static void main( String[] args ) {

        // Uma deque que será usada como fila, implementada como ArrayDeque.
        Deque<Integer> fila = new ArrayDeque<>();
        
        /* 
         * void offer( T elemento )
         * 
         * Significado: enfileirar.
         * 
         * Insere um elemento no fim da deque ou no "fim da fila".
         * 
         * T é o tipo genérico utilizado para construir a deque.
         */
        fila.offer( 10 ); // enfileira 10
        fila.offer( 15 ); // enfileira 15
        fila.offer( 20 ); // enfileira 20
        
        // exibe a fila (do início ao fim)
        System.out.println( fila );

        // itera pelos elementos da fila (do início ao fim)
        for ( Integer elemento : fila ) {
            System.out.println( elemento );
        }

        /* 
         * T peek()
         * 
         * Significado: "espiar" o início/consultar o início.
         * 
         * Consulta o primeiro elemento da deque ou do "início da fila".
         * Esse método não remove o elemento!
         * 
         * T é o tipo genérico utilizado para construir a deque.
         */
        System.out.println( fila.peek() ); // imprime 10

        /* 
         * T poll()
         * 
         * Significado: desenfileirar.
         * 
         * Remove o primeiro elemento da deque ou do "início da fila".
         * 
         * T é o tipo genérico utilizado para construir a deque.
         */
        System.out.println( fila.poll() ); // imprime 10

        // imprime [15, 20] (10 foi removido)
        System.out.println( fila );

    }

}