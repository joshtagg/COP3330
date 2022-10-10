/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw1_q7;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW1_Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //initial prompt for user
        System.out.print("Enter the coordinates of three points seperated by spaces like x1 y1 x2 y2 x3 y3: ");
        //store all variables
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        //calculate formula
        double Area = (x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2));
        Area = Area / 2;
        //absolute value of answer
        Area = Math.abs(Area);
        //round value to 10s place
        Area = (int)(Area*10)/10.0;
        
        
        //print final output
        System.out.println("The area of the triangle is " + Area);
    
        
    }
    
}
