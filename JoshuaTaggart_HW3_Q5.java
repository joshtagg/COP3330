/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw3_q5;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW3_Q5 {

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
        
        int i;
        for(i = 0; i < wordLength; i++) {
            if(i % 2 == 0) {
                //odd spot, print letter at i
                System.out.print(word.charAt(i));
            }
        }
        
        System.out.println("");
        
    }
    
}
