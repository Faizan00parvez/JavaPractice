public class countDigit {
    public static void main(String[] args) {
        int n = 123456; // int doesn't take decimal values.
        int count = 0;
        while (n > 0) {
            n = n / 10; // removes the last digit from the number as 123456/10 = 12345
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
