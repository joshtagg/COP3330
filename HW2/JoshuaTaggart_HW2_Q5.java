/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw2_q5;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW2_Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //initital prompt for user
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        
        
        double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        double mathVar1 = Math.abs(r1 - r2);
        double mathVar2 = r1 + r2;
        if(distance <= mathVar1) {
            //circle2 in circle1
            System.out.println("circle2 is inside circle1");
        }
        
        else if(distance <= mathVar2) {
            //circle2 overlaps circle1
            System.out.println("circle2 overlaps circle1");
        }
        
        else {
            //neither
            System.out.println("circle2 neither overlaps nor is inside circle1");
        }
        
        
        
        
    }
    
}
