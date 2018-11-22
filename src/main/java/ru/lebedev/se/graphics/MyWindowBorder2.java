package ru.lebedev.se.graphics;

import javax.swing.*;
import java.awt.*;

public class MyWindowBox extends JFrame{
    public MyWindowBox() {
        setTitle("Test Window BoxLayout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(700, 300, 400, 400);

        JButton button = new JButton("Button 1 (PAGE_START)");
        add(button, BorderLayout.PAGE_START); // добавление кнопки на форму

        button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(200,100));
        add(button, BorderLayout.CENTER);

        button = new JButton("Button 3 (LINE_START)");
        add(button, BorderLayout.LINE_START);

        button = new JButton("Long-Named Button 4 (PAGE_END)");
        add(button, BorderLayout.PAGE_END);

        button = new JButton("Button 5 (LINE_END)");
        add(button, BorderLayout.LINE_END);

        setVisible(true);
    }

}
