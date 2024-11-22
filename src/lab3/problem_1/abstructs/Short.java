package lab3.problem_1.abstructs;

public class Short extends Clothes{
    public Short(int size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void wear() {
        System.out.println("Short Wear in summer.");
    }
}
