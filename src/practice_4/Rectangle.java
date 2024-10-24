package practice_4;

import java.awt.Graphics;
class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int positionX, int positionY, Color color, int width, int height) {
        super(positionX, positionY, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color.toAwtColor());
        g.drawRect(positionX, positionY, width, height);
    }
}
