package Bonus_Task_2;

public class Detective extends Person {
    private String qualification;

    public Detective(String name, int age, String gender, String education, String qualification) {
        super(name, age, gender, education);
        this.qualification = qualification;
    }

    public void detectSpyStatus(Spy spy) {
        System.out.println("Detective is checking " + spy.getName());
        if (spy.isSpy()) {
            System.out.println("Detective says: " + spy.getName() + " is a spy!!!");
            if (isQualified()) {

                System.out.println("Spy's Details: " + spy.getDetails());
            } else {
                System.out.println("As a beginner, I cannot reveal the spy's details.");
            }
        } else {
            System.out.println("Detective says: " + spy.getName() + " is not a spy.");
            System.out.println("Key: " + spy.getKey());
        }
    }
    public static boolean isPowerOfTwo(int number) {
        if (number <= 0) {
            return false;
        }
        while (number % 2 == 0) {
            number /= 2;
        }
        return number == 1;
    }


    private boolean isQualified() {
        return qualification.equalsIgnoreCase("expert");
    }
}
