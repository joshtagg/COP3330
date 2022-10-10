/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_midtermexam;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_MidtermExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        int i, j;
        
        //initial user prompt
        System.out.print("Enter ten numbers: ");
        //initialize array
        int numberArray[] = new int[10];
        //populate array with user input
        for(i = 0; i < numberArray.length; i++) {
            numberArray[i] = input.nextInt();
        }
        
        
        int distinctNums = 0;
        //loop to find number of distinct nums
        for(i = 0; i < numberArray.length; i++) {
            for(j = 0; j < i; j++) {
                if(numberArray[i] == numberArray[j]) {
                    break;
                }
            }
            //distinct num found
            if(i == j) {
                distinctNums++;
            }
        }
        
        
        System.out.println("The number of distinct numbers is " + distinctNums);
        
        System.out.print("The distinct numbers are: ");
        //similar loop as last 
        for(i = 0; i < numberArray.length; i++) {
            for(j = 0; j < i; j++) {
                if(numberArray[i] == numberArray[j]) {
                    break;
                }
            }
            //print distinct num
            if(i == j) {
                System.out.print(numberArray[i] + " ");
            }
        }
        
        
    }
    
}
