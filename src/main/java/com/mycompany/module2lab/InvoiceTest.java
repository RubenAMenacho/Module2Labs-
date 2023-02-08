/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module2lab;





/**
 *
 * @author ramlifting
 */
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1234", "Screwdriver", 2, 5.0); 
        System.out.println("Part Number: " + invoice.getPartNum());
        System.out.println("Part Description: " + invoice.getPartDesc());
        System.out.println("Quantity: " + invoice.getItemCount());
        System.out.println("Price per Item: " + invoice.getItemPrice());
        System.out.println("Invoice Amount: " + invoice.calculateInvoice());
    }

  
        }
    



