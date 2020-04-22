package com.company;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;

/**
 * This class is a calculator in two mood (simple/advanced).
 * @author Sayed Mohammad Ali Mirkazemi
 * @version 1.0.0
 * @since April.17.2020
 */
public class Calculator {
    private JFrame frame;

    /**
     * This is constructor of this class and implement our calculator.
     * @throws ClassNotFoundException ???????????????????
     * @throws UnsupportedLookAndFeelException ?????????????
     * @throws InstantiationException ?????????????
     * @throws IllegalAccessException ?????????????
     */
    public Calculator() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        frame=new JFrame("Calculator");
        frame.setSize(400, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanelSimple=new JPanel();
        mainPanelSimple.setBounds(50,25,350,390);
        mainPanelSimple.setLayout(new GridLayout(2,1));

        JPanel mainPanelAdvanced=new JPanel();
        mainPanelAdvanced.setBounds(50,25,410,390);// change size
        mainPanelAdvanced.setLayout(new GridLayout(2,1));

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("Simple", mainPanelSimple);
        tabbedPane.add("Advanced", mainPanelAdvanced);
        frame.add(tabbedPane);

        // simple[
        JPanel panelSimple=new JPanel();
        panelSimple.setLayout(new CardLayout(15,50));
        mainPanelSimple.add(panelSimple);

        JLabel labelSimple=new JLabel();

        labelSimple.setBorder(new CompoundBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLACK), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        panelSimple.add(labelSimple);

        JPanel firstPanelSimple=new JPanel();
        firstPanelSimple.setLayout(new GridLayout(5,4));
        mainPanelSimple.add(firstPanelSimple);

        // button[
        JButton[] numericalButtonsSimple =new JButton[10];
        for (int i = 0;i<10;i++) {
            numericalButtonsSimple[i] = new JButton (""+ i);
            numericalButtonsSimple[i].setFont(new Font("Arial", Font.PLAIN, 30));
        }

        JButton buttonClearSimple=new JButton("C");
        buttonClearSimple.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonClearSimple.setBackground(Color.BLACK);
        buttonClearSimple.setForeground(Color.GRAY);
        firstPanelSimple.add(buttonClearSimple);

        JButton buttonParenthesisSimple=new JButton("()");
        buttonParenthesisSimple.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonParenthesisSimple.setBackground(Color.BLACK);
        buttonParenthesisSimple.setForeground(Color.GRAY);
        firstPanelSimple.add(buttonParenthesisSimple);

        JButton buttonRemainingSimple=new JButton("%");
        buttonRemainingSimple.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonRemainingSimple.setBackground(Color.BLACK);
        buttonRemainingSimple.setForeground(Color.GRAY);
        firstPanelSimple.add(buttonRemainingSimple);

        JButton buttonDivisionSimple=new JButton("/");
        buttonDivisionSimple.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonDivisionSimple.setBackground(Color.BLACK);
        buttonDivisionSimple.setForeground(Color.GRAY);
        firstPanelSimple.add(buttonDivisionSimple);

        firstPanelSimple.add(numericalButtonsSimple[7]);

        firstPanelSimple.add(numericalButtonsSimple[8]);

        firstPanelSimple.add(numericalButtonsSimple[9]);

        JButton buttonProductSimple=new JButton("x");
        buttonProductSimple.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonProductSimple.setBackground(Color.BLACK);
        buttonProductSimple.setForeground(Color.GRAY);
        firstPanelSimple.add(buttonProductSimple);

        firstPanelSimple.add(numericalButtonsSimple[6]);

        firstPanelSimple.add(numericalButtonsSimple[5]);

        firstPanelSimple.add(numericalButtonsSimple[4]);

        JButton buttonSubtractionSimple=new JButton("-");
        buttonSubtractionSimple.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonSubtractionSimple.setBackground(Color.BLACK);
        buttonSubtractionSimple.setForeground(Color.GRAY);
        firstPanelSimple.add(buttonSubtractionSimple);

        firstPanelSimple.add(numericalButtonsSimple[3]);

        firstPanelSimple.add(numericalButtonsSimple[2]);

        firstPanelSimple.add(numericalButtonsSimple[1]);

        JButton buttonSummationSimple=new JButton("+");
        buttonSummationSimple.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonSummationSimple.setBackground(Color.BLACK);
        buttonSummationSimple.setForeground(Color.GRAY);
        firstPanelSimple.add(buttonSummationSimple);

        JButton buttonNegativeSimple=new JButton("+/-");
        buttonNegativeSimple.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonNegativeSimple.setBackground(Color.BLACK);
        buttonNegativeSimple.setForeground(Color.GRAY);
        firstPanelSimple.add(buttonNegativeSimple);

        firstPanelSimple.add(numericalButtonsSimple[0]);

        JButton buttonDotSimple=new JButton(".");
        buttonDotSimple.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonDotSimple.setBackground(Color.BLACK);
        buttonDotSimple.setForeground(Color.GRAY);
        firstPanelSimple.add(buttonDotSimple);

        JButton buttonEqualSimple=new JButton("=");
        buttonEqualSimple.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonEqualSimple.setBackground(Color.BLUE);
        buttonEqualSimple.setForeground(Color.WHITE);
        firstPanelSimple.add(buttonEqualSimple);
        // button]
        // simple]

        // advanced[
        JPanel panelAdvanced=new JPanel();
        panelAdvanced.setLayout(new CardLayout(15,50));
        mainPanelAdvanced.add(panelAdvanced);

        JLabel labelAdvanced=new JLabel();

        labelAdvanced.setBorder(new CompoundBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLACK), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        panelAdvanced.add(labelAdvanced);

        JPanel firstPanelAdvanced=new JPanel();
        firstPanelAdvanced.setLayout(new GridLayout(5,5));
        mainPanelAdvanced.add(firstPanelAdvanced);
        // button[
        JButton[] numericalButtonsAdvanced =new JButton[10];
        for (int i = 0;i<10;i++) {
            numericalButtonsAdvanced[i] = new JButton (""+ i);
            numericalButtonsAdvanced[i].setFont(new Font("Arial", Font.PLAIN, 16));
        }

        JButton buttonShiftAdvanced=new JButton("Shift");
        buttonShiftAdvanced.setFont(new Font("Arial", Font.PLAIN, 16));
        buttonShiftAdvanced.setBackground(Color.YELLOW);
        buttonShiftAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonShiftAdvanced);

