/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw4_q1;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW4_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        int i;
        
        //min and max
        int min = 1;
        int max = 100;
        
        int arraySize = (int)(Math.random() * (max-min) + min);
        System.out.println("Array Size: " + arraySize);
        int numberArray[] = new int[arraySize];
        
        //populate array with rand int
        for(i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int)(Math.random() * 100);
        }
        
        //calculate average
        int total = 0;
        int average;
        for(i = 0; i < numberArray.length; i++) {
            total += numberArray[i];
        }
        average = total/numberArray.length;
        
        //track above/equal, below average
        int aboveEqual = 0;
        int below = 0;
        for(i = 0; i < numberArray.length; i++) {
            if(numberArray[i] >= average) {
                aboveEqual++;
            }
            else if(numberArray[i] < average) {
                below++;
            }
        }
        
        System.out.println(aboveEqual + " numbers are above or equal to the average.");
        System.out.println(below + " numbers are below the average.");
        
        
    }
    
}
