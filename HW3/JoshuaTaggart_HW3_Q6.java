/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw3_q6;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW3_Q6 {

    /**
     * @param args the command line arguments
     */
    
    public static int sumDigits(long n) {
        int result = 0;
        int i;
        long newN = 0;
        long extract;
        
        //convert long to string, find length
        String toString = String.valueOf(n);
        int nLength = toString.length();
        
        //loop
        for(i = 0; i < nLength; i++) {
            //first loop
            if(i == 0) {
                extract = n % 10;
                result = (int)extract;
                newN = (int)n/10; 
                
            }
            else {
                extract = newN % 10;
                result += extract;
                newN = (int)newN/10;
            }
            //extract = n % 10;
            //result += extract;
            
        }
        
        
        return result;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter digit: ");
        long number = input.nextLong();
        
        //sumDigits(number);
        
        System.out.println("Sum of digits: " + sumDigits(number));
        
    }
    
}
