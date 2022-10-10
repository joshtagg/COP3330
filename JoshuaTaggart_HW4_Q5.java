/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw4_q5;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW4_Q5 {

    /**
     * @param args the command line arguments
     */
    
    public static boolean equals(int[] list1, int[] list2) {
        
        int i;
        if(list1.length == list2.length) {
            //nothing
        }
        else {
            return false;
        }
        for(i = 0; i < list1.length; i++) {
            if(list1[i] == list2[i]) {
                //nothing
            }
            else {
                return false;
            }
        }
        
        return true;
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        int i;
        
        System.out.print("Enter list1: ");
        int list1Length = input.nextInt();
        int list1[] = new int[list1Length];
        for(i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        
        System.out.print("Enter list2: ");
        int list2Length = input.nextInt();
        int list2[] = new int[list2Length];
        for(i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        
        if(equals(list1, list2) == true) {
            System.out.println("Two lists are strictly identical");
        }
        else {
            System.out.println("Two lists are not strictly identical");
        }
        
        
        
        
    }
    
}
