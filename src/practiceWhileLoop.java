import java.util.Scanner;

public class practiceWhileLoop {
    public static void main(String[] args) {
        //int i=1;
        System.out.print(" Guess a number - ");

        Scanner sc = new Scanner(System.in);

        int number  = sc.nextInt();



        while(number!=7) {
            System.out.println(" u guessed it wrong ");
            number = sc.nextInt();
        }

        System.out.println(" u guessed it right ");
    }
}
