package com.cafe.style;

import com.cafe.gui.Dashboard;
import com.cafe.model.Theme;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import java.awt.Color;

public class NewTheme implements Theme{
   
    public static Color TRANSPARENT = new Color(0,0,0,0);
    private static Mode MODE;
    public static Color BG_CARD;
    public static Color BG_SIDEBAR_BUTTON;
    public static String BG_SIDEBAR_BUTTON_SELECTION;
    public static Color BG_CARD_PRODUCT;
    public static Color BG_PRIMARY;
    public static Color BG_SECONDARY;
    public static Color BG_TABLE_HEAD;
    public static Color FG_CHART;

    public static Color ROW_ALTERNATE;
    public static Color ROW_INACTIVE;
    public static Color ROW_SELECTION;
    public static Color GRID;
    public static Color HEADER;

    public static String TOGGLE_BUTTON;

    private static Dashboard dashboard;

    public static void setDashboard(Dashboard dashboard) {
        NewTheme.dashboard = dashboard;
    }

    public static void ResetTheme(){
         if (dashboard != null) {
            switch (MODE) {
                case LIGHT:
                    FlatLightLaf.setup();                     
                    break;
                case DARK:
                    FlatOneDarkIJTheme.setup();  
                    break;  
            }
        }
    }

    public static void setLightMode() {
        FlatLightLaf.setup();
        MODE = Mode.LIGHT;
        BG_CARD = Color.WHITE;
        BG_CARD_PRODUCT = new Color(238, 240, 244);
        BG_PRIMARY = Color.WHITE;
        FG_CHART = Color.BLACK;
        BG_SIDEBAR_BUTTON = new Color(242, 242, 242);
        BG_SIDEBAR_BUTTON_SELECTION = "rgba(77, 120, 204,40)";
        ROW_ALTERNATE = new Color(245,245,245);
        ROW_INACTIVE = new Color(0, 0, 0, 20);
        ROW_SELECTION = Color.BLACK;
        GRID = new Color(102, 102, 102);

        TOGGLE_BUTTON = "rgba(0,204,204,35)";
    }

    public static void setDarkMode() {
        FlatOneDarkIJTheme.setup();
        MODE = Mode.DARK;
        BG_CARD = new Color(43, 46, 56);
        BG_CARD_PRODUCT = new Color(40, 44, 52); 
        BG_PRIMARY = new Color(221, 230, 237);
        FG_CHART = new Color(230, 230, 230);
        BG_SIDEBAR_BUTTON = new Color(33, 37, 43);
        BG_SIDEBAR_BUTTON_SELECTION = "rgb(60,64,75)";
        ROW_SELECTION = new Color(60,64,75);
        ROW_INACTIVE = new Color(0, 0, 0, 20);
        ROW_ALTERNATE= new Color(44,49,58);
        GRID = new Color(102, 102, 102);

        TOGGLE_BUTTON = "rgb(60,64,75)";
    }  

    @Override
    public void setStyle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setComponentTheme() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
