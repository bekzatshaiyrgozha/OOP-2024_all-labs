package lab3.problem_6;

public class Cat extends Animal implements Animalin,Move{

    public Cat(String name,int age) {
        super(name, age);

    }
    public void getSound() {
        System.out.println("cat meow.");
    }

    public void walk(){
        System.out.println("cat walking.");
    }

    @Override
    public void move() {
        System.out.println("cat movement.");
    }
}