        JButton buttonClearAdvanced=new JButton("C");
        buttonClearAdvanced.setFont(new Font("Arial", Font.PLAIN, 20));
        buttonClearAdvanced.setBackground(Color.BLACK);
        buttonClearAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonClearAdvanced);

        JButton buttonParenthesisAdvanced=new JButton("()");
        buttonParenthesisAdvanced.setFont(new Font("Arial", Font.PLAIN, 20));
        buttonParenthesisAdvanced.setBackground(Color.BLACK);
        buttonParenthesisAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonParenthesisAdvanced);

        JButton buttonRemainingAdvanced=new JButton("%");
        buttonRemainingAdvanced.setFont(new Font("Arial", Font.PLAIN, 20));
        buttonRemainingAdvanced.setBackground(Color.BLACK);
        buttonRemainingAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonRemainingAdvanced);

        JButton buttonDivisionAdvanced=new JButton("/");
        buttonDivisionAdvanced.setFont(new Font("Arial", Font.PLAIN, 20));
        buttonDivisionAdvanced.setBackground(Color.BLACK);
        buttonDivisionAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonDivisionAdvanced);

        JButton buttonConstantAdvanced=new JButton("\u03C0/e");
        buttonConstantAdvanced.setFont(new Font("Arial", Font.PLAIN, 16));
        buttonConstantAdvanced.setBackground(Color.ORANGE);
        buttonConstantAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonConstantAdvanced);

        firstPanelAdvanced.add(numericalButtonsAdvanced[7]);

        firstPanelAdvanced.add(numericalButtonsAdvanced[8]);

        firstPanelAdvanced.add(numericalButtonsAdvanced[9]);

        JButton buttonProductAdvanced=new JButton("x");
        buttonProductAdvanced.setFont(new Font("Arial", Font.PLAIN, 20));
        buttonProductAdvanced.setBackground(Color.BLACK);
        buttonProductAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonProductAdvanced);

        JButton buttonSinCosAdvanced=new JButton("sin/cos");
        buttonSinCosAdvanced.setFont(new Font("Arial", Font.PLAIN, 16));
        buttonSinCosAdvanced.setBackground(Color.ORANGE);
        buttonSinCosAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonSinCosAdvanced);

        firstPanelAdvanced.add(numericalButtonsAdvanced[6]);

        firstPanelAdvanced.add(numericalButtonsAdvanced[5]);

        firstPanelAdvanced.add(numericalButtonsAdvanced[4]);

        JButton buttonSubtractionAdvanced=new JButton("-");
        buttonSubtractionAdvanced.setFont(new Font("Arial", Font.PLAIN, 20));
        buttonSubtractionAdvanced.setBackground(Color.BLACK);
        buttonSubtractionAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonSubtractionAdvanced);

        JButton buttonTanCotAdvanced=new JButton("tan/cot");
        buttonTanCotAdvanced.setFont(new Font("Arial", Font.PLAIN, 16));
        buttonTanCotAdvanced.setBackground(Color.ORANGE);
        buttonTanCotAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonTanCotAdvanced);

        firstPanelAdvanced.add(numericalButtonsAdvanced[3]);

        firstPanelAdvanced.add(numericalButtonsAdvanced[2]);

        firstPanelAdvanced.add(numericalButtonsAdvanced[1]);

        JButton buttonSummationAdvanced=new JButton("+");
        buttonSummationAdvanced.setFont(new Font("Arial", Font.PLAIN, 20));
        buttonSummationAdvanced.setBackground(Color.BLACK);
        buttonSummationAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonSummationAdvanced);

        JButton buttonExponentialLogarithmAdvanced=new JButton("e^x/Log");
        buttonExponentialLogarithmAdvanced.setFont(new Font("Arial", Font.PLAIN, 14));
        buttonExponentialLogarithmAdvanced.setBackground(Color.ORANGE);
        buttonExponentialLogarithmAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonExponentialLogarithmAdvanced);

        JButton buttonNegativeAdvanced=new JButton("+/-");
        buttonNegativeAdvanced.setFont(new Font("Arial", Font.PLAIN, 20));
        buttonNegativeAdvanced.setBackground(Color.BLACK);
        buttonNegativeAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonNegativeAdvanced);

        firstPanelAdvanced.add(numericalButtonsAdvanced[0]);

        JButton buttonDotAdvanced=new JButton(".");
        buttonDotAdvanced.setFont(new Font("Arial", Font.PLAIN, 20));
        buttonDotAdvanced.setBackground(Color.BLACK);
        buttonDotAdvanced.setForeground(Color.GRAY);
        firstPanelAdvanced.add(buttonDotAdvanced);

        JButton buttonEqualAdvanced=new JButton("=");
        buttonEqualAdvanced.setFont(new Font("Arial", Font.PLAIN, 20));
        buttonEqualAdvanced.setBackground(Color.BLUE);
        buttonEqualAdvanced.setForeground(Color.WHITE);
        firstPanelAdvanced.add(buttonEqualAdvanced);
        // button]
        // simple]
    }

    /**
     * This method show our calculator.
     */
    public void show(){
        frame.setVisible(true);
    }
}
