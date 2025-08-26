public class practicePassByReference {
    public static void main(String[] args) {
        int grades[] = { 85, 92, 95};
        System.out.println(" Initial Grades ");

        for (int i = 0; i < 3; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();

        fakeGrades(grades);

        System.out.println(" Grades After Alteration ");

        for (int i = 0; i < 3; i++) {
            System.out.print(grades[i] + " ");
        }


    }

    public static void fakeGrades(int[] alterGrades) {
        alterGrades[0] = 91;

        System.out.println(" This is where grades are being altered ");

        for (int i = 0; i < 3; i++) {
            System.out.print(alterGrades[i] + " ");
        }
        System.out.println();
    }
}
