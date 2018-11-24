package ru.volnenko.geekbrains.gui.swing.ex5.layout2;

import javax.swing.*;
import java.awt.*;

/**
 * @author Denis Volnenko
 */
final class ExampleBorderWindow extends JFrame {

    private ExampleBorderWindow() {
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(new JButton("Кнопка"), BorderLayout.NORTH);
        getContentPane().add(new JButton("+"), BorderLayout.EAST);
        getContentPane().add(new JButton("-"), BorderLayout.WEST);
        getContentPane().add(new JButton("Кнопка с длинной надписью"), BorderLayout.SOUTH);
        getContentPane().add(new JButton("В ЦЕНТР!"));
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        final ExampleBorderWindow window = new ExampleBorderWindow();
        window.setVisible(true);
    }

}
