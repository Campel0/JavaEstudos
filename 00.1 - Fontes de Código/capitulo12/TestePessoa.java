/* 
 * Arquivo: capitulo12/TestePessoa.java
 * Autor: Prof. Dr. David Buzatto
 */
public class TestePessoa {
    
    public static void main( String[] args ) {

        Pessoa pessoa = new Pessoa( "David", "Buzatto", 104.5 );
        System.out.println( "Pessoa: " + pessoa );

        // alterando o nome da Pessoa
        pessoa.setNome( "Aurora" );
        System.out.println( "nome alterado: " + pessoa );

        // alterando o sobrenome da Pessoa
        pessoa.setSobrenome( "Buzatto" );
        System.out.println( "sobrenome alterado: " + pessoa );

        // alterando o peso da Pessoa
        pessoa.setPeso( 15.5 );
        System.out.println( "peso alterado: " + pessoa );

        // obtendo os atributos
        System.out.println( "Atributos da Pessoa:" );
        System.out.println( "    nome: " + pessoa.getNome() );
        System.out.println( "    sobrenome: " + pessoa.getSobrenome() );
        System.out.println( "    peso: " + pessoa.getPeso() );

    }

}