package practice_4;

import java.awt.Graphics;

class Triangle extends Shape {
    private int base, height;

    public Triangle(int positionX, int positionY, Color color, int base, int height) {
        super(positionX, positionY, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color.toAwtColor());
        int[] xPoints = {positionX, positionX + base / 2, positionX - base / 2};
        int[] yPoints = {positionY, positionY + height, positionY + height};
        g.drawPolygon(xPoints, yPoints, 3);
    }
}
