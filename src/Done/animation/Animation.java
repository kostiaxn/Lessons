/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.animation;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public class Animation extends JFrame implements KeyListener, ActionListener {
    
    private int x = 20;
    private int y = 200;
    final int DELTA = 10;
    private Timer timer;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Animation();
    }
    
    public Animation() {
        super("Анимация");
        setBounds(600, 400, 850, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        setLayout(new FlowLayout());
        JButton button = new JButton("Старт");
        button.addActionListener((ae) -> {
            if (ae.getActionCommand() == "Старт") {
                button.setText("Стоп");
                timer.start();
            }
            else if (ae.getActionCommand() == "Стоп") {
                button.setText("Старт");
                timer.stop();
            }
        });
        add(button);
        setVisible(true);
        timer = new Timer(50, this);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.GREEN);
        if (x + 50 > getSize().width) x = getSize().width - 50;
        if (y + 50 > getSize().height) y = getSize().height - 50;
        if (x < 0) x = 0;
        if (y < 0) y = 0;
        g2.fillRect(x, y, 50, 50);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int code = ke.getKeyCode();
        if (code == 38) y -= DELTA;
        else if (code == 39) x += DELTA;
        else if (code == 40) y += DELTA;
        else if (code == 37) x -= DELTA;
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        x += 10;
        System.out.println(x);
        repaint();
    }
    
}
