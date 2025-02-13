/* 
 * Arquivo: capitulo11/Conta.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Classe que representa uma Conta.
 */
public class Conta {
    
    private String numero;

    /*
     * Para lidarmos com valores monetários, que exigem precisão total,
     * double não é o tipo mais apropriado, mas o usaremos por enquanto
     * por questão de facilidade.
     */
    private double saldo;
    private double limite;

    public Conta() {
        numero = "";
        saldo = 0;
        limite = 500;
    }

    public Conta( String numero, double saldo, double limite ) {

        this.numero = numero;

        // atualiza o saldo caso o valor inicial seja maior que zero
        if ( saldo > 0 ) {
            this.saldo = saldo;
        }

        // atualiza o limite caso o valor inicial seja maior que zero
        if ( limite > 0 ) {
            this.limite = limite;
        }

    }

    /**
     * Saca um valor da conta respeitando o limite.
     * 
     * @param valor Valor a ser sacado.
     * @return Verdadeiro caso o saque seja bem-sucedido, falso em caso
     * contrário.
     */
    public boolean sacar( double valor ) {

        // só tenta sacar se o valor fornecido for maior que zero
        if ( valor > 0 ) {

            // verifica se há limite para sacar
            if ( saldo + limite - valor >= 0 ) {

                saldo -= valor;
                return true;

                // se não houver, não saca
            } else {
                return false;
            }

        }

        return false;

    }
    
    /**
     * Deposita um valor na conta.
     * 
     * @param valor Valor a ser depositado. Valores negativos são ignorados.
     */
    public void depositar( double valor ) {

        // só deposita se o valor fornecido for maior que zero
        if ( valor > 0 ) {
            saldo += valor;
        }

    }

    @Override
    public String toString() {

        String situacao = saldo < 0 ? "devedora" : "credora";
        String dados = String.format( "Conta: %s\n", numero );
        dados += String.format( "Saldo: %sR$%.2f\n", 
                saldo < 0 ? "-" : "",
                saldo < 0 ? -saldo : saldo );
        dados += String.format( "Limite: R$%.2f\n", limite );
        dados += "Situacao: " + situacao;

        return dados;

    }

}