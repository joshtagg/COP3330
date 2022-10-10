/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw1_q6;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW1_Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //initial prompt for user
        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();
        //second prompt for user
        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();
        //third prompt for user
        System.out.print("Enter number of years: ");
        double years = input.nextDouble();
        
        double futureValue;
        
        //convert annual rate to monthly
        double monthlyInterest = interestRate / 100;
        monthlyInterest = monthlyInterest / 12;
        
        //split up formula
        double formulaPart1 = 1 + monthlyInterest;
        double formulaPart2 = years * 12;
        
        //more formula calculations
        futureValue = Math.pow(formulaPart1, formulaPart2);
        futureValue = futureValue * investment;
        
        //round futureValue to proper decimal places
        futureValue = (int)(futureValue*100)/100.0;
        
        
        //print final output
        System.out.println("Future value is $" + futureValue);
    
        
    }
    
}
