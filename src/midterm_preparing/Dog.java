package midterm_preparing;

public class Dog extends Animals{
    public Dog(String name, int age, String gender,String breed) {
        super(name, age, gender,breed);

    }
    public void eat() {
        System.out.println("Eating suiek.");
    }
}