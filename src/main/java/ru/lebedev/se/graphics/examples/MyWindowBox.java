package ru.lebedev.se.graphics.examples;

import javax.swing.*;

public class MyWindowBox extends JFrame {
    public MyWindowBox() {
        setBounds(500, 500, 500, 300);
        setTitle("Box Layout Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] jbs = new JButton[10];
        setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS)); // или
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); // или
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("#" + i);
            jbs[i].setAlignmentX(CENTER_ALIGNMENT);
            add(jbs[i]);
        }
        setVisible(true);
    }
}
