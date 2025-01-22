package backend;

import java.util.HashMap;

public class Circle extends ShapeClass {

    public Circle(double radius) {
        this.properties = new HashMap<>();
        this.properties.put("radius", radius);
    }

    public void draw(java.awt.Graphics canvas) {
        int radius = properties.get("radius").intValue();
        int diameter = radius * 2;
        canvas.setColor(color);
        canvas.drawOval(position.x - radius, position.y - radius, diameter, diameter);
        if (fillColor != null) {
            canvas.setColor(fillColor);
            canvas.fillOval(position.x - radius, position.y - radius, diameter, diameter);
        }
    }
}
