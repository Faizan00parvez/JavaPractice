public class practicePassByValue {
    public static void main(String[] args) {
        int originalAge = 24;

        fakeAge(originalAge);

        System.out.println(originalAge);
    }

    public static void fakeAge(int alterAge) {
        alterAge = 23;

        System.out.println(alterAge);
    }
}
