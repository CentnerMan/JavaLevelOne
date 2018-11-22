package ru.lebedev.se.graphics;

import javax.swing.*;
import java.awt.*;

public class MyWindowGrid extends JFrame {
    public MyWindowGrid() {
        setBounds(500, 500, 400, 300);
        setTitle("GridLayout Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] jbs = new JButton[10];
        setLayout(new GridLayout(4, 3));
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("#" + i);
            add(jbs[i]);
        }
        setVisible(true);
    }
}
