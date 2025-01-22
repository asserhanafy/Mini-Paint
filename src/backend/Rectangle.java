package backend;

import java.util.HashMap;

public class Rectangle extends ShapeClass {

    public Rectangle(double length, double width) {
        this.properties = new HashMap<>();
        this.properties.put("length", length);
        this.properties.put("width", width);
    }

    public void draw(java.awt.Graphics canvas) {
        int length = properties.get("length").intValue();
        int width = properties.get("width").intValue();
        canvas.setColor(color);
        canvas.drawRect(position.x, position.y, length, width);
        if (fillColor != null) {
            canvas.setColor(fillColor);
            canvas.fillRect(position.x, position.y, length, width);
        }
    }
}
