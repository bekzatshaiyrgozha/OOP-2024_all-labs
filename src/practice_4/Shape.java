package practice_4;

import java.awt.Graphics;

abstract class Shape {
    protected int positionX, positionY;
    protected Color color;

    public Shape(int positionX, int positionY, Color color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
    }


    public abstract void draw(Graphics g);
}
