public class practicePattern8 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > 4-i  ; j--) {
                System.out.print(" ");
            }
            for (int k = 9; k >= 2*i+1  ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
