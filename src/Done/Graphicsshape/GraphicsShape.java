/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.Graphicsshape;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class GraphicsShape extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new GraphicsShape();
    }
    
    public GraphicsShape() {
        super("Графика");
        setBounds(600, 400, 850, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawLine(20, 40, 200, 200);
        Color oldColor = g2.getColor();
        System.out.println(oldColor);
        Color newColor = new Color(255, 0, 0);
        g2.setColor(newColor);
        g2.drawLine(20, 40, 150, 200);
        g2.setColor(oldColor);
        g2.drawRect(150, 250, 100, 20);
        g2.setColor(newColor);
        g2.fillRect(151, 251, 99, 19);
        g2.setColor(oldColor);
        g2.drawRoundRect(20, 90, 240, 50, 30, 40);
        g2.drawOval(200, 100, 50, 60);
        g2.drawOval(400, 100, 80, 80);
        g2.setStroke(new BasicStroke(5));
        g2.drawArc(150, 100, 40, 50, 0, -90);
        g2.setStroke(new BasicStroke(1));
        int[] arrayX = {30, 120, 180, 270};
        int[] arrayY = {180, 180, 200, 250};
        Polygon p = new Polygon(arrayX, arrayY, 4);
        g2.drawPolygon(p);
        newColor = new Color(0, 255, 0);
        g2.setColor(newColor);
        Font font = new Font("Tahoma", Font.BOLD | Font.ITALIC, 40);
        g2.setFont(font);
        g2.drawString("Hello World", 270, 120);
        g2.setPaint(new GradientPaint(0, 0, Color.BLUE, 100, 200, Color.RED, true));
        g2.fill(new Ellipse2D.Double(50, 50, 200, 100));
        for (int i = 0; i < 100; i++) {
            Color randColor = new Color(
                (int) Math.ceil(Math.random() * 255),
                (int) Math.ceil(Math.random() * 255),
                (int) Math.ceil(Math.random() * 255)
            );
            g2.setColor(randColor);
            int x = (int) Math.ceil(Math.random() * getSize().width);
            int y = (int) Math.ceil(Math.random() * getSize().height - 50) + 50;
            g2.fillOval(x, y, 5, 5);
        }
    }
    
}
