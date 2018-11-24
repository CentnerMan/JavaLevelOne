package ru.volnenko.geekbrains.gui.swing.ex5.layout1;

import javax.swing.*;
import java.awt.*;

/**
 * @author Denis Volnenko
 */
final class ExampleFlowWindow extends JFrame {

    private ExampleFlowWindow() {
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        final JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("Кнопка"));
        panel.add(new JButton("+"));
        panel.add(new JButton("-"));
        panel.add(new JButton("Кнопка с длинной надписью"));

        setContentPane(panel);
        setSize(250, 100);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        final ExampleFlowWindow window = new ExampleFlowWindow();
        window.setVisible(true);
    }

}
