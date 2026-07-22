/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rondamguess;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class RondamGuess {

    
    public static void main(String[] args) {
        JOptionPane.showInternalMessageDialog(null , " Think of a number between 1 and 10");
        JOptionPane.showMessageDialog(null, "The number is " +  (1 + (int)(Math.random() * 10)));
        // TODO code application logic here
    }
    
}
