package backend;

import java.awt.Point;

public class Line extends ShapeClass {

    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.position = startPoint;
        this.endPoint = endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void draw(java.awt.Graphics canvas) {
        canvas.setColor(color);
        canvas.drawLine(position.x, position.y, endPoint.x, endPoint.y);
    }
}
