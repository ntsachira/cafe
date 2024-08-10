package com.cafe.Handlers;

import java.awt.event.KeyEvent;

public class KeyStrokeHandler {

    public static boolean isDigit(KeyEvent evt) {
        
        boolean isDigit = true;
        
        if (!String.valueOf(evt.getKeyChar()).matches("[0-9]")) {
            evt.consume();
            isDigit = false;
        }
        
        return isDigit;
        
    }
}
