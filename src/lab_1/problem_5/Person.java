package lab_1.problem_5;

public class Person{
    private Gender gender;
    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String toString() {
        return gender == Gender.BOY ? "B" : "G";
    }
}
