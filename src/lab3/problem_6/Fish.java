package lab3.problem_6;

public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);

    }

    @Override
    public void getSound() {
        System.out.println("Fish sound Blub");

    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
