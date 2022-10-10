/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework_1;

/**
 *
 * @author joshu
 */

import java.util.Scanner;

public class JoshuaTaggart_HW1_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //print output
        System.out.print("Enter a value for feet: ");
        //create double, accept input and assign to double "feet"
        double feet = input.nextDouble();
        //create and calculate "meters"
        double meters = feet * 0.305;
        //print final output
        System.out.println(feet + " feet is " + meters + " meters");
        
    }
    
}
