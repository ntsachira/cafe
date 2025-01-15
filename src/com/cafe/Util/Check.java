
package com.cafe.Util;

/**
 *
 * @author Dell
 */
public class Check {
     public static boolean isInteger(String value){
        return value.matches("^\\d+$");
    }
    
    public static boolean isPriceValid(String price){
        return price.matches("^\\d+(\\.\\d{2})?$");
    }
    
    public static boolean isMobileValid(String mobile){
        return mobile.matches("07[01245678]{1}[0-9]{7}");
    }
}
