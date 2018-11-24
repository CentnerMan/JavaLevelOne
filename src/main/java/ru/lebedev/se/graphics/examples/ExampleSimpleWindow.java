package ru.lebedev.se.graphics.examples;

import javax.swing.*;
import java.awt.*;

/**
 * @author Denis Volnenko
 */
final class ExampleSimpleWindow extends JFrame {

     private ExampleSimpleWindow() throws HeadlessException {
        setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        final ExampleSimpleWindow window = new ExampleSimpleWindow();
        window.setVisible(true);
    }

}
