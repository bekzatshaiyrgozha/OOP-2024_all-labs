package practice_6.part_1;

class Cat extends Animal implements CanHavePizza, Breath, Movable {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eatPizza() {
        if(pizzaSize < 4){
            System.out.println("Cat can eat pizza.");
        }else {
            System.out.println("Cat can not eat pizza.");
        }
    }

    @Override
    public void breath() {
        System.out.println("Cat breaths.");
    }

    @Override
    public void move() {
        System.out.println("Cat can move.");
    }
}
