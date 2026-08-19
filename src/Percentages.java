/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.percentages;

/**
 *
 * @author 24049015
 */
public class Percentages {

    public static void main(String[] args) {
        double num1 = 2.0;
        double num2 = 5.0;
        computerPercent(num1, num2);
        computerPercent(num1, num2);
    }
    public static void computerPercent(double first, double second){
    double percent = (first / second) * 100;
    System.out.println(first + " is " + percent + " percent of " + second);
    
    }
    
}
