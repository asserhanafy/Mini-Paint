package frontend;

import backend.MiniPaint;

public class Panel extends javax.swing.JPanel {
    private MiniPaint paint;
    
    public Panel(MiniPaint paint) {
        this.paint = paint;
    }
    
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        paint.refresh(g);
    }

}
