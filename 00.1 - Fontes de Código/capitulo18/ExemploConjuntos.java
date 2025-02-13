/*
 * Arquivo: capitulo18/ExemploConjuntos.java
 * Autor: Prof. Dr. David Buzatto
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploConjuntos {

    public static void main( String[] args ) {
        
        // quatro strings para preencher os conjuntos
        String[] nomes = { "David", "Aurora", "Fernanda", "Aurora" };

        // Um conjunto implementado como uma tabela de dispersão
        Set<String> conjunto1 = new HashSet<>();

        // Um conjunto implementado como uma árvore binária de busca
        Set<String> conjunto2 = new TreeSet<>();

        /*
         * Um conjunto implementado como uma tabela de dispersão, onde
         * a ordem de inserção dos elementos é mantida.
         */
        Set<String> conjunto3 = new LinkedHashSet<>();

        /*
         * Insere as Strings no conjunto.
         * 
         * Perceba que a String de conteúdo "Aurora" só será
         * inserida uma vez.
         */
        for ( String nome : nomes ) {

            /*
             * void add( T elemento )
             * 
             * Insere um elemento no conjunto.
             * 
             * T é o tipo genérico utilizado para construir o conjunto.
             */
            conjunto1.add( nome );
            conjunto2.add( nome );
            conjunto3.add( nome );

        }
        
        // imprime os conjuntos

        // a ordem não é gerantida
        System.out.println( conjunto1 );

        // a ordem é garantida por causa da árvore
        System.out.println( conjunto2 );

        // a ordem é gerantida, mas baseada na ordem de inserção
        System.out.println( conjunto3 );

        // iterando pelos elementos de um conjunto
        for ( String elemento : conjunto1 ) {
            System.out.println( elemento );
        }

    }

}