/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.guimenu;

import javax.swing.*;

/**
 *
 * @author Admin
 */
public class GUIMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Моя программа");
        MyListener listener = new MyListener(frame);
        
        frame.setBounds(600, 400, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar mb = new JMenuBar();
        JMenu main = new JMenu("Программа");
        JMenuItem exit = new JMenuItem("Выход");
        main.add(exit);
        mb.add(main);
        
        JMenu bg = new JMenu("Фон");
        
        JMenuItem blue = new JMenuItem("Синий");
        JMenuItem yellow = new JMenuItem("Жёлтый");
        bg.add(blue);
        bg.add(yellow);
        mb.add(bg);
        
        JMenu submenu = new JMenu("Подменю");
        bg.add(submenu);
        JMenuItem submenuItem = new JMenuItem("Пункт в подменю");
        submenu.add(submenuItem);
        submenu.addSeparator();
        JCheckBoxMenuItem checkboxItem = new JCheckBoxMenuItem("Чекбокс");
        submenu.add(checkboxItem);
        
        frame.setJMenuBar(mb);
        
        exit.addActionListener(listener);
        blue.addActionListener(listener);
        yellow.addActionListener(listener);
        submenuItem.addActionListener(listener);
        checkboxItem.addActionListener(listener);
        
        frame.setVisible(true);
    }
    
}
