package lab_2.Problem_5;

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Meow";
    }
}