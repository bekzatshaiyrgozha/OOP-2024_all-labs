package lab3.problem_1.interfaces;

public class Car implements CanHaveFueling,MoveAble{
    @Override
    public void canHaveFueling() {
        System.out.println(" Car Can Have Fueling");
    }
    public void move() {
        System.out.println("Car Can move");
    }
}
