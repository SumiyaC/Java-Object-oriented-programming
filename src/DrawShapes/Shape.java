package DrawShapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {

protected int x;

protected int y;

protected Color color;

public Shape(int x, int y, Color color) {

this.x = x;

this.y = y;

this.color = color;

}

public abstract void draw(Graphics g);

public abstract double calculateArea();

public abstract double calculatePerimeter();

}