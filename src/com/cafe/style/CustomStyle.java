
package com.cafe.style;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Dell
 */
public class CustomStyle {

    public static final int ROW_HEIGHT = 34;
    public static DefaultTableCellRenderer renderCenter ;
    public static DefaultTableCellRenderer renderRight ;
    static{
        renderCenter = new DefaultTableCellRenderer();
        renderCenter.setHorizontalAlignment(SwingConstants.CENTER);
        renderRight = new DefaultTableCellRenderer();
        renderRight.setHorizontalAlignment(SwingConstants.RIGHT);
    }

    
     public static void setComponentBackground(Component... components) {
        for (Component component : components) {
            component.setBackground(NewTheme.BG_CARD);
        }
    }

    public static Font getCustomFont(int size) {
        return new Font("Segoe UI Semibold", 0, size);
    }

    public static void addTableStyle() {
        UIManager.put("TableHeader.font", new Font("Segoe UI Semibold", 0, 16));
        UIManager.put("Table.font", new Font("Segoe UI", 0, 14));
        UIManager.put("Table.cellMargins", new Insets(0, 10, 0, 5));
        UIManager.put("Table.rowHeight", ROW_HEIGHT);
        UIManager.put("TableHeader.height", ROW_HEIGHT);
        //colors
        UIManager.put("Table.alternateRowColor", NewTheme.ROW_ALTERNATE);
        UIManager.put("Table.selectionInactiveBackground", NewTheme.ROW_INACTIVE);
        UIManager.put("Table.selectionBackground", NewTheme.ROW_SELECTION);
        UIManager.put("Table.selectionForeground", NewTheme.FG_CHART);
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
            button.setBackground(NewTheme.BG_SIDEBAR_BUTTON);            
            if (button.getClass().getName().equals(new JButton().getClass().getName())) {
                JButton b = (JButton) button;               
                b.putClientProperty(FlatClientProperties.STYLE, "hoverBackground:rgba(0,153,153, 30)");
                b.putClientProperty(FlatClientProperties.STYLE, "selectedBackground:"+NewTheme.BG_SIDEBAR_BUTTON_SELECTION);
            }else
                
            if(button.getClass().getName().equals(new JToggleButton().getClass().getName())){
                JToggleButton tb = (JToggleButton)button;                                
                tb.putClientProperty(FlatClientProperties.STYLE, "selectedBackground:"+NewTheme.BG_SIDEBAR_BUTTON_SELECTION);
            }
            
        }

    }

  
}
