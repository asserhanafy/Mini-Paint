package backend;

import java.util.HashMap;

public class Square extends ShapeClass {

    public Square(double length) {
        this.properties = new HashMap<>();
        this.properties.put("length", length);
    }

    public void draw(java.awt.Graphics canvas) {
        int length = properties.get("length").intValue();
        canvas.setColor(color);
        canvas.drawRect(position.x, position.y, length, length);
        if (fillColor != null) {
            canvas.setColor(fillColor);
            canvas.fillRect(position.x, position.y, length, length);
        }
    }
}
