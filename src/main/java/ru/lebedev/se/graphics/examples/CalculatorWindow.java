package ru.lebedev.se.graphics.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Denis Volnenko
 */
public final class CalculatorWindow extends JFrame {

    private final JTextField t1 = new JTextField(100);
    private final JPanel buttonPanel = new JPanel();

    private final JButton b0 = new JButton("0");
    private final JButton b1 = new JButton("1");
    private final JButton b2 = new JButton("2");
    private final JButton b3 = new JButton("3");
    private final JButton b4 = new JButton("4");
    private final JButton b5 = new JButton("5");
    private final JButton b6 = new JButton("6");
    private final JButton b7 = new JButton("7");
    private final JButton b8 = new JButton("8");
    private final JButton b9 = new JButton("9");
    private final JButton dot = new JButton(".");
    private final JButton add = new JButton("+");
    private final JButton sub = new JButton("-");
    private final JButton equal = new JButton("=");
    private final JButton div = new JButton("%");
    private final JButton mul = new JButton("x");

    public CalculatorWindow() {
        setLayout(null);
        t1.setBounds(10, 10, 200, 30);
        buttonPanel.setBounds(10, 60, 200, 150);
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
//        buttonPanel.setBackground(Color.gray);

        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(div);
        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(mul);
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(sub);
        buttonPanel.add(b0);
        buttonPanel.add(dot);
        buttonPanel.add(equal);
        buttonPanel.add(add);


        MegaListener ml = new MegaListener();
        add.addActionListener(ml);
        sub.addActionListener(ml);
        mul.addActionListener(ml);
        div.addActionListener(ml);
        equal.addActionListener(ml);
        b0.addActionListener(ml);
        b1.addActionListener(ml);
        b2.addActionListener(ml);
        b3.addActionListener(ml);
        b4.addActionListener(ml);
        b5.addActionListener(ml);
        b6.addActionListener(ml);
        b7.addActionListener(ml);
        b8.addActionListener(ml);
        b9.addActionListener(ml);
        dot.addActionListener(ml);

        add(t1);
        add(buttonPanel);
        setBounds(300, 200, 230, 250);

    }

    public static void main(String[] args) {
        final CalculatorWindow window = new CalculatorWindow();
        window.setVisible(true);
    }

    static double a = 0;
    static int op = 0;

    private class MegaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();

            if (cmd.equals("+")) {
                a = Double.parseDouble(t1.getText());
                op = 1;
                t1.setText("");
            }

            if (cmd.equals("-")) {
                a = Double.parseDouble(t1.getText());
                op = 2;
                t1.setText("");
            }

            if (cmd.equals("x")) {
                a = Double.parseDouble(t1.getText());
                op = 3;
                t1.setText("");
            }

            if (cmd.equals("%")) {
                a = Double.parseDouble(t1.getText());
                op = 4;
                t1.setText("");
            }

            if (cmd.equals("=")) {
                double b = Double.parseDouble(t1.getText());
                double c = 0;
                switch (op) {
                    case 1:
                        c = a + b;
                        break;
                    case 2:
                        c = a - b;
                        break;
                    case 3:
                        c = a * b;
                        break;
                    case 4:
                        c = a / b;
                        break;
                    default:
                        c = 0;
                }
                t1.setText("" + c);
            }

            if (cmd.equals("0")) t1.setText(t1.getText().concat("0"));
            if (cmd.equals("1")) t1.setText(t1.getText().concat("1"));
            if (cmd.equals("2")) t1.setText(t1.getText().concat("2"));
            if (cmd.equals("3")) t1.setText(t1.getText().concat("3"));
            if (cmd.equals("4")) t1.setText(t1.getText().concat("4"));
            if (cmd.equals("5")) t1.setText(t1.getText().concat("5"));
            if (cmd.equals("6")) t1.setText(t1.getText().concat("6"));
            if (cmd.equals("7")) t1.setText(t1.getText().concat("7"));
            if (cmd.equals("8")) t1.setText(t1.getText().concat("8"));
            if (cmd.equals("9")) t1.setText(t1.getText().concat("9"));
            if (cmd.equals(".")) t1.setText(t1.getText().concat("."));
        }
    }
}
