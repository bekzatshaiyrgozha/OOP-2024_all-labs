package lab3.problem_5;

public class Chocolate implements Comparable<Chocolate> {

    private double weight;
    private String name;
    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Chocolate o) {
        if (this.weight > o.weight) {
            return 1;
        }
        if (this.weight < o.weight) {
            return -1;
        }
        return 0;
    }
    public String toString() {
        return "Chocolate weight=" + weight + ", name=" + name;
    }
}
