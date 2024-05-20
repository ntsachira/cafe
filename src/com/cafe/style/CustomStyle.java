/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.style;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Dell
 */
public class CustomStyle {

    public static final int ROW_HEIGHT = 30;
    
    public static Font getCustomFont(int size){
        return new Font("Segoe UI Semibold", 0, size);
    }

    public static void addTableStyle() {
        UIManager.put("TableHeader.font", new Font("Segoe UI Semibold", 0, 14));
        UIManager.put("Table.font", new Font("Segoe UI", 0, 14));
        UIManager.put("Table.cellMargins", new Insets(0, 5, 0, 5));
        UIManager.put("Table.rowHeight", ROW_HEIGHT);
        UIManager.put("TableHeader.height", ROW_HEIGHT);
//        UIManager.put("Table.showHorizontalLines", true);
//        UIManager.put("Table.showVerticalLines", true);

        //colors
        UIManager.put("Table.alternateRowColor", Pallet.ROW_ALTERNATE);
        UIManager.put("Table.selectionInactiveBackground", Pallet.ROW_INACTIVE);
//        UIManager.put("TableHeader.background", new Color(82,82,82));
        UIManager.put("Table.selectionBackground", Pallet.ROW_SELECTION);
//        UIManager.put("Table.gridColor", Pallet.GRID);
    }

    public static void setIcon(Frame frame) {
        String icon1 = "/com/cafe/img/juice.png";
        String icon2 = "/com/cafe/img/logoBear.png";
        try {
            frame.setIconImage(new ImageIcon(frame.getClass().getResource(icon1)).getImage());
        } catch (Exception e) {
            System.out.println("Invalid file path");
        }
    }

    public static void setProgressbarRoundedMax() {
        UIManager.put("ProgressBar.arc", 200);
    }

    public static void showRevealButton() {
        UIManager.put("PasswordField.showRevealButton", true);
    }

    public static void setButtonsRoundedMax(JButton... buttons) {
        for (JButton button : buttons) {
            button.putClientProperty("JButton.buttonType", "roundRect");
//            button.putClientProperty(FlatClientProperties.STYLE, "arc: 15")
        }
    }

    public static void setTextFieldsRoundedMax(JTextField... textFields) {
        for (JTextField textField : textFields) {
            textField.putClientProperty(FlatClientProperties.STYLE, "arc: 15");
        }
    }

    public static void setPasswordFieldsRoundedMax(JPasswordField... passwordFields) {
        for (JPasswordField passwordField : passwordFields) {
            passwordField.putClientProperty(FlatClientProperties.STYLE, "arc: 15");
        }
    }

    public static void showClearButton(JTextField... textFields) {
        for (JTextField textField : textFields) {
            textField.putClientProperty("JTextField.showClearButton", true);
        }
    }

    public static void setButtonsTransparent(Component... buttons) {
        for (Component button : buttons) {
            JButton b = (JButton) button;
            b.setBackground(new Color(0, 0, 0, 0));
            b.putClientProperty(FlatClientProperties.STYLE, "hoverBackground:"+Pallet.SIDEBAR_BUTTON);
        }

    }
}
