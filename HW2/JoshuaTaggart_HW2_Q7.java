/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw2_q7;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW2_Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //initial prompt for user
        System.out.print("Enter an ASCII code: ");
        int asciiNumber = input.nextInt();
        
        //casting
        char ascii = (char)asciiNumber;
        
        System.out.println("The character for ASCII code " + asciiNumber + " is " + ascii);
        
        
        
    }
    
}
