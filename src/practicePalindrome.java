public class practicePalindrome {
    public static void main(String[] args) {
        int num = 145265;

        int rem = num % 10;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + rem;
            num = num / 10;
            rem = num % 10;

        }

        System.out.println("Reversed Number: " + rev);
    }
}
