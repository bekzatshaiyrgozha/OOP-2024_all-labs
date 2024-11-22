package lab3.problem_6;

public class Dog extends Animal implements Animalin{
    public Dog(String name, int age) {
        super(name, age);


    }

    @Override
    public void getSound() {
        System.out.println("Dog is sounding");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}
