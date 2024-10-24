package practice_4;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

class ShapePanel extends JPanel {
    private List<Shape> shapes = new ArrayList<Shape>();

    public ShapePanel(List<Shape> shapes) {

        this.shapes = shapes;

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
