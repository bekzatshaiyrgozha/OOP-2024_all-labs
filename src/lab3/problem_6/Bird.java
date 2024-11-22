package lab3.problem_6;

public class Bird extends Animal implements Flyable{
    public Bird(String name, int age) {
        super(name, age);
    }
    public void getSound() {
        System.out.println("Birds tree tree");
    }
    public void fly() {
        System.out.println("Birds fly");
    }



}
