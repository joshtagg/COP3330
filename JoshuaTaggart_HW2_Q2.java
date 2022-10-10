/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw2_q2;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW2_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //initial prompt for user
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        //store user input
        int userInput = input.nextInt();
        
        //turn user integer into a string to add leading zeros where neccesary 
        String isbn = String.format("%09d", userInput);
        
        //do calculation
        int sum = ((isbn.charAt(0)-'0')*1) + ((isbn.charAt(1)-'0')*2) + ((isbn.charAt(2)-'0')*3) + ((isbn.charAt(3)-'0')*4) + ((isbn.charAt(4)-'0')*5) + ((isbn.charAt(5)-'0')*6) + ((isbn.charAt(6)-'0')*7) + ((isbn.charAt(7)-'0')*8) + ((isbn.charAt(8)-'0')*9);
        
        //if checksum is 10
        if(sum % 11 == 10) {
            //add X to end
            char charX = 'X';
            String finalAnswer = isbn + charX;
            System.out.println("The ISBN-10 number is " + finalAnswer);
        }
        //if checksum is not 10
        else{
            //add 1 to end
            String finalAnswer = isbn + 1;
            System.out.println("The ISBN-10 number is " + finalAnswer);
        }
        
    }
    
}
