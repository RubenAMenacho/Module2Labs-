/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module2lab4thq;
/**
 *
 * @author ramlifting
 */

import java.util.Scanner;

public class Sales {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int productNum;
int quantity;
double total = 0.0;
    System.out.println("Enter product number and quantity sold or -1 to exit: ");
    productNum = input.nextInt();

    while (productNum != -1) {
        quantity = input.nextInt();
        switch (productNum) {
            case 1 -> total += 2.98 * quantity;
            case 2 -> total += 4.50 * quantity;
            case 3 -> total += 9.98 * quantity;
            case 4 -> total += 4.49 * quantity;
            case 5 -> total += 6.87 * quantity;
            default -> System.out.println("Invalid product number");
        }
        System.out.println("Enter product number and quantity sold or -1 to exit: ");
        productNum = input.nextInt();
    }

    System.out.printf("Total retail value of all products sold: $%.2f", total);
    }
}