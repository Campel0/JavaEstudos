/* 
 * Arquivo: capitulo13/Gerente.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Classe que representa um Gerente.
 */

import java.util.ArrayList;
import java.util.List;

public class Gerente {
    
    /*
     * Um Gerente é composto por três Strings, um CPF e uma lista de contas.
     * 
     * O comportamento do CPF na classe Gerente é o mesmo definido na classe
     * Cliente. Aqui poderíamos ter um problema. Por exemplo, caso um
     * Gerente fosse também um Cliente.
     * 
     * As contas que um determinado Gerente é responsável é representada no
     * diagrama como uma associação chamada Agregação. Esse tipo de associa-
     * ção é menos "forte" que a composição pois, caso um Gerente deixe de
     * existir, as Contas a ele associada precisam continuar existindo,
     * sendo atribuiídas a outro ou outros gerentes.
     */
    private String matricula;
    private String nome;
    private String sobrenome;
    private CPF documento;
    private List<Conta> contas;

    public Gerente() {
        setMatricula( "" );
        setNome( "" );
        setSobrenome( "" );
        setDocumento( new CPF( "" ) );
        setContas( new ArrayList<>() );
    }

    public Gerente( String matricula, String nome,
                    String sobrenome, CPF documento ) {

        setMatricula( matricula );
        setNome( nome );
        setSobrenome( sobrenome );
        setDocumento( documento );
        setContas( new ArrayList<>() );

    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public CPF getDocumento() {
        return documento;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setMatricula( String matricula ) {
        this.matricula = matricula;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public void setSobrenome( String sobrenome ) {
        this.sobrenome = sobrenome;
    }

    public void setDocumento( CPF documento ) {
        this.documento = documento;
    }

    public void setContas( List<Conta> contas ) {
        this.contas = contas;
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

        return String.format( "%s, %s: (%s) | CPF: %s", s, n, 
                matricula, documento );

    }

}