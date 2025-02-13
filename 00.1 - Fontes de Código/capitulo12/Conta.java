/* 
 * Arquivo: capitulo12/Conta.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Classe que representa uma Conta.
 */
public class Conta {
    
    private String numero;
    private double saldo;
    private double limite;

    public Conta() {
        // usando sets para configurar os atributos
        // compare com a versão do Capítulo anterior!
        setNumero( "" );
        setSaldo( 0 );
        setLimite( 500 );
    }

    public Conta( String numero, double saldo, double limite ) {
        // usando sets para configurar os atributos
        // compare com a versão do Capítulo anterior!
        setNumero( numero );
        setSaldo( saldo );
        setLimite( limite );
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

    /*
     * Note que não existe um atributo chamado "situacao", mas podemos
     * calcular essa propriedade/caractística do objeto usando um ou
     * mais outros atributos. A situação da conta depende do seu saldo.
     * Uma conta com saldo negativo é devedora, enquanto uma com saldo zero
     * ou positivo é credora. Perceba também que o usuário da classe não
     * precisa saber que não existe um atributo chamado situação, ele só
     * deve estar interessado em usar o método getSituacao e que esse método
     * funcione apropriadamente, ou seja, que reflita de fato o estado do
     * objeto chamador.
     */

    /**
     * Obtém a situação da Conta.
     * 
     * @return Retorna "credora" caso o saldo seja zero ou positivo ou
     * "devedora" caso o saldo seja negativo.
     */
    public String getSituacao() {
        return saldo < 0 ? "devedora" : "credora";
    }

    public void setNumero( String numero ) {

        // remove os espaços do início e do fim, caso existam
        numero = numero.trim();

        // se ficar vazio ou tiver uma quantidade de caracteres
        // diferente de 5
        if ( numero.isEmpty() || numero.length() != 5 ) {

            // configura com o valor padrão "00001"
            this.numero = "00001";

            // se corresponde ao valor desejado, ou seja,
            // um "número" com exatamente cinco dígitos, o usa
            // para configurar a conta
        } else {
            this.numero = numero;
        }

    }

    public void setSaldo( double saldo ) {

        // validando o valor que foi passado
        if ( saldo >= 0 ) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }

    }

    public void setLimite( double limite ) {

        // validando o valor que foi passado
        if ( limite >= 0 ) {
            this.limite = limite;
        } else {
            this.limite = 0;
        }

    }

    @Override
    public String toString() {

        String dados = String.format( "Conta: %s\n", numero );
        dados += String.format( "Saldo: %sR$%.2f\n", 
                saldo < 0 ? "-" : "",
                saldo < 0 ? -saldo : saldo );
        dados += String.format( "Limite: R$%.2f\n", limite );
        dados += "Situacao: " + getSituacao();

        return dados;

    }

}