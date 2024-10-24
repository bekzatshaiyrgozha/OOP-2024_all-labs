package lab_1.problem_2;

public class Macbook{
    private final String model;

    private int year ;
    private MacbookType type;

    private static int  countMac = 0;

    public Macbook(String model, MacbookType type, int year) {
        this.model = model;
        this.type = type;
        this.year = year;
        countMac++;
    }
    public static int getTotalMacbooks() {
        return countMac;
    }
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Year: " + year);
    }
}