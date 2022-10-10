/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw3_q8;

import java.util.Scanner;

/**
 *
 * @author joshu
 */




public class JoshuaTaggart_HW3_Q8 {

    /**
     * @param args the command line arguments
     */
    
    public static int numberOfDaysInAYear(int year) {
        int numDays = 0;
        
        //if year%4 == 0 its a leap year, 366 days
        //else, 365 days
        if(year % 4 == 0) {
            numDays = 366;
        }
        else {
            numDays = 365;
        }
        
        return numDays;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        int curYear = 2000;
        int i;
        
        for(i = 0; i < 20; i++) {
            System.out.println("There are " + numberOfDaysInAYear(curYear) + " days in " + curYear);
            curYear++;
        }
        
    }
    
}
