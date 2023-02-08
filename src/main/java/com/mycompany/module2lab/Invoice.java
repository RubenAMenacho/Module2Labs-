/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module2lab;

/**
 *
 * @author ramlifting
 */
public class Invoice {
    private String partNum;
    private String partDesc;
    private int itemCount;
    private double itemPrice;

    public Invoice(String partNum, String partDesc, int itemCount, double itemPrice) {
        this.partNum = partNum;
        this.partDesc = partDesc;
        setItemCount(itemCount);
        setItemPrice(itemPrice);
    }

    public String getPartNum() {
        return partNum;
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        if (itemCount > 0) {
            this.itemCount = itemCount;
        } else {
            this.itemCount = 0;
        }
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        if (itemPrice > 0.0) {
            this.itemPrice = itemPrice;
        } else {
            this.itemPrice = 0.0;
        }
    }

    public double calculateInvoice() {
        return itemCount * itemPrice;
    }
}

