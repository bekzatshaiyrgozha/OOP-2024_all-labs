package lab3.problem_2;

public class Tester {
    public static void main(String[] args) {
        Car car = new Car();
        Airplane airplane = new Airplane();
        FlyingCar flyingCar = new FlyingCar();

        car.move();

        airplane.move();
        airplane.fly();

        flyingCar.move();
        flyingCar.fly();


    }
}
