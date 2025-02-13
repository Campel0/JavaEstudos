/*
 * Arquivo: capitulo17/Pessoa.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Um record para Pessoas. Note que a sintaxe para a definição
 * do record é um pouco diferente da que estamos acostumados.
 * 
 * Basicamente trocamos a palavra chave class por record e,
 * ao invés de criarmos os campos dentro da definição do
 * record, nós os definimos seguindo o nome do record.
 */
public record Pessoa( String nome, String sobrenome, int anoNascimento ) {

    /*
     * Como já informado, o compilador gerará os métodos equals,
     * hashCode e toString para nós, além do construtor e de 
     * métodos get correspondentes aos atributos.
     * 
     * O programador é livre para criar outros construtores, desde
     * que nos construtores definidos todos os campos sejam inicializados,
     * além de métodos e campos estáticos adicionais.
     */

}