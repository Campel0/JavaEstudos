/*
 * Arquivo: capitulo19/ExemploStreams.java
 * Autor: Prof. Dr. David Buzatto
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreams {

    // um record do tipo Pessoa para o exemplo
    private record Pessoa( String nome, int idade ) {
    }

    public static void main( String[] args ) {

        List<Pessoa> pessoas = Arrays.asList( new Pessoa[]{
            new Pessoa( "Joao", 35 ),
            new Pessoa( "Mariana", 15 ),
            new Pessoa( "Maria", 40 ),
            new Pessoa( "Jose", 49 )
        });
        System.out.println( pessoas );

        // filtrando as pessoas menores de idade e coletando
        // em uma nova lista
        List<Pessoa> menoresDeIdade = pessoas.stream()
                .filter( p -> p.idade < 18 )
                .collect( Collectors.toList() );
        System.out.println( menoresDeIdade );

        // somando a idade de todas as pessoas
        int somaIdades = pessoas.stream()
                .mapToInt( p -> p.idade() )
                .sum();
        System.out.println( somaIdades );

        // somando a idade de todas as pessoas com nomes
        // iniciados em M
        int somaIdadesM = pessoas.stream()
                .filter( p -> p.nome().startsWith( "M" ) )
                .mapToInt( p -> p.idade() )
                .sum();
        System.out.println( somaIdadesM );

    }

}