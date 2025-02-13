/*
 * Arquivo: capitulo16/Usuario.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Uma classe que representa um Usuário.
 */
public class Usuario {

    /*
     * Um usuário é composto por duas Strings e uma enumeração.
     */
    private String email;
    private String senha;
    private TipoUsuario tipo;

    public Usuario() {
        setEmail( "aluno@ifsp.edu.br" );
        setSenha( "123456" );
        setTipo( TipoUsuario.PADRAO );
    }

    public Usuario( String email, String senha, TipoUsuario tipo ) {
        setEmail( email );
        setSenha( senha );
        setTipo( tipo );
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public void setSenha( String senha ) {
        this.senha = senha;
    }

    public void setTipo( TipoUsuario tipo ) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return email + " (" + tipo + ")";
    }

}