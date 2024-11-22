package lab3.problem_1.interfaces;

public class FlyingCar implements CanHaveFly,CanHaveFueling,MoveAble{
    @Override
    public void canHaveFueling() {
        System.out.println("FlyingCar canHaveFueling");
    }

    @Override
    public void fly() {
        System.out.println("FlyingCar fly");
    }

    @Override
    public void move() {
        System.out.println("FlyingCar move");
    }
}
