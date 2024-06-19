
package com.cafe.model;


public interface Theme {
     public enum Mode {
        DARK, LIGHT
    }
    void setStyle();
    void setComponentTheme();
}
