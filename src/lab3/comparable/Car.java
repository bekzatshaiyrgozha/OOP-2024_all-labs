package lab3.comparable;

public class Car implements Comparable<Car> {
    private int year;
    private String model;
    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;


    }

    @Override
    public int compareTo(Car o) {
        if (this.year > o.year) {
            return 1;

        }
        if (this.year < o.year) {
            return -1;
        }
        return 0;
    }
}
