package ru.lebedev.se.graphics.examples;

import sun.java2d.loops.DrawLine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyWindow extends JFrame {
    public MyWindow() {
        setBounds(200, 200, 500, 500);
        setTitle("Window with manual bound");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Panel
//        JPanel panel = new JPanel();
//        add(panel);
//        panel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                System.out.println("Mouse position: " + e.getX() + " " + e.getY());
//            }
//        });
        setLayout(null);
        setLocationRelativeTo(null); // выводим по центру
        // Button
        JButton button = new JButton("Button");
        button.setBounds(20, 20, 100, 50);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Pressed...");
            }
        });
        // Label
        JLabel label = new JLabel("Label");
        label.setBounds(20, 70, 100, 20);
        add(label);
        // JTextField
        final JTextField textField = new JTextField();
        textField.setBounds(120, 20, 200, 70);
        add(textField);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Your message: " + textField.getText());
            }
        });
        //------------------------------------------

    }
}
