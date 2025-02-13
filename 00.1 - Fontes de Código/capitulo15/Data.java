/*
 * Arquivo: capitulo15/Data.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Classe que representa uma Data que é comparável.
 * 
 * A classe Data implementa a interface Comparable.
 * 
 * As interfaces representam "contratos" que devem ser seguidos pelas
 * classes que as implementam. No caso da interface Comparable, o
 * contrato é definido em como o método "compareTo" deve funcionar
 * (veja abaixo).
 * 
 * As classes que implementam Comparable e seguem o contrato têm a garantia
 * que funcionarão apropriadamente em contextos que precisam que objetos
 * dessa classe possam ser comparados, ou seja, se um objeto é "menor que"
 * ("vem antes"), ou "maior que" ("vem depois") ou igual.
 */
public class Data implements Comparable<Data> {

    private int dia;
    private int mes;
    private int ano;

    public Data() {
        setDia( 1 );
        setMes( 1 );
        setAno( 1970 );
    }

    public Data( int dia, int mes, int ano ) {
        setDia( dia );
        setMes( mes );
        setAno( ano );
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia( int dia ) {
        this.dia = dia;
    }

    public void setMes( int mes ) {
        this.mes = mes;
    }

    public void setAno( int ano ) {
        this.ano = ano;
    }
    
    /*
     * O método compareTo da interface Comparable retornará um valor
     * inteiro.
     *
     * Esse valor representa se o objeto corrente é maior, menor ou igual
     * ao objeto passado no parâmetro:
     * 
     *     - Se o objeto corrente (o que invoca o método) for "menor que" o
     *       objeto passado no parâmetro, o método deve retornar um valor
     *       negativo;
     *     - Se o objeto corrente (o que invoca o método) for "maior que" o
     *       objeto passado no parâmetro, o método deve retornar um valor
     *       positivo;
     *     - Se o objeto corrente (o que invoca o método) for "igual ao"
     *       objeto passado no parâmetro, o método deve retornar zero.
     * 
     * O método compareTo, desde que implementado apropriadamente, definirá
     * uma relação de ordem total para o tipo em questão, permitindo que
     * esses objetos possam ser comparados e utilizados em métodos de
     * ordenação, por exemplo.
     */
    @Override
    public int compareTo( Data outra ) {

        if ( this.ano < outra.ano ) {
            return -1;
        } else if ( this.ano > outra.ano ) {
            return 1;
        } else if ( this.mes < outra.mes ) {
            return -1;
        } else if ( this.mes > outra.mes ) {
            return 1;
        } else if ( this.dia < outra.dia ) {
            return -1;
        } else if ( this.dia > outra.dia ) {
            return 1;
        }

        return 0;
        
    }

    @Override
    public String toString() {
        return String.format( "%02d/%02d/%04d", dia, mes, ano );
    }

}