/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw3_q2;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW3_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Loan Amount: ");
        int loanAmount = input.nextInt();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        
        System.out.println("Interest Rate    Monthly Payment    Total Payment");
        
        
        
        int i;
        double interest = 5.000;
        double r;
        double n = years*12;
        double monthly;
        double total;
        
        for(i=0; i <= 24; i++) {
            //each rate
            r = (interest * .01) / 12;
            
            //monthly payment
            double var1 = 1+r;
            monthly = Math.pow(var1, n);
            monthly = monthly * r;
            double var2 = Math.pow(var1, n);
            monthly = monthly / (var2 - 1);
            monthly = monthly * loanAmount;
            
            //total payment
            total = monthly * n;
            
            //proper decimal places
            total = (int)(total*100)/100.0;
            monthly = (int)(monthly*100)/100.0;
            //interest = (int)(interest*1000)/1000.0;
            String interestString = String.format("%.3f", interest);
            //print statement
            System.out.println(interestString + "            " + monthly+"            "+total);
            
            //increase interest each loop
            interest = interest + 0.125;
        }
        
        
        
    }
    
}
