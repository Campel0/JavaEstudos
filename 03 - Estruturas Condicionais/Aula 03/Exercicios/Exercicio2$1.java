import java.util.Scanner;

public class Exercicio2$1 {

    public static void main( String[] args) {
        Scanner scan = new Scanner( System.in );

        int n1;
        //int n2;

        System.out.println( "Entre com um numero: " );
        n1 = Integer.parseInt( scan.nextLine() );

        if(  n1 % 2 == 0 ){
            System.out.printf( "O numero %d e par.", n1 );
        }
        else{
            System.out.printf( "O numero %d e impar.", n1 );
        }
        
        //System.out.println( "\nEntre com um numero: " );
        //n2 = Integer.parseInt( scan.nextLine() );

        //if( n2 % 2 == 0 ){
           // System.out.printf( "O numero %d e par.", n2 );
        //}
        //else{
        //    System.out.printf( "O numero %d e impar.", n2 );
       // }

        scan.close();

    }
    
}
