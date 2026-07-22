/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomguessjava;

/**
 *
 * @author 24049015
 */
 import javax.swing.JOptionPane;
public class RandomGuessjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Think of a number between 1 and 10");
        JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random() * 10 )));
        // TODO code application logic here
    }
    
}
