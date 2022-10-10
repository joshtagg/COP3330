/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw1_q3;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW1_Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter v0, v1, and t: ");
        //save three user inputs under v0, v1, and t
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        
        double numerator;
        double acceleration;
        
        //calculate numerator
        numerator = v1 - v0;
        //calculate acceleration
        acceleration = numerator / t;
        //display proper amount of decimal places
        acceleration = (int)(acceleration*10000)/10000.0;
        //print final output
        System.out.println("The average acceleration is " + acceleration);
        
    }
    
}
