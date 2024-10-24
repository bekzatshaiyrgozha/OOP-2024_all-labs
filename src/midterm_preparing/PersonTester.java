package midterm_preparing;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Vector;
public class PersonTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Person> people = new HashSet<>();

        Vector <Person> persons = new Vector<>();
        int numberOfPeople = input.nextInt();
        input.nextLine();

        for(int i = 0; i < numberOfPeople; i++) {
            System.out.print("Enter name: ");
            String name = input.nextLine();
            System.out.print("Enter age: ");
            int age = input.nextInt();
            Person person = new Person(name, age);

            System.out.print("Enter year: ");
            int year = input.nextInt();
            input.nextLine();

            System.out.print("Enter fee: ");
            int fee = input.nextInt();
            input.nextLine();
            System.out.print("Enter program: ");
            String program = input.nextLine();

            System.out.print("Enter salary: ");
            double salary = input.nextDouble();
            input.nextLine();

            StudentKBTU student = new StudentKBTU(name,age,year,fee,program);
            StaffKBTU staff = new StaffKBTU(name,age,salary);

            people.add(person);
            people.add(student);
            people.add(staff);

            persons.add(person);
            persons.add(staff);
            persons.add(student);
        }

        for(Person person : people) {
            System.out.println(person);
        }
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
