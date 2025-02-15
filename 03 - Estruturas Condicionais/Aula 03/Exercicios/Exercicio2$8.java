import java.util.Scanner;

public class Exercicio2$8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        double n1;
        double n2;
        double n3;

        System.out.print( "N1: " );
        n1 = Double.parseDouble( scan.nextLine() );

        System.out.print( "N2: " );
        n2 = Double.parseDouble( scan.nextLine() );

        System.out.print( "N3: " );
        n3 = Double.parseDouble( scan.nextLine() );

        double soma;

        if( n1 <= n2 && n1 <= n3 ){
            soma = n3 + n2;
        }
        else if( n2 <= n1 && n2 <= n3 ){
            soma = n1 + n3;
        }
        else{
            soma = n2 + n1;
        }

        System.out.printf("A soma dos dois numeros maiores fornecidos e %.2f\n", soma);

        scan.close();

    }
    
}
