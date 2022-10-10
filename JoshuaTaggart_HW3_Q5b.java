/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw3_q5b;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW3_Q5b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String word = input.nextLine();
        
        int wordLength = word.length();
        int vowelCounter = 0;
        int consonantCounter = 0;
        int letterCounter = 0;
        
        boolean j;
        
        int i;
        for(i = 0; i < wordLength; i++) {
            char letter = word.charAt(i);
            j = Character.isLetter(letter);
            //vowel counter
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCounter++;
            }
            //letter counter
            if(j == true) {
                letterCounter++;
            }
            
        }
        
        consonantCounter = letterCounter - vowelCounter;
        
        System.out.println("The number of vowels is " + vowelCounter);
        System.out.println("The number of consonants is " + consonantCounter);
        
    }
    
}
