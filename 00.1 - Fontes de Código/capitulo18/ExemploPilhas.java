/*
 * Arquivo: capitulo18/ExemploPilhas.java
 * Autor: Prof. Dr. David Buzatto
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploPilhas {

    public static void main( String[] args ) {

        /* 
         * Uma deque que será usada como pilha. A implementação ArrayDeque
         * é baseada em "redimensionamento" de arrays. Uma abordagem
         * mais aprofundada das estruturas de dados não será dada
         * neste livro.
         */
        Deque<Integer> pilha = new ArrayDeque<>();

        /* 
         * void push( T elemento )
         * 
         * Significado: empilhar.
         * 
         * Insere um elemento no fim da deque ou no "topo da pilha".
         * 
         * T é o tipo genérico utilizado para construir a deque.
         */
        pilha.push( 10 ); // empilha 10
        pilha.push( 15 ); // empilha 15
        pilha.push( 20 ); // empilha 20

        // exibe a pilha (do topo à base)
        System.out.println( pilha );

        // itera pelos elementos da pilha (do topo à base)
        for ( Integer elemento : pilha ) {
            System.out.println( elemento );
        }

        /* 
         * T peek()
         * 
         * Significado: "espiar"/consultar o topo.
         * 
         * Consulta o elemento do fim da deque ou do "topo da pilha".
         * Esse método não remove o elemento!
         * 
         * T é o tipo genérico utilizado para construir a deque.
         */
        System.out.println( pilha.peek() ); // imprime 20
        
        /* 
         * T pop()
         * 
         * Significado: desempilhar.
         * 
         * Remove o elemento do fim da deque ou do "topo da pilha".
         * 
         * T é o tipo genérico utilizado para construir a deque.
         */
        System.out.println( pilha.pop() ); // imprime 20

        // imprime [15, 10] (20 foi removido).
        System.out.println( pilha );

    }

}