/*
 * Arquivo: capitulo12/TesteData.java
 * Autor: Prof. Dr. David Buzatto
 */

public class TesteData {
    
    public static void main( String[] args ) {

        Data data = new Data( 25, 2, 1985 );
        System.out.println( "Data: " + data );

        // alterando o dia da Data
        data.setDia( 28 );
        System.out.println( "dia alterado: " + data );

        // alterando o mês da Data
        data.setMes( 8 );
        System.out.println( "mes alterado: " + data );

        // alterando o ano da Data
        data.setAno( 2019 );
        System.out.println( "ano alterado: " + data );

        // obtendo os atributos
        System.out.println( "Atributos da Data:" );
        System.out.println( "    dia: " + data.getDia() );
        System.out.println( "    mes: " + data.getMes() );
        System.out.println( "    ano: " + data.getAno() );

    }

}