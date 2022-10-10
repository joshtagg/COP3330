/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw2_q9;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW2_Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //initial prompt for user
        System.out.print("Enter a SSN: ");
        String socialSec = input.nextLine();
        
        
        int counter = 0;
        
        if(socialSec.charAt(0) >= 48 && socialSec.charAt(0) <= 57) {
            counter = counter + 1;
            if(socialSec.charAt(1) >= 48 && socialSec.charAt(1) <= 57) {
                counter = counter + 1;
                if(socialSec.charAt(2) >= 48 && socialSec.charAt(2) <= 57) {
                    counter = counter + 1;
                    if(socialSec.charAt(3) == '-') {
                        counter = counter + 1;
                        if(socialSec.charAt(4) >= 48 && socialSec.charAt(4) <= 57) {
                            counter = counter + 1;
                            if(socialSec.charAt(5) >= 48 && socialSec.charAt(5) <= 57) {
                                counter = counter + 1;
                                if(socialSec.charAt(6) == '-') {
                                    counter = counter + 1;
                                    if(socialSec.charAt(7) >= 48 && socialSec.charAt(7) <= 57) {
                                        counter = counter + 1;
                                        if(socialSec.charAt(8) >= 48 && socialSec.charAt(8) <= 57) {
                                            counter = counter + 1;
                                            if(socialSec.charAt(9) >= 48 && socialSec.charAt(9) <= 57) {
                                                counter = counter + 1;
                                                if(socialSec.charAt(10) >= 48 && socialSec.charAt(10) <= 57) {
                                                    counter = counter + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        //valid ss number
        if(counter == 11) {
            System.out.println(socialSec + " is a valid social security number");
        }
        //if counter is anything but 11, it is invalid ss number
        else {
            System.out.println(socialSec + " is an invalid social security number");
        }
        
        
        
        
        
    }
    
}
