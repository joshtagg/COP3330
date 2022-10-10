/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw3_q7;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW3_Q7 {
    
    /**
     * @param args the command line arguments
     */
    
    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius) {
        double newFahrenheit = 0;
        newFahrenheit = (9.0 / 5) * celsius + 32;
        newFahrenheit = (int)(newFahrenheit*100)/100.0;
        return newFahrenheit;
    }
    
    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit) {
        double newCelsius = 0;
        newCelsius = (5.0 / 9) * (fahrenheit - 32);
        newCelsius = (int)(newCelsius*100)/100.0;
        return newCelsius;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
        System.out.println("-----------------------------------------------------------------------");
        
        double celsius = 40;
        double fahrenheit = 120;
        
        int i;
        for(i = 0; i < 10; i++) {
            
            System.out.println(celsius + "\t\t" + celsiusToFahrenheit(celsius) + "\t\t|\t" + fahrenheit + "\t\t" + fahrenheitToCelsius(fahrenheit));
            celsius = celsius - 1;
            fahrenheit = fahrenheit - 10;
        }
        
    }
    
}
