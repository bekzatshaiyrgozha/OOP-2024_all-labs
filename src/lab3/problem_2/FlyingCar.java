package lab3.problem_2;

public class FlyingCar implements Flyable{
    @Override
    public void move() {
        System.out.println("FlyingCar move");
    }

    @Override
    public void fly() {
        System.out.println("FlyingCar fly");
    }
}
