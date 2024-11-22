package lab3.problem_1.abstructs;

abstract class Clothes {
    int size;
    String color;
    int price;
    Clothes(int  size, String color, int price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public abstract void wear();

    public void showDetails() {
        System.out.println("Size: " + size + " Color: " + color + " Price: " + price);
    }



}
