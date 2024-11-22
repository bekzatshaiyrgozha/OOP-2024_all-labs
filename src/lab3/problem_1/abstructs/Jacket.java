package lab3.problem_1.abstructs;
public class Jacket extends Clothes{
    public Jacket(int size, String color, int price) {
        super(size,color,price);


    }

    @Override
    public void wear() {
        System.out.println("Jacket is wearing in winter");
    }
}
