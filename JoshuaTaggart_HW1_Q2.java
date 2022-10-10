/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw1_q2;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW1_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //innitial prompt
        System.out.print("Enter a number between 0 and 1000: ");
        //user input saved under integer "number"
        int number = input.nextInt();
        
        //variable for the new number as it gets rid of digits
        int newNumber;
        
        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int fourthDigit;
        int Sum;
        
        firstDigit = number % 10;
        newNumber = number / 10;
        secondDigit = newNumber % 10;
        newNumber = newNumber / 10;
        thirdDigit = newNumber % 10;
        newNumber = newNumber / 10;
        fourthDigit = newNumber % 10;
        
        //sum all of individual digits
        Sum = firstDigit + secondDigit + thirdDigit + fourthDigit;
        
        //final output
        System.out.println("The sum of the digits is " + Sum);
        
    }
    
}
