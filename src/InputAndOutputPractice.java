import java.util.Scanner;

public class InputAndOutputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" What is your name ?");

        String name = sc.nextLine();

        System.out.println(" Hello " + name + "!");
    }
}
