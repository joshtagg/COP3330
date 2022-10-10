/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw3_q10;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW3_Q10 {

    /**
     * @param args the command line arguments
     */
    
    public static int getNumber(char uppercaseLetter) {
        int letterToNumber = 0;
        char charLower = Character.toLowerCase(uppercaseLetter);
        
        if(charLower == 'a' || charLower == 'b' || charLower == 'c') {
            letterToNumber = 2;
        }
        if(charLower == 'd' || charLower == 'e' || charLower == 'f') {
            letterToNumber = 3;
        }
        if(charLower == 'g' || charLower == 'h' || charLower == 'i') {
            letterToNumber = 4;
        }
        if(charLower == 'j' || charLower == 'k' || charLower == 'l') {
            letterToNumber = 5;
        }
        if(charLower == 'm' || charLower == 'n' || charLower == 'o') {
            letterToNumber = 6;
        }
        if(charLower == 'p' || charLower == 'q' || charLower == 'r' || charLower == 's') {
            letterToNumber = 7;
        }
        if(charLower == 't' || charLower == 'u' || charLower == 'v') {
            letterToNumber = 8;
        }
        if(charLower == 'w' || charLower == 'x' || charLower == 'y' || charLower == 'z') {
            letterToNumber = 9;
        }
        
        
        return letterToNumber;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        
        int userInputLength = userInput.length();
        
        String newNumber = "";
        
        int i;
        //go char by car
        //if number, copy to new string
        //if dash, copy to new string
        //if letter, call function, copy function return to new string
        for(i = 0; i < userInputLength; i++) {
            char curChar = userInput.charAt(i);
            
            //if number
            if(Character.isDigit(curChar) == true) {
                newNumber = newNumber + curChar;
            }
            //if dash, ascii=45
            if(curChar == '-') {
                newNumber = newNumber + "-";
            }
            
            
            
            
            //if lowercase letter
            if(Character.isLowerCase(curChar) == true) {
                if(curChar == 'a' || curChar == 'b' || curChar == 'c') {
                    //number 2
                    newNumber = newNumber + "2";
                }
                if(curChar == 'd' || curChar == 'e' || curChar == 'f') {
                    //number 3
                    newNumber = newNumber + "3";
                }
                if(curChar == 'g' || curChar == 'h' || curChar == 'i') {
                    //number 4
                    newNumber = newNumber + "4";
                }
                if(curChar == 'j' || curChar == 'k' || curChar == 'l') {
                    //number 5
                    newNumber = newNumber + "5";
                }
                if(curChar == 'm' || curChar == 'n' || curChar == 'o') {
                    //number 6
                    newNumber = newNumber + "6";
                }
                if(curChar == 'p' || curChar == 'q' || curChar == 'r' || curChar == 's') {
                    //number 7
                    newNumber = newNumber + "7";
                }
                if(curChar == 't' || curChar == 'u' || curChar == 'v') {
                    //number 8
                    newNumber = newNumber + "8";
                }
                if(curChar == 'w' || curChar == 'x' || curChar == 'y' || curChar == 'z') {
                    //number 9
                    newNumber = newNumber + "9";
                }
            }
            
            //if uppercase letter
            if(Character.isUpperCase(curChar) == true) {
                newNumber = newNumber + getNumber(curChar);
            }
            
            
        }
        
        System.out.println(newNumber);
        
    }
    
}
