/* 
 * Arquivo: capitulo12/Pessoa.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Classe que representa uma Pessoa.
 */
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private double peso;

    public Pessoa() {
        nome = "";
        sobrenome = "";
        peso = 50;
    }

    public Pessoa( String nome, String sobrenome, double peso ) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public void setSobrenome( String sobrenome ) {
        this.sobrenome = sobrenome;
    }

    public void setPeso( double peso ) {
        this.peso = peso;
    }

    @Override
    public String toString() {

        String n = nome;
        String s = sobrenome;

        if ( nome == null || nome.isEmpty() ) {
            n = "sem nome";
        }
        
        if ( sobrenome == null || sobrenome.isEmpty() ) {
            s = "sem sobrenome";
        }

        return String.format( "%s, %s: (%.2f)", s, n, peso );

    }

}