/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.model;

/**
 *
 * @author User
 */
public class DueGrn {

    private String grnid;
    private String suppliermobile;
    private String orderDate;
    private int itemCount;
    private Double total;
    private Double paidAmount;
    private Double due;

    public String getGrnid() {
        return grnid;
    }

    public void setGrnid(String grnid) {
        this.grnid = grnid;
    }

    public String getSuppliermobile() {
        return suppliermobile;
    }

    public void setSuppliermobile(String suppliermobile) {
        this.suppliermobile = suppliermobile;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Double getDue() {
        return due;
    }

    public void setDue(Double due) {
        this.due = due;
    }

   
}
