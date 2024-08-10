
package com.cafe.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User implements UserRole{
    public enum UserActivity{
        LOGGED_IN,
        LOGGED_OUT,
        TAKE_AWAY_BILL,
        DINE_IN_BILL,
        PRE_ORDER_BILL,
        RESERVATION_BILL,
        MENU_ITEM_ADDED,
        GRN_ADDED,
        PRE_ORDER_STATUS_UPDATED,
        RESERVATION_STATUS_UPDATED,
        NEW_DISCOUNT_ADDED,
        NEW_TABLE_ADDED,
        TABLE_CATEGORY_UPDATED,
        TABLE_STATUS_UPDATED,
        SUPPLIER_ADDED,
        SUPPLIER_UPDATED,
        SETTLE_DUE_GRN,
        UPDATE_CUSTOMER,
        NEW_USER_ADDED,
        USER_UPDATED,
        PURCHASE_ORDER_ADDED,
        PURCHASE_STATUS_UPDATED,
        NEW_CATEGORY_ADDED,
        DAMAGED_STOCK_ADDED,
        DAMAGED_STOCK_STATUS_UPDATED,
        BUSINESS_LOGO_UPDATED,
        BUSINESS_DETAILS_UPDATED,
        ADMIN_DETAILS_UPDATED,
        SYSTEM_SETTINGS_UPDATED
    }
    private String mobile;
    private String display_name;
    private String username;
    private Role role;
    
    SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat timeFormatter = new SimpleDateFormat("hh:mm:ss");
    

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserRole.Role getRole() {
        return role;
    }

    public void setRole(UserRole.Role role) {
        this.role = role;
    }
    
    public void updateUserActivity(UserActivity activity){
        String description = activity.name().toLowerCase().replace('_',' ');       
        String date = dateFormatter.format(new Date());
        String time = timeFormatter.format(new Date());
        
        Mysql.execute("INSERT INTO `activity` (`description`,`date`,`time`,`user_id`)"
                + " VALUES('%s','%s','%s','%s')"
                .formatted(description,date,time,mobile));
    }
}
