/* 
 * Arquivo: capitulo13/CPF.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Classe que representa um CPF.
 */
public class CPF {
    
    private String numero;

    public CPF() {
        setNumero( "" );
    }

    public CPF( String numero ) {
        setNumero( numero );
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero( String numero ) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }

}