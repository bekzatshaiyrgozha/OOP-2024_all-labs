package lab3.problem_6;

import java.util.Objects;

public abstract class Person implements Vacatable,PetOwner{
    protected String name;
    protected int age;
    Animal pet;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void assignPet(Animal pet) {
        if (pet != null) {
            this.pet = pet;
        }

    }
    public void removePet() {
        this.pet = null;
    }
    public boolean hasPet(){
        return this.pet != null;
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }
    public void leavePetWith(Person person) {
        if (this.hasPet()) {
            person.assignPet(this.pet);
            this.removePet();
        } else {
            System.out.println(name + " doesn't have a pet to leave.");
        }
    }

    public void retrievePetFrom(Person person) {
        if (person.hasPet()) {
            this.assignPet(person.pet);
            person.removePet();
        } else {
            System.out.println(person.name + " doesn't have a pet to return.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(pet, person.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, pet);
    }
}
