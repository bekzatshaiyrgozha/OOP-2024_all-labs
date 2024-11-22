package practice_6.part_1;

public class Restaurant {
    boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (eater instanceof Person) {
            System.out.println("Processing payment for the person.");
        } else {
            System.out.println("No payment required for non-person entities.");
        }
        return true;
    }
}
