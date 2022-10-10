/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw2_q10;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW2_Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //initial prompt
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWeek = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();
        
        //calculations
        double grossPay = hourlyPay * hoursWeek;
        double fedWithholding = grossPay * federalRate;
        double fedPercent = federalRate * 100;
        double stateWithholding = grossPay * stateRate;
        double statePercent = stateRate * 100;
        double totalDeduct = stateWithholding + fedWithholding;
        double netPay = grossPay - totalDeduct;
        
        //shorten number of digits
        stateWithholding = (int)(stateWithholding*100)/100.0;
        totalDeduct = (int)(totalDeduct*100)/100.0;
        netPay = (int)(netPay*100)/100.0;
        
        //final outputs
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWeek);
        System.out.println("Pay Rate: $" + hourlyPay);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding (" + fedPercent + "): $" + fedWithholding);
        System.out.println("  State Withholding (" + statePercent + "): $" + stateWithholding);
        System.out.println("  Total Deduction: $" + totalDeduct);
        System.out.println("Net Pay: $" + netPay);
        
        
        
        
        
        
    }
    
}
