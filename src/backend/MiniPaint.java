package backend;

import java.util.ArrayList;
import java.util.List;

public class MiniPaint implements DrawingEngine {

    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public Shape[] getShapes() {
        return shapes.toArray(new Shape[0]);
    }

    public void refresh(java.awt.Graphics canvas) {
        for (Shape shape : shapes) {
            shape.draw(canvas);
        }
    }
}
