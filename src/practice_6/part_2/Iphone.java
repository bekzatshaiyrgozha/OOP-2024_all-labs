package practice_6.part_2;

public class Iphone extends Device implements SellableAnaPlugginable{
    double price;
    public Iphone(String name ,double price){
        super(name);

        this.price = price;
    }

    @Override
    public void plug() {
        System.out.println("Iphone plug able.");
    }

    @Override
    public void sell() {
        System.out.println("Iphone sell able.");
    }

    public String toString(){
        return "Iphone " + price;
    }
}
