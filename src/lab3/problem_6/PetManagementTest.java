package lab3.problem_6;

public class PetManagementTest {
    public static void main(String[] args) {
        Person askhat = new Employee("Askhat", 30, "Engineer");
        Person symbat = new PhDStudent("Symbat", 26, "Computer Science", "AI Research");
        Person almas = new Employee("Almas", 20, "Engineer");

        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 3);

        askhat.assignPet(rex);
        symbat.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.add(askhat);
        registry.add(symbat);
        registry.add(almas);

        System.out.println("Before Vacation:");
        System.out.println(registry);

        askhat.leavePetWith(symbat);


        System.out.println("After Vacation Rex with Symbat:");
        System.out.println(registry);

        askhat.assignPet(rex);
        askhat.leavePetWith(almas);

        System.out.println("After Vacation Rex with Almas:");
        System.out.println(registry);

        askhat.retrievePetFrom(symbat);

        System.out.println("After Askhat returns Rex back with Askhat:");
        System.out.println(registry);
    }
}
