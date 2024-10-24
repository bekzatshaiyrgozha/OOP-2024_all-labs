package lab_2.Problem_5;

public abstract class Person {
    protected String name;
    protected int age;
    protected Animal animal;

    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    public void assignPet(Animal animal) {
        this.animal = animal;
    }

    public void removePet() {
        this.animal = null;
    }

    public boolean hasPet() {
        return this.animal != null;
    }

    public Animal getAnimal() {
        return this.animal;
    }
    // Жануарлардың тізімін көрсететін код
    public void showPets() {
        String pets = "Pets: ";
        if (this.animal != null) {
            pets += this.animal.toString();
        } else {
            pets += "No pets";
        }
        System.out.println(pets);
    }


    public void givePetTo(Person anotherPerson) {
        if (this.animal instanceof Dog && anotherPerson instanceof PhDStudent) {
            System.out.println(anotherPerson.getName() + " cannot accept a dog! The dog remains with " + this.name);
        } else {
            anotherPerson.assignPet(this.animal);
            System.out.println(this.name + " gives " + this.animal + " to " + anotherPerson.getName());
            this.removePet(); // Жануарды берілгеннен кейін өзінен алып тастау
        }
    }



    public abstract String getOccupation();


    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Animal: " + (animal != null ? animal.toString() : "No pet");
    }



    public String getName() {
        return name; // аты керек болғанда алу үшін
    }
}
