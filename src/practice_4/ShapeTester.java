package practice_4;

import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;

public class ShapeTester {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(50, 50, Color.RED, 50));
        shapes.add(new Rectangle(150, 100, Color.BLUE, 100, 50));
        shapes.add(new Triangle(300, 150, Color.GREEN, 100, 80));

        JFrame frame = new JFrame("Shape Drawing");
        frame.setSize(400, 400);

        ShapePanel shapePanel = new ShapePanel(shapes);
        frame.add(shapePanel);

        frame.setVisible(true);
    }
}
