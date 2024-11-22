package lab3.problem_1.interfaces;

public class Tester {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Car car = new Car();
        FlyingCar flyingCar = new FlyingCar();
        Rocket rocket = new Rocket();

        airplane.fly();
        airplane.canHaveFueling();
        airplane.move();
        car.canHaveFueling();
        car.move();
        flyingCar.canHaveFueling();
        flyingCar.move();
        flyingCar.fly();
        rocket.fly();


    }
}
