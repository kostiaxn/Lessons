/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.GUIlayout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Admin
 */
public class GUILayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Моя программа");
        frame.setBounds(600, 400, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        JPanel top = new JPanel();
        top.setBorder(new EmptyBorder(20, 0, 0, 0));
        JLabel labelTitle = new JLabel("Моя форма");
        labelTitle.setFont(new Font("Arial", Font.BOLD, 22));
        top.add(labelTitle);
        
        JPanel form = new JPanel();
        form.setLayout(new GridBagLayout());
        JLabel nameL = new JLabel("Имя: ");
        JTextField nameTF = new JTextField();
        JLabel emailL = new JLabel("E-mail: ");
        JTextField emailTF = new JTextField();
        
        nameL.setHorizontalAlignment(SwingConstants.RIGHT);
        emailL.setHorizontalAlignment(SwingConstants.RIGHT);
        
        nameTF.setPreferredSize(new Dimension(200, 40));
        emailTF.setPreferredSize(new Dimension(200, 40));
        
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 10, 5);
        form.add(nameL, c);
        c.gridx = 1;
        form.add(nameTF, c);
        c.gridx = 0;
        c.gridy = 1;
        form.add(emailL, c);
        c.gridx = 1;
        form.add(emailTF, c);
        
        JPanel bottom = new JPanel();
        JCheckBox news = new JCheckBox("Подписаться на новости");
        JButton button = new JButton("Отправить");
        button.setPreferredSize(new Dimension(200, 50));
        bottom.add(news);
        bottom.add(button, BorderLayout.SOUTH);
        bottom.setBorder(new EmptyBorder(0, 0, 20, 0));
        
        frame.add(top, BorderLayout.NORTH);
        frame.add(form, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
    
}
