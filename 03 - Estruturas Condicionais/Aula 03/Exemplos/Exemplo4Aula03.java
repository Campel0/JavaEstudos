public class Exemplo4Aula03 {
    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 3;

        // Operadores relacionais: >, <, >=, <=

        if( a > b ){
            System.out.println( "a eh  maior que b\n" );
        }

        // Operadores de igualdade: ==, !=

        if( a == b ){
            System.out.println( "Sao iguais\n" );
        }
        else{ 
            System.out.println( "Sao diferentes\n" );
        }

        // Operadores lógicos: && (e), || (ou), ! (não)

        String usuario = "admin";
        String senha = "1234";

        if( usuario.equals( "admin" ) && senha.equals( "1234") ) {
            System.out.println( "Login bem-sucedido!" );
        }

    }

}
