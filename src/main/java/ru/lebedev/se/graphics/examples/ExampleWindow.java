package ru.lebedev.se.graphics.examples;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Denis Volnenko
 */
final class ExampleWindow extends JFrame implements ActionListener {

    private ExampleWindow() {
        final JButton button1 = new JButton("Button1");
        final JButton button2 = new JButton("Button2");
        button1.setBounds(50, 60, 100, 30);
        button2.setBounds(180, 60, 100, 30);

        getContentPane().setLayout(null);
        getContentPane().add(button1);
        getContentPane().add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Oui!");
    }

    public static void main(String[] args) {
        final ExampleWindow window = new ExampleWindow();
        window.setVisible(true);
    }

}
