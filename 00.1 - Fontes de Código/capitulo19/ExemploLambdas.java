/*
 * Arquivo: capitulo19/ExemploLambdas.java
 * Autor: Prof. Dr. David Buzatto
 */
import java.util.Arrays;
import java.util.Comparator;

public class ExemploLambdas {

    // um record do tipo Pessoa para o exemplo
    private record Pessoa( String nome, int idade ) {
    }

    public static void main( String[] args ) {
        
        Pessoa[] pessoas = new Pessoa[]{
            new Pessoa( "Joao", 35 ),
            new Pessoa( "Mariana", 15 ),
            new Pessoa( "Maria", 40 ),
            new Pessoa( "Jose", 49 )
        };

        System.out.println( Arrays.toString( pessoas ) );

        // ordena as pessoas pela idade, passando um comparator
        Arrays.sort( pessoas, new Comparator<Pessoa>() {
            public int compare( Pessoa p1, Pessoa p2 ) {
                return p1.idade() - p2.idade();
            }
        });
        System.out.println( Arrays.toString( pessoas ) ); // ordenado

        embaralhar( pessoas );
        System.out.println( Arrays.toString( pessoas ) ); // embaralhado

        // ordena as pessoas pela idade, usando uma expressão lambda
        Arrays.sort( pessoas, ( p1, p2 ) -> {
            return p1.idade() - p2.idade();
        });
        System.out.println( Arrays.toString( pessoas ) ); // ordenado

    }

    private static void embaralhar( Pessoa[] pessoas ) {
        for ( int i = 0; i < pessoas.length; i++ ) {
            int p = (int) (Math.random() * pessoas.length);
            Pessoa t = pessoas[p];
            pessoas[p] = pessoas[i];
            pessoas[i] = t;
        }
    }

}