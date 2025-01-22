package backend;

import java.awt.Color;
import java.awt.Point;
import java.util.Map;

public abstract class ShapeClass implements Shape {

    protected Point position;
    protected Map<String, Double> properties;
    protected Color color;
    protected Color fillColor;

    public void setPosition(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return this.position;
    }

    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }

    public Map<String, Double> getProperties() {
        return this.properties;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    public Color getFillColor() {
        return this.fillColor;
    }

    public abstract void draw(java.awt.Graphics canvas);
}
