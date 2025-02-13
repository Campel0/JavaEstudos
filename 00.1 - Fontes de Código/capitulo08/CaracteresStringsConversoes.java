/* 
 * Arquivo: capitulo08/CaracteresStringsConversoes.java
 * Autor: Prof. Dr. David Buzatto
 */

public class CaracteresStringsConversoes {

    public static void main( String[] args ) {

        /* 
         * A conversão de Strings em tipos primitivos se dá
         * usando as classes empacotadoras (wrappers) dos tipos primitivos.
         */
        byte vByte = Byte.parseByte( "1" );
        short vShort = Short.parseShort( "2" );
        int vInt = Integer.parseInt( "3" );
        long vLong = Long.parseLong( "4" );
        float vFloat = Float.parseFloat( "12.5" );
        double vDouble = Double.parseDouble( "29.75" );
        boolean vBoolean = Boolean.parseBoolean( "true" );

        // imprimindo...
        System.out.println( "   vByte: " + vByte );
        System.out.println( "  vShort: " + vShort );
        System.out.println( "    vInt: " + vInt );
        System.out.println( "   vLong: " + vLong );
        System.out.println( "  vFloat: " + vFloat );
        System.out.println( " vDouble: " + vDouble );
        System.out.println( "vBoolean: " + vBoolean );

    }

}
