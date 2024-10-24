package lab_2.Problem_5;

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Tweet";
    }
}