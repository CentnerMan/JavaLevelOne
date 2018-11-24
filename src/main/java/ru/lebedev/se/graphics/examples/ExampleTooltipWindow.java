package ru.lebedev.se.graphics.examples;

import javax.swing.*;

/**
 * @author Denis Volnenko
 */
final class ExampleTooltipWindow extends JFrame {

    private ExampleTooltipWindow() {
        final JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(null);
        panel.setToolTipText("A Panel container");

        final JButton button = new JButton("Button");
        button.setBounds(100, 60, 100, 30);
        button.setToolTipText("A button component");

        panel.add(button);

        setTitle("Tooltip");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        final ExampleTooltipWindow window = new ExampleTooltipWindow();
        window.setVisible(true);
    }

}
