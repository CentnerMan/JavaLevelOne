package ru.lebedev.se.graphics.calculator;

import javax.swing.*;

public class Calc {
    public static void main(String[] args) throws Exception {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        final CalculatorWindow window = new CalculatorWindow();
        window.setVisible(true);
    }
}
