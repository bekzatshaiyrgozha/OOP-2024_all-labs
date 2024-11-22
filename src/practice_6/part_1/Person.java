package practice_6.part_1;

import practice_6.part_2.IGame;

public  class Person implements CanHavePizza, CanHaveParty, Movable, Breath {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public void eatPizza() {
        System.out.println("Person can eat pizza.");
    }

    @Override
    public void dance() {
        System.out.println("Person can dance.");
    }

    @Override
    public void move() {
        System.out.println("Person can move.");
    }

    @Override
    public void breath() {
        System.out.println("Person can breath.");
    }

}
