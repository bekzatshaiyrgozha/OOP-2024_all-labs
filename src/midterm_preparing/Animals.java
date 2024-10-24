package midterm_preparing;

public class Animals {
    private String name;
    private int age;
    private String gender;
    protected String breed;
    public Animals(String name, int age, String gender, String breed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;


    }
    public String toString(){
        return name + " " + age + " " + gender + " " + breed;
    }
}