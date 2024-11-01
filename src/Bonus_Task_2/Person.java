package Bonus_Task_2;

import java.util.Random;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String education;
    private int generatedKey;

    public Person(String name, int age, String gender, String education) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.education = education;
        this.generatedKey = generateKey();
    }

    private int generateKey() {
        Random random = new Random();
        return random.nextInt(10);
    }



    public String getDetails() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Education: " + education + ", Key: " + generatedKey;
    }

    public String getName() {
        return name;
    }

    public int getGeneratedKey() {
        return generatedKey;
    }


    public int getKey() {
        return generatedKey;
    }
}
