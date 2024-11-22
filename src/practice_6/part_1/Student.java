package practice_6.part_1;



public class Student extends Person implements CanHavePizza, CanHaveParty, Movable, CanHaveRetake, Breath {
    int yearStudy;
    double gpa;

    public Student(String name, int age, int yearStudy, double gpa) {
        super(name, age);
        this.yearStudy = yearStudy;
        this.gpa = gpa;
    }
    @Override
    public void eatPizza() {
        if (gpa > 3){
            System.out.println("The student is eating pizza!");
        }
    }

    @Override
    public void dance() {
        if (gpa > 3){
            System.out.println("The student is eating pizza!");
        }

    }

    @Override
    public void move() {
        System.out.println("The student is moving!");
    }

    @Override
    public void canHaveRetake() {

        System.out.println("The student can have retake!");
    }

    @Override
    public void breath(){
        System.out.println("The student is breathing!");
    }



}