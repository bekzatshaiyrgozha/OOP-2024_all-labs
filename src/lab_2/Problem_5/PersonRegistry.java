package lab_2.Problem_5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people = new ArrayList<>();


    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public List<Person> getPeopleWithPets() {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPeopleWithoutPets() {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (!person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Person Registry:\n");
        for (Person person : people) {
            result.append(person.toString()).append("\n");
        }
        return result.toString();
    }
}
