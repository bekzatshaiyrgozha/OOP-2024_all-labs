package lab3.problem_1.interfaces;

public class Airplane implements CanHaveFly,CanHaveFueling,MoveAble{
    @Override
    public void canHaveFueling() {
        System.out.println("Airplane Can Fueling");
    }

    @Override
    public void move() {
        System.out.println(" Airplane Moving in run way.");
    }

    @Override
    public void fly() {
        System.out.println("Airplane Flying");
    }



}
