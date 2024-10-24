package lab_1.problem_1;

public class Data {
    private double sum = 0;
    private int count = 0;
    private double max = Double.NEGATIVE_INFINITY;

    public void addValue(double value) {
        sum+=value;
        count++;
        if(value>max) {
            max = value;
        }
    }
    public double avg() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public double getMax() {
        if (count == 0) {
            return 0;
        }
        return max;
    }
}