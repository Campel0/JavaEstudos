/*
 * Arquivo: capitulo02/EstruturasCondicionaisStdbool.java
 * Autor: Prof. Dr. David Buzatto
 */

import java.util.Scanner;

public class EstruturasCondicionaisBoolean {

    public static void main( String[] args ) {

        // variável do tipo boolean
        boolean maiorDeIdade;
        int idade;

        Scanner scan = new Scanner( System.in );

        System.out.print( "Entre com sua idade: " );
        idade = Integer.parseInt( scan.nextLine() );

        if ( idade < 18 ) {
            // false é o valor que indica falso
            maiorDeIdade = false;
        } else {
            // true é o valor que indica verdadeiro
            maiorDeIdade = true;
        }

        // o if anterior poderia ser substituído por
        maiorDeIdade = idade >= 18;

        // ou
        maiorDeIdade = !( idade < 18 );

        /* 
         * maiorDeIdade armazena verdadeiro ou falso, sendo assim
         * pode ser usado diretamente no lugar do teste lógico.
         */
        if ( maiorDeIdade ) {
            System.out.println( "Voce eh maior de idade!" );
        } else {
            System.out.println( "Voce nao eh maior de idade!" );
        }

        scan.close();

    }

}
