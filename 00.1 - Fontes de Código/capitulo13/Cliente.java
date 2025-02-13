/* 
 * Arquivo: capitulo13/Cliente.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Classe que representa um Cliente.
 */
public class Cliente {
    
    /*
     * Um cliente é composto por duas Strings, uma Data e um CPF.
     * 
     * Um CPF é exclusivo do Cliente, ou seja, o CPF associado a um Cliente
     * é dele e somente dele, pois não é compartilhado com nenhum outro
     * Cliente. Se um Cliente deixa de existir, seu CPF também deixará.
     * 
     * Sendo assim, essa associação é chamada de Composição e na UML é
     * denotada por uma associação com um losango pintado.
     */
    private String nome;
    private String sobrenome;
    private Data dataNascimento;
    private CPF documento;

    public Cliente() {
        setNome( "" );
        setSobrenome( "" );
        setDataNascimento( new Data( 1, 1, 1970 ) );
        setDocumento( new CPF( "" ) );
    }

    public Cliente( String nome, String sobrenome, 
                    Data dataNascimento, CPF documento ) {

        setNome( nome );
        setSobrenome( sobrenome );
        setDataNascimento( dataNascimento );
        setDocumento( documento );

    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public CPF getDocumento() {
        return documento;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public void setSobrenome( String sobrenome ) {
        this.sobrenome = sobrenome;
    }

    public void setDataNascimento( Data dataNascimento ) {
        this.dataNascimento = dataNascimento;
    }

    public void setDocumento( CPF documento ) {
        this.documento = documento;
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
                dataNascimento, documento );

    }

}