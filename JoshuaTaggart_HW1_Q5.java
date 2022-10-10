/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw1_q5;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW1_Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //innitial prompt for user
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();
        //second user prompt
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();
        
        //split up wind chill formula
        double windFormula1 = 35.74 + (0.6215 * temperature);
        double vPower = Math.pow(windSpeed, 0.16);
        //calculate full formula
        double windChill = windFormula1 - (35.75 * vPower) + (0.4275 * temperature * vPower);
        //round windChill to appropriate decimal places
        windChill = (int)(windChill*100000)/100000.0;
        
        //print final output
        System.out.println("The wind chill index is " + windChill);
    
        
    }
    
}
