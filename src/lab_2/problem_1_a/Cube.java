package lab_2.problem_1_a;

public class Cube extends Shape3D{
    private double height;
    Cube(double height) {
        this.height = height;
    }
    public double volume() {
        return height*height*height;
    }
    public double surfaceArea() {
        return 2*height*height;
    }
}