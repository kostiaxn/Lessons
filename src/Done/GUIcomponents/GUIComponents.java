/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.GUIcomponents;

import javax.swing.*;

/**
 *
 * @author Admin
 */
public class GUIComponents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Моя программа");
        frame.setBounds(600, 400, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        
        JButton button = new JButton("Кнопка");
        panel.add(button);
        
        JLabel label = new JLabel("Текст метки");
        panel.add(label);
        
        JCheckBox check = new JCheckBox("Текст чекбокса");
        panel.add(check);
        
        JTextField tf = new JTextField("Текст по умолчанию");
        panel.add(tf);
        
        ButtonGroup bg = new ButtonGroup();
        
        JRadioButton rb_1 = new JRadioButton("Радио-кнопка 1");        
        JRadioButton rb_2 = new JRadioButton("Радио-кнопка 2");
        bg.add(rb_1);
        bg.add(rb_2);
        panel.add(rb_1);
        panel.add(rb_2);
        
        JTextArea ta = new JTextArea("Текст в текстовой области");
        panel.add(ta);
        
        String[][] data = {{"1", "2"}, {"3", "4"}};
        String[] cols = {"Столбец 1", "Столбец 2"};
        
        JTable table = new JTable(data, cols);
        JScrollPane scroll = new JScrollPane(table);
        panel.add(scroll);
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
