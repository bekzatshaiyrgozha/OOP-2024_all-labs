package Problem_5;

public class PetManagmentTester {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science");
        Person bekzat = new Employee("Bekzat",20,"IT");
        Animal rex = new Dog("Rex", 3);
        Animal murka = new Cat("Murka", 5);


        john.assignPet(rex);
        john.givePetTo(alice);


        bekzat.assignPet(murka);
        bekzat.givePetTo(alice);


        System.out.println(alice);
        System.out.println(john);
        System.out.println(bekzat);

        alice.givePetTo(bekzat);
        System.out.println(alice);
        System.out.println(john);
        System.out.println(bekzat);

    }
}
