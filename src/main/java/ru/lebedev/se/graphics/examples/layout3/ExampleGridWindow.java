package ru.volnenko.geekbrains.gui.swing.ex5.layout3;

import javax.swing.*;
import java.awt.*;

/**
 * @author Denis Volnenko
 */
final class ExampleGridWindow extends JFrame {

    public ExampleGridWindow() {
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,3,5,10));
        panel.add(new JButton("Кнопка"));
        panel.add(new JButton("+"));
        panel.add(new JButton("-"));
        panel.add(new JButton("Кнопка с длинной надписью"));
        panel.add(new JButton("еще кнопка"));
        setContentPane(panel);
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        final ExampleGridWindow window = new ExampleGridWindow();
        window.setVisible(true);
    }

}
