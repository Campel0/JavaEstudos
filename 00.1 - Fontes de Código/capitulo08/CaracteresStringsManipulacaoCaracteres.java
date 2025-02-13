/* 
 * Arquivo: capitulo08/CaracteresStringsManipulacaoCaracteres.java
 * Autor: Prof. Dr. David Buzatto
 */
 
public class CaracteresStringsManipulacaoCaracteres {

    public static void main( String[] args ) {

        /* 
         * boolean isLetter( char c )
         * 
         * Retorna true se c for uma letra ou falso em caso contrário.
         */
        System.out.printf ( "%s\n%s%s\n%s%s\n%s%s\n%s%s\n\n", 
                "De acordo com Character.isLetter: ",
                Character.isLetter('A') ? 
                "A eh uma " : "A nao eh uma ", "letra",
                Character.isLetter('b') ? 
                "b eh uma " : "b nao eh uma ", "letra",
                Character.isLetter('&') ? 
                "& eh uma " : "& nao eh uma ", "letra",
                Character.isLetter('4') ? 
                "4 eh uma " : "4 nao eh uma ", "letra" );

        /* 
         * boolean isLetterOrDigit( char c )
         * 
         * Retorna true se c for uma letra ou um dígito ou falso em
         * caso contrário.
         */
        System.out.printf( "%s\n%s%s\n%s%s\n%s%s\n\n",
                "De acordo com Character.isLetterOrDigit: ",
                Character.isLetterOrDigit('A') ? 
                "A eh um " : "A nao eh um ", "digito ou uma letra",
                Character.isLetterOrDigit('8') ? 
                "8 eh um " : "8 nao eh um ", "digito ou uma letra",
                Character.isLetterOrDigit('#') ? 
                "# eh um " : "# nao eh um ", "digito ou uma letra" );

        /* 
         * boolean isDigit( char c )
         * 
         * Retorna true se c for um dígito ou falso em caso contrário.
         */
        System.out.printf( "%s\n%s%s\n%s%s\n\n",
                "De acordo com Character.isDigit: ",
                Character.isDigit('8') ? 
                "8 eh um " : "8 nao eh um ", "digito",
                Character.isDigit('#') ? 
                "# eh um " : "# nao eh um ", "digito" );

        /* 
         * boolean isLowerCase( char c )
         * 
         * Retorna true se c for uma letra minúscula ou falso
         * em caso contrário.
         */
        System.out.printf( "%s\n%s%s%s\n%s%s%s\n\n",
                "De acordo com Character.isLowerCase:",
                "a", Character.isLowerCase('a') ? 
                " eh um " : " nao eh um ", 
                "caractere em caixa baixa (minusculo)",
                "A", Character.isLowerCase('A') ? 
                " eh um " : " nao eh um ",
                "caractere em caixa baixa (minusculo)" );

        /* 
         * boolean isUpperCase( char c )
         * 
         * Retorna true se c for uma letra maiúscula ou falso em
         * caso contrário.
         */
        System.out.printf( "%s\n%s%s%s\n%s%s%s\n\n",
                "De acordo com Character.isUpperCase:",
                "a", Character.isUpperCase('a') ? 
                " eh um " : " nao eh um ",
                "caractere em caixa alta (maiusculo)",
                "A", Character.isUpperCase('A') ? 
                " eh um " : " nao eh um ",
                "caractere em caixa alta (maiusculo)" );

        /* 
         * char toLowerCase( int c )
         * 
         * Se c for uma letra maiúscula, toLowerCase retorna c como uma
         * letra minúscula. Caso contrário, toLowerCase retorna o argumento
         * inalterado.
         */
        System.out.printf( "%s\n%s%c\n%s%c\n%s%c\n\n",
                "Usando Character.toLowerCase:",
                "tolower('a'): ", Character.toLowerCase('a'),
                "tolower('A'): ", Character.toLowerCase('A'),
                "tolower('#'): ", Character.toLowerCase('#') );

        /* 
         * char toUpperCase( int c )
         * 
         * Se c for uma letra minúscula, toUpperCase retorna c como uma
         * letra maiúscula. Caso contrário, toUpperCase retorna o argumento
         * inalterado.
         */
        System.out.printf( "%s\n%s%c\n%s%c\n%s%c\n\n",
                "Usando Character.toUpperCase:",
                "toupper('a'): ", Character.toUpperCase('a'),
                "toupper('A'): ", Character.toUpperCase('A'),
                "toupper('#'): ", Character.toUpperCase('#') );

        /* 
         * boolean isSpaceChar( int c )
         * 
         * Retorna um valor verdadeiro se c for um caractere de espaço
         * ou falso em caso contrário.
         */
        System.out.printf( "%s\n%s%s%s\n%s%s%s\n%s%s\n%s%s\n\n",
                "De acordo com Character.isSpaceChar:",
                "'Nova linha'", 
                Character.isSpaceChar('\n') ? " eh um " : " nao eh um ",
                "caractere de espaco",
                "'Tab. hor.'", 
                Character.isSpaceChar('\t') ? " eh um " : " nao eh um ",
                "caractere de espaco",
                Character.isSpaceChar(' ') ? "' ' eh um " : "% nao eh um ",
                "caractere de espaco",
                Character.isSpaceChar('%') ? "% eh um " : "% nao eh um ",
                "caractere de espaco" );
        
        /* 
         * boolean isWhitespace( int c )
         * 
         * Retorna um valor verdadeiro se c for um caractere de espaço
         * em branco ou falso em caso contrário.
         */
        System.out.printf( "%s\n%s%s%s\n%s%s%s\n%s%s\n%s%s",
                "De acordo com Character.isWhitespace:",
                "'Nova linha'",
                Character.isWhitespace('\n') ? " eh um " : " nao eh um ",
                "caractere de espaco em branco",
                "'Tab. hor.'",
                Character.isWhitespace('\t') ? " eh um " : " nao eh um ",
                "caractere de espaco em branco",
                Character.isWhitespace(' ') ? "' ' eh um " : "% nao eh um ",
                "caractere de espaco em branco",
                Character.isWhitespace('%') ? "% eh um " : "% nao eh um ",
                "caractere de espaco em branco" );

    }

}
