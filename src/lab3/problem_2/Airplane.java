package lab3.problem_2;

public class Airplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }

    @Override
    public void move() {
        System.out.println("Airplane move");
    }
}
