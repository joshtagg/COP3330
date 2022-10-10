/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw2_q8;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW2_Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //initial prompt for user
        System.out.print("Enter a letter grade: ");
        //user input
        String letter = input.nextLine();
        
        if(letter.equals("A") == true) {
            //numeric value is 4
            int numValue = 4;
            System.out.println("The numeric value for grade " + letter + " is " + numValue);
        }
        else if(letter.equals("B") == true) {
            //numeric value is 3
            int numValue = 3;
            System.out.println("The numeric value for grade " + letter + " is " + numValue);
        }
        else if(letter.equals("C") == true) {
            //numeric value is 2
            int numValue = 2;
            System.out.println("The numeric value for grade " + letter + " is " + numValue);
        }
        else if(letter.equals("D") == true) {
            //numeric value is 1
            int numValue = 1;
            System.out.println("The numeric value for grade " + letter + " is " + numValue);
        }
        else if(letter.equals("F") == true) {
            //numeric value is 0
            int numValue = 0;
            System.out.println("The numeric value for grade " + letter + " is " + numValue);
        }
        //invalid
        else {
            System.out.println(letter + " is an invalid grade");
        }
        
        
    }
    
}
