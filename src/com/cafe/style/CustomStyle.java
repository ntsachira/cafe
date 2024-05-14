/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.style;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Dell
 */
public class CustomStyle {

    public static void setProgressbarRoundedMax() {
        UIManager.put("ProgressBar.arc", 200);
    }

    public static void showRevealButton() {
        UIManager.put("PasswordField.showRevealButton", true);
    }

    public static void setButtonsRoundedMax(JButton... buttons) {
        for (JButton button : buttons) {
            button.putClientProperty("JButton.buttonType", "roundRect");
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
            b.putClientProperty(FlatClientProperties.STYLE, "hoverBackground: rgba(0,204,204,20)");
        }

    }
}
