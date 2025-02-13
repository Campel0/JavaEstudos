public class Exemplo5Aula03 {
    
    public static void main(String[] args) {
        
        // Sintaxe: condição ? valor_se_verdadeiro : valor_se_falso

        int numero = 10;

        String resultado = ( numero % 2 == 0 ) ? "Par" : "Impar";
        System.out.println( resultado );

        // Equivalente a:

       // if ( numero % 2 == 0 ) {
       //     resultado = "par";
       // }
       // else{
       //     resultado = "Impar";
       // }

    }

}
