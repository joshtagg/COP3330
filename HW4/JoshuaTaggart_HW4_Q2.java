/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw4_q2;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW4_Q2 {

    /**
     * @param args the command line arguments
     */
    
    public static double min(double[] array) {
        //set min to first double in array
        double min = array[0];
        int i;
        
        //find min double in array
        for(i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        return min;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        //Scanner input = new Scanner(System.in);
        
        int i;
        
        //create array
        double numberArray[] = new double[10];
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for(i = 0; i < numberArray.length; i++) {
            numberArray[i] = input.nextDouble();
        }
        
        //call min here
        System.out.println("The minimum number is " + min(numberArray));
        
    }
    
}
