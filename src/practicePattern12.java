public class practicePattern12 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j);
            }
            for (int k = 0; k < 2*(3-i); k++) {
                System.out.print(" ");
            }
            for (int l = i+1; l >= 1 ; l--) {
                System.out.print(l);

            }
            System.out.println();
        }
    }
}
