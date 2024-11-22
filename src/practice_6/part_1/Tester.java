package practice_6.part_1;


public class Tester {
    public static void main(String[] args) {
        Person bekzat = new Person("Bekzat", 23);
        Cat murka = new Cat("Murka", 23);
        Student student = new Student("Arman",18,2023,4);

        Restaurant restaurant = new Restaurant();
        restaurant.servePizza(bekzat);
        restaurant.servePizza(murka);
        restaurant.servePizza(student);

        System.out.println("\nStudents actions:");
        student.breath();
        student.eatPizza();
        student.move();
        student.dance();
        student.canHaveRetake();


        System.out.println("\nPerson actions:");
        bekzat.breath();
        bekzat.eatPizza();
        bekzat.move();
        bekzat.dance();

        System.out.println("\nCat actions:");
        murka.breath();
        murka.eatPizza();
        murka.move();

    }
}
