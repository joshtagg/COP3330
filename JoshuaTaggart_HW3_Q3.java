/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw3_q3;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW3_Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        double i;
        //int var;
        double piSum = 0;
        //double finalpi;
        for(i = 10000; i <= 100000; i+=10000) {
            int j;
            //positive and minus fraction part of formula, calculate in pairs each time
            for(j =1; j <=i; j+=2) {
                piSum += (1.0/((2.0*j)-1.0)) - (1.0/((2.0*j)+1.0));
            }

            System.out.println("P-value for i = "+ i + ": " + (4*piSum));
            
            //reset pisum for every i
            piSum = 0;
        }
    }
}
