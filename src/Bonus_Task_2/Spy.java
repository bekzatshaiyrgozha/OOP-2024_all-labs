package Bonus_Task_2;

public class Spy extends Person {
    public Spy(String name, int age, String gender, String education) {
        super(name, age, gender, education);
    }


    public boolean isSpy() {
        return Detective.isPowerOfTwo(getGeneratedKey());
    }
}
