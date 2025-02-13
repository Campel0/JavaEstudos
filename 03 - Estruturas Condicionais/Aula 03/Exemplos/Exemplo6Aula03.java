public class Exemplo6Aula03 {

    public static void main(String[] args) {
        

        // Variáveis booleanas armazenam true ou false
        boolean esta_chovendo = true;

        if( esta_chovendo ){
            System.out.println( "Leve guarda chuva" );
        }

        // Exemplo com operações lógicas

        boolean temEntrada = true;
        boolean temDinheiro = false;

        if( temDinheiro && temEntrada){
            System.out.println( "Pode entrar no cinema!" );
        }
        else{
            System.out.println( "Não pode entrar." );
        }

    }
    
}
