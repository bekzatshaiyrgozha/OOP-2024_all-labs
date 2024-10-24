package problem_1_a;


public  class Sphere extends Shape3D{
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public double volume() {
        return Math.PI * radius * radius;
    }
    public double surfaceArea() {
        return 2 * Math.PI * radius * radius;
    }

}
