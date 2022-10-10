/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw3_q4;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW3_Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year: ");
        int firstDay = input.nextInt();
        
        int i;

        int numberOfDaysInMonth = 0;
        for (int month = 1; month <= 12; month++)
        {
            
            System.out.print("  \t");
            
            switch (month)
            {
                case 1:
                    System.out.println("January " + year);
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    System.out.println("February " + year);
                    if (year % 4 == 0) {
                        numberOfDaysInMonth = 29;
                    } else {
                        numberOfDaysInMonth = 28;
                    }
                    break;
                case 3:
                    System.out.println("March " + year);
                    numberOfDaysInMonth = 31;
                    break;
                case 4:
                    System.out.println("April " + year);
                    numberOfDaysInMonth = 30;
                    break;
                case 5:
                    System.out.println("May " + year);
                    numberOfDaysInMonth = 31;
                    break;
                case 6:
                    System.out.println("June " + year);
                    numberOfDaysInMonth = 30;
                    break;
                case 7:
                    System.out.println("July " + year);
                    numberOfDaysInMonth = 31;
                    break;
                case 8:
                    System.out.println("August " + year);
                    numberOfDaysInMonth = 31;
                    break;
                case 9:
                    System.out.println("September " + year);
                    numberOfDaysInMonth = 30;
                    break;
                case 10:
                    System.out.println("October " + year);
                    numberOfDaysInMonth = 31;
                    break;
                case 11:
                    System.out.println("November " + year);
                    numberOfDaysInMonth = 30;
                    break;
                case 12:
                    System.out.println("December " + year);
                    numberOfDaysInMonth = 31;
                    break;
            }
            
            System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
                
            
            //initial spacing for first day of year
            for (i = 0; i < firstDay; i++) {
                System.out.print("    ");
            }
            
            
            for (i = 1; i <= numberOfDaysInMonth; i++) {
            
                //spacing for single digit numbers
                if (i < 10) {
                    System.out.print("   " + i);
                } 
                //spacing for 2 digit numbers
                else {
                    System.out.print("  " + i);
                }
                //new week line
                if ((i + firstDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();


            firstDay = (firstDay + numberOfDaysInMonth) % 7;
        }
    }
}
    
    

