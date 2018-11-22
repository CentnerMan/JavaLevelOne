package ru.lebedev.se.graphics;

import javax.swing.*;
import java.awt.*;

public class MyWindowFlow extends JFrame {
    public MyWindowFlow() {
        setTitle("Test Window FlowLayout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 400, 300);
        JButton[] jbs = new JButton[10];
        setLayout(new FlowLayout());
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("#" + i);
            add(jbs[i]);
        }
        setVisible(true);
    }
}
