package ru.lebedev.se.graphics;

import javax.swing.*;
import java.awt.*;

public class MyWindowBorder extends JFrame {
    public MyWindowBorder() {
        setTitle("Test Window BorderLayout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JButton[] jbs = new JButton[5];
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("#" + i);
        }
        setLayout(new BorderLayout()); // выбор компоновщика элементов
        add(jbs[0], BorderLayout.EAST); // добавление кнопки на форму
        add(jbs[1], BorderLayout.WEST); // добавление кнопки на форму
        add(jbs[2], BorderLayout.SOUTH); // добавление кнопки на форму
        add(jbs[3], BorderLayout.NORTH); // добавление кнопки на форму
        add(jbs[4], BorderLayout.CENTER); // добавление кнопки на форму
        setVisible(true);
    }
}
