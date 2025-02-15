import java.util.Scanner;

public class Exercicio2$4 {
    
    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );

        int n1;
        int n2;
        int n3;

        System.out.print( "N1: " );
        n1 = Integer.parseInt( scan.nextLine() );

        System.out.print( "N2: " );
        n3 = Integer.parseInt( scan.nextLine() );

        System.out.print( "N3: " );
        n2 = Integer.parseInt( scan.nextLine() );

        // Ordenando os números em ordem crescente

        if( n1 > n2 ){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if( n1 > n3){
            int temp = n1;
            n1 = n3;
            n3 = temp;
        }
        if( n2 > n3 ){
            int temp = n2;
            n2 = n3;
            n3 = temp;
        }

        System.out.printf("%d <= %d <= %d", n1, n2, n3);

        scan.close();

    }
}
