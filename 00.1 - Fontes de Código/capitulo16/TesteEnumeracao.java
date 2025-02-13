/*
 * Arquivo: capitulo16/TesteEnumeracao.java
 * Autor: Prof. Dr. David Buzatto
 */
public class TesteEnumeracao {

    public static void main( String[] args ) {

        Usuario usuario = new Usuario( 
            "davidbuzatto@ifsp.edu.br", "12345", TipoUsuario.ADMINISTRADOR );
        
        System.out.println( usuario );

        if ( usuario.getTipo() == TipoUsuario.PADRAO ) {
            System.out.println( "Usuário padrão (usando if)" );
        }

        switch ( usuario.getTipo() ) {

            case ADMINISTRADOR:
                System.out.println( "Usuário administador (usando switch)" );
                break;

            case MODERADOR:
                System.out.println( "Usuário moderador (usando switch)" );
                break;

            case PADRAO:
                System.out.println( "Usuário padrao (usando switch)" );
                break;

        }

    }

}