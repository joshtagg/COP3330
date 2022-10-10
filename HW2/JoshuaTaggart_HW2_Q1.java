/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw2_q1;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW2_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //Initial prompt for user
        System.out.print("Enter a, b, c, d, e, f: ");
        //variables
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        //if ad-bc is 0, no solution
        double ifZero = ((a * d) - (b * c));
        if(ifZero == 0) {
            System.out.print("The equation has no solution.");
        }
        
        //continue
        else {
            //calculate x
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            //calculate y
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            //print final output
            System.out.println("x is " + x + " and y is " + y);
        }
        
    }
    
}
