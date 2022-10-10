/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw3_q9;

import java.util.Scanner;

/**
 *
 * @author joshu
 */



public class JoshuaTaggart_HW3_Q9 {

    /**
     * @param args the command line arguments
     */
    
    public static int passwordValid(String password) {
        int validCheck = 0;
        int numChar = 0;
        int i;
        int validChar = 0;
        int digitCounter = 0;
        
        
        //if validCheck = 3, it is a valid password
        
        //if password has 8 char or more
        numChar = password.length();
        if(numChar >= 8) {
            validCheck++;
        }
        
        //if password only has letters and digits
        for(i = 0; i < numChar; i++) {
            //go through each letter of password at a time
            //check if char is letter/digit
            char curLetter = password.charAt(i);
            
            if(Character.isDigit(curLetter) == true) {
                validChar++;
                digitCounter++;
                
            }
            else if(Character.isLetter(curLetter) == true) {
                validChar++;
            }
        }
        if(validChar == numChar) {
            validCheck++;
        }
        
        //if password has at least 2 digits
        if(digitCounter >= 2) {
            validCheck++;
        }
        
        return validCheck;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter password: ");
        String password = input.nextLine();
        
        if(passwordValid(password) == 3) {
            //password is valid
            System.out.println("Valid Password");
        }
        else {
            //password is not valid
            System.out.println("Invalid Password");
        }
        
    }
    
}
