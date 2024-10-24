package practice_4;

import java.awt.Graphics;

class Circle extends Shape {
    private int radius;

    public Circle(int positionX, int positionY, Color color, int radius) {
        super(positionX, positionY, color);
        this.radius = radius;
    }


    public void draw(Graphics g) {
        g.setColor(color.toAwtColor());
        g.drawOval(positionX, positionY, radius * 2, radius * 2);
    }
}
