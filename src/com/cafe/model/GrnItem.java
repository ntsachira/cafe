/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class GrnItem {

    private int listNo;
    private int stockId;

    private String name;
    private String category;
    private String brand;
    private String expire_date;
    private String unit_of_measure;
    private double quantity;
    private double unit_price;
    private double purchase_price;
    private double total;
    private String supplier_mobile;
    private String id;
    private String grn_type;

    public int getListNo() {
        return listNo;
    }

    public void setListNo(int listNo) {
        this.listNo = listNo;
    }

    public String getSupplier_mobile() {
        return supplier_mobile;
    }

    public void setSupplier_mobile(String supplier_mobile) {
        this.supplier_mobile = supplier_mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(Date expire_date) {
        this.expire_date = new SimpleDateFormat("yyyy-MM-dd").format(expire_date);
    }

    public String getUnit_of_measure() {
        return unit_of_measure;
    }

    public void setUnit_of_measure(String unit_of_measure) {
        this.unit_of_measure = unit_of_measure;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
        setTotal(quantity*purchase_price);
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(double purchase_price) {
        this.purchase_price = purchase_price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrn_type() {
        return grn_type;
    }

    public void setGrn_type(String grn_type) {
        this.grn_type = grn_type;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

}
