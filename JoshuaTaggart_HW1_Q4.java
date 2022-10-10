/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw1_q4;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW1_Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the monthly saving amount: ");
        //save user input under "amount
        double amount = input.nextDouble();
        
        //update savings for all 6 months
        amount = amount * (1 + 0.00417);
        amount = (100 + amount) * (1 + 0.00417);
        amount = (100 + amount) * (1 + 0.00417);
        amount = (100 + amount) * (1 + 0.00417);
        amount = (100 + amount) * (1 + 0.00417);
        amount = (100 + amount) * (1 + 0.00417);
        
        //make it so amount only displays to second decimal place
        amount = (int)(amount*100)/100.0;
        //print final output
        System.out.println("After the sixth month, the account value is $" + amount);
        
    }
    
}
