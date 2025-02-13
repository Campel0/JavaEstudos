/* 
 * Arquivo: capitulo08/CaracteresStringsMetodos.java
 * Autor: Prof. Dr. David Buzatto
 */

public class CaracteresStringsMetodos {

    public static void main( String[] args ) {

        /* 
         * Em Java, as Strings são imutáveis, ou seja, depois de criadas
         * não são mais modificadas. Todos os métodos que operam sobre
         * as Strings gerarão novos valores baseados na String original. 
         */
        String string1 = "David";
        String string2 = "Aurora";
        String string3 = "Buzatto";
        String testes;
        int comparacao;


        System.out.println( "**** operacoes ****" );
        System.out.println( "Concatenacao:");

        // a concatenação de Strings é feita usando o operador +
        string1 = string1 + " " + string3;
        System.out.printf( "    %s\n", string1 );

        // pode-se também usar o operador de atribuição composta +=
        string2 += " " + string3;
        System.out.printf( "    %s\n", string2 );


        System.out.println( "\n" );
        System.out.println( "**** extracao de dados ****" );

        /* 
         * int length()
         * 
         * Retorna o tamanho da String (quantidade de
         * caracteres armazenados).
         */
        System.out.println( "length (comprimento):" );
        System.out.printf( "    A string \"%s\" possui %d caracteres.\n",
                string1, string1.length() );
        System.out.println();

        
        /* 
         * char charAt( int posicao )
         *
         * Retorna o caractere em determinada posição.
         */
        System.out.println( "charAt (caractere de uma posicao):" );
        System.out.println( "    Caractere na posicao 2: " + 
                string1.charAt( 2 ) );
        System.out.println();
        
        
        /* 
         * int indexOf( char caractere )
         *
         * Retorna a posição do primeiro caractere encontrado ou -1 caso
         * o caractere não exista na String.
         */
        System.out.println( "indexOf (posicao de caractere):" );
        System.out.println( "    Posicao do caractere u: " + 
                string2.indexOf( 'u' ) );
        System.out.println( "    Posicao do caractere x: " + 
                string2.indexOf( 'x' ) );
        System.out.println();


        /* 
         * int indexOf( String substring )
         *
         * Retorna a posição onde substring passada começa na String
         * chamadora ou -1 caso a substring não exista na String.
         */
        System.out.println( "indexOf (posicao de substring):" );
        System.out.println( "    Posicao da substring vi: " +
                string1.indexOf( "vi" ) );
        System.out.println( "    Posicao do substring dx: " + 
                string1.indexOf( "dx" ) );
        System.out.println();

        
        /* 
         * int lastIndexOf( char caractere )
         *
         * Retorna a posição do último caractere encontrado ou -1 caso
         * o caractere não exista na String.
         */
        System.out.println( "lastIndexOf (ultima posicao de caractere):" );
        System.out.println( "    Ultima posicao do caractere a: " + 
                string2.lastIndexOf( 'a' ) );
        System.out.println( "    Ultima posicao do caractere x: " + 
                string2.lastIndexOf( 'x' ) );
        System.out.println();
        

        /* 
         * int lastIndexOf( String substring )
         *
         * Retorna a posição onde a última substring passada começa
         * na String chamadora ou -1 caso a substring não exista na String.
         */
        System.out.println( "lastIndexOf (ultima posicao de substring):" );
        System.out.println( "    Ultima posicao da substring id: " +
                string1.lastIndexOf( "id" ) );
        System.out.println( "    Ultima posicao do substring dx: " + 
                string1.lastIndexOf( "dx" ) );
        System.out.println();


        /* 
         * char[] toCharArray()
         *
         * Retorna um array de caracteres com todos os caracteres da
         * String chamadora.
         */
        System.out.println( "toCharArray (gerar array de caracteres):" );
        System.out.print( "    Caracteres de: " + string2 + ": " );
        for ( char c : string2.toCharArray() ) {
            System.out.print( c + " " );
        }
        System.out.println( "\n" );


        /* 
         * String[] split( String regex )
         *
         * Divide a String chamadora, retornando um array de Strings
         * baseado em uma expressão regular passada como parâmetro.
         */
        System.out.println( "split (dividir em substrings):" );
        testes = "essa eh uma frase de testes";
        System.out.print( "    Palavras de: " + testes + ": " );
        for ( String s : testes.split( " " ) ) {
            System.out.print( s + " - " );
        }
        System.out.println( "\n" );

        
        System.out.println();
        System.out.println( "**** verificacoes ****" );

        /* 
         * boolean equals( String outra )
         *
         * Retorna verdadeiro caso a String chamadora tenha o mesmo
         * conteúdo da String outra ou falso em caso contrário.
         */
        System.out.println( "equals (sao iguais?):" );
        testes = "aurora buzatto";
        if ( string2.equals( testes ) ) {
            System.out.println( 
                "    " + string2 + " e " + testes + 
                " sao iguais (mesmo conteudo)" );
        } else {
            System.out.println( 
                "    " + string2 + " e " + testes + 
                " sao diferentes (conteudo diferente)" );
        }
        System.out.println();


        /* 
         * boolean equalsIgnoreCase( String outra )
         *
         * Retorna verdadeiro caso a String chamadora tenha o mesmo
         * conteúdo, ignorando a caixa das letras, da String outra ou
         * falso em caso contrário.
         */
        System.out.println( "equalsIgnoreCase (sao iguais?):" );
        if ( string2.equalsIgnoreCase( testes ) ) {
            System.out.println( 
                "    " + string2 + " e " + testes + 
                " sao iguais (mesmo conteudo)" );
        } else {
            System.out.println( 
                "    " + string2 + " e " + testes + 
                " sao diferentes (conteudo diferente)" );
        }
        System.out.println();


        /* 
         * boolean contains( String substring )
         *
         * Retorna verdadeiro a substring exista na String chamadora
         * ou falso em caso contrário.
         */
        System.out.println( "contains (contem?):" );
        System.out.printf( "    \"%s\" contem '\\w+'? %b\n", testes, 
                testes.matches( "\\w+" ) );
        testes = "abcdef";
        System.out.printf( "    \"%s\" contem '\\w+'? %b\n", testes, 
                testes.matches( "\\w+" ) );
        System.out.println();
        

        /* 
         * boolean isBlank
         *
         * Retorna verdadeiro caso a String seja composta de apenas
         * caracteres brancos (espaço, pulo de linha etc.) ou falso
         * em caso contrário.
         */
        System.out.println( "isBlank (eh branca?):" );
        System.out.println( "    Em branco? " + "".isBlank() );
        System.out.println( "    Em branco? " + " ".isBlank() );
        System.out.println( "    Em branco? " + " \n \t \f ".isBlank() );
        System.out.println( "    Em branco? " + " a ".isBlank() );
        System.out.println();

        
        /* 
         * boolean isEmpty
         *
         * Retorna verdadeiro caso a String seja vazia (comprimento 0)
         * ou falso em caso contrário.
         */
        System.out.println( "isEmpty (esta vazia?):" );
        System.out.println( "    Vazia? " + "".isEmpty() );
        System.out.println( "    Vazia? " + " ".isEmpty() );
        System.out.println( "    Vazia? " + " \n \t \f ".isEmpty() );
        System.out.println( "    Vazia? " + " a ".isEmpty() );
        System.out.println();


        /* 
         * int compareTo( String outraString )
         * Compara a String que invocou o método com outraString e retorna:
         *     um valor negativo, caso quem invocou venha antes de
         *     outraString;
         *     zero, caso quem invocou seja igual a outraString;
         *     um valor positivo, caso quem invocou venha após de
         *     outraString;
         */
        System.out.println( "compareTo (comparar):" );
        comparacao = string1.compareTo( string2 );
        if ( comparacao < 0 ) {
            System.out.printf( "    %s vem antes de %s\n",
                    string1, string2 );
        } else if ( comparacao > 0 ) {
            System.out.printf( "    %s vem antes de %s\n",
                    string2, string1 );
        } else {
            System.out.printf( "    %s e %s tem o mesmo conteudo!\n",
                    string1, string2 );
        }
        System.out.println();

        
        /* 
         * boolean matches( String regex )
         *
         * Retorna verdadeiro caso haja o casamento (match) da expressão
         * regular ou falso em caso contrário.
         */
        System.out.println( "matches (ha casamento?):" );
        System.out.printf( "    \"%s\" => %b\n", testes, 
                testes.matches( "\\w+" ) );
        testes = "abcdef";
        System.out.printf( "    \"%s\" => %b\n", testes, 
                testes.matches( "\\w+" ) );
        System.out.println();


        System.out.println();
        System.out.println( "**** transformacoes ****" );

        /* 
         * String substring( int inicio )
         *
         * Retorna a substring iniciada na posição inicio até o fim da
         * String original. A posição inicio é inclusiva.
         */
        System.out.println( "substring (subcadeia):" );
        System.out.println( "    substring (inicio): " + 
                string1.substring( 7 ) );

         
        /* 
         * String substring( int inicio, int fim )
         *
         * Retorna a substring iniciada na posição inicio até a posição
         * fim da String original. A posição inicio é inclusiva e a posição
         * fim é exclusiva.
         */
        System.out.println( "    substring (inicio, fim): " + 
                string2.substring( 2, 9 ) );
        System.out.println();

        
        /* 
         * String toLowerCase()
         *
         * Retorna uma nova String com todos os caracteres em minúsculo.
         */
        System.out.println( "toLowerCase (para minusculas):" );
        System.out.printf( "    \"%s\" => \"%s\"\n\n", 
                string2, string2.toLowerCase() );


        /* 
         * String toUpperCase
         *
         * Retorna uma nova String com todos os caracteres em maiúsculo.
         */
        System.out.println( "toUpperCase (para maiusculas):" );
        System.out.printf( "    \"%s\" => \"%s\"\n\n", 
                string2, string2.toUpperCase() );

        
        /* 
         * String trim()
         *
         * Retorna uma nova String removendo todos os espaços do início
         * e do fim da mesma.
         */
        System.out.println( "trim (aparar):");
        testes = "    " + string1 + "     ";
        System.out.printf( "    \"%s\" => \"%s\"\n\n",
                testes, testes.trim() );
        
        
        /* 
         * String replace( char antigo, char novo )
         *
         * Retorna uma nova String substituindo todas as ocorrências do
         * caractere antigo pelo novo.
         */
        System.out.println( "replace (substituir caractere):");
        System.out.printf( "    \"%s\" => \"%s\"\n", string1, 
                string1.replace( 'd', 'x' ) );
        System.out.println();


        /* 
         * String replace( String antigo, String novo )
         *
         * Retorna uma nova String substituindo todas as ocorrências da
         * substring antigo pelo novo.
         */
        System.out.println( "replace (substituir strings):");
        System.out.printf( "    \"%s\" => \"%s\"\n\n", string2, 
                string2.replace( "ro", "xy" ) );


        /* 
         * String replaceAll( String regex, String novo )
         *
         * Retorna uma nova String substituindo todas os casamentos
         * (matches) da expressão regular por novo.
         */
        System.out.println( "replaceAll (substituir todos):");
        testes = "essa eh uma frase de testes";
        System.out.printf( "    \"%s\" => \"%s\"\n\n", testes, 
                testes.replaceAll( "\\w{2}", "+" ) );

        
        /* String format( String formato, Object... valores );
         *
         * O método público estático format da classe String é 
         * utilizado para Strings. Ele funciona de forma análoga
         * ao método System.out.printf, entretanto, ao invés de
         * direcionar os dados para a saída, ele gera uma String
         * com os valores formatados e a retorna.
         *
         * Todas as regras de formatação aplicadas no printf
         * são aplicadas ao format.
         */
        System.out.println( "format (formatacao):" );
        String str = String.format( "    %02d/%02d/%04d", 25, 2, 1985 );
        System.out.println( str );

    }

}
