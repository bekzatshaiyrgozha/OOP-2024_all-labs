package lab3.problem_6;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> personList = new ArrayList<>();
    public void add(Person person) {
        personList.add(person);
    }
    public  void remove(Person person) {
        personList.remove(person);
    }

    public List<Person> getPersonWithPet(){
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if(person.hasPet()){
                result.add(person);
            }
        }
        return result;


    }
    public List<Person> getPersonWithoutPet(Person person){
        List<Person> result = new ArrayList<>();
        for (Person person1 : personList) {
            if(!person1.hasPet()){
                result.add(person1);
            }
        }
        return result;

    }

    @Override
    public String toString() {
        return "PersonRegistry{" +
                "personList=" + personList +
                '}';
    }
}
