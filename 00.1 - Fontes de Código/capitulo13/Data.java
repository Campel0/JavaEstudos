/*
 * Arquivo: capitulo13/Data.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Classe que representa uma Data.
 */
public class Data {

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
    
    @Override
    public String toString() {
        return String.format( "%02d/%02d/%04d", dia, mes, ano );
    }

}