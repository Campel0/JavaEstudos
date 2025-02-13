/* 
 * Arquivo: capitulo13/Conta.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Classe que representa uma Conta.
 */
public class Conta {
    
    /*
     * Uma Conta é composta por uma String, dois doubles, uma Data, um
     * Cliente e um Gerente.
     * 
     * Um Cliente é exclusivo da Conta, ou seja, o Cliente associado a uma
     * Conta é dela e somente dela, pois não é compartilhado com nenhuma
     * outra Conta. Perceba que essa é a realidade para esse exemplo e a
     * modelagem apresentada, mas poderíamos ter variações, como mais de
     * um cliente por conta, a troca de cliente titular de uma conta etc.
     * 
     * O caso do Gerente está representado no diagrama como uma associação
     * navegável simples e seu outro lado está representado como uma outra
     * associação, do Gerente para a Conta.
     */
    private String numero;
    private double saldo;
    private double limite;
    private Data dataAbertura;
    private Cliente titular;
    private Gerente gerente;

    public Conta() {
        setNumero( "" );
        setSaldo( 0 );
        setLimite( 500 );
        setDataAbertura( new Data( 1, 1, 2000 ) );
        setTitular( null );
        setGerente( null );
    }

    public Conta( String numero, double saldo, double limite, 
                  Data dataAbertura, Cliente titular,
                  Gerente gerente ) {

        setNumero( numero );
        setSaldo( saldo );
        setLimite( limite );
        setDataAbertura( dataAbertura );
        setTitular( titular );
        setGerente( gerente );

    }

    public boolean sacar( double valor ) {

        if ( valor > 0 ) {

            if ( saldo + limite - valor >= 0 ) {
                saldo -= valor;
                return true;
            } else {
                return false;
            }

        }

        return false;

    }

    public void depositar( double valor ) {

        if ( valor > 0 ) {
            saldo += valor;
        }

    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public Cliente getTitular() {
        return titular;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public String getSituacao() {
        return saldo < 0 ? "devedora" : "credora";
    }

    public void setNumero( String numero ) {

        numero = numero.trim();

        if ( numero.isEmpty() || numero.length() != 5 ) {
            this.numero = "00001";
        } else {
            this.numero = numero;
        }

    }

    public void setSaldo( double saldo ) {

        if ( saldo >= 0 ) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }

    }

    public void setLimite( double limite ) {

        if ( limite >= 0 ) {
            this.limite = limite;
        } else {
            this.limite = 0;
        }

    }

    public void setDataAbertura( Data dataAbertura ) {
        this.dataAbertura = dataAbertura;
    }

    public void setTitular( Cliente titular ) {
        this.titular = titular;
    }

    public void setGerente( Gerente gerente ) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {

        String dados = String.format( "Conta: %s\n", numero );
        dados += String.format( "Data de Abertura: %s\n", dataAbertura );
        dados += String.format( "Titular: %s\n", titular );
        dados += String.format( "Gerente: %s\n", gerente );
        dados += String.format( "Saldo: %sR$%.2f\n", 
                saldo < 0 ? "-" : "",
                saldo < 0 ? -saldo : saldo );
        dados += String.format( "Limite: R$%.2f\n", limite );
        dados += "Situacao: " + getSituacao();

        return dados;

    }

}