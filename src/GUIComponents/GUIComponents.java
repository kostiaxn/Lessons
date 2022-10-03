package GUIComponents;

import javax.swing.*;

public class GUIComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Моя программа");
        frame.setBounds(300, 300, 300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("Кнопка");
        JLabel label = new JLabel("Текст метки");
        JCheckBox check = new JCheckBox("Текст чекбокса");
        JTextField tf = new JTextField("Текст по умолчанию");
        ButtonGroup bg = new ButtonGroup();
        JRadioButton rb_1 = new JRadioButton("Радио-кнопка 1");
        JRadioButton rb_2 = new JRadioButton("Радио-кнопка 2");
        JTextArea ta = new JTextArea("Текст в текстовой области");

        String[][] data = {{"1", "2"}, {"3", "4"} };
        String[] cols = {"Столбец 1", "Столбец 2"};
        JTable table = new JTable(data, cols);
        JScrollPane scroll = new JScrollPane(table);
        panel.add(scroll);

        panel.add(ta);
        bg.add(rb_1);
        bg.add(rb_2);
        panel.add(rb_1);
        panel.add(rb_2);
        panel.add(button);
        panel.add(label);
        panel.add(check);
        panel.add(tf);
        frame.setVisible(true);
    }
}
