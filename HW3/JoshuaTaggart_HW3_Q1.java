/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw3_q1;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW3_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        int space = 14;
        int i;
        int j;
        int rows = 8;
        
        for(i = 0; i < rows; i++) {
            for(j = 0; j < space; j++) {
                System.out.print(" ");
            }
            
            if(i == 0) {
                System.out.println("            1");
            }
            if(i == 1) {
                System.out.println("         1    2   1");
            }
            if(i == 2) {
                System.out.println("       1   2    4   2   1");
            }
            if(i == 3) {
                System.out.println("     1   2   4    8   4   2   1");
            }
            if(i == 4) {
                System.out.println("   1   2   4   8   16   8   4   2  1");
            }
            if(i == 5) {
                System.out.println("  1  2   4   8  16   32  16   8   4  2  1");
            }
            if(i == 6) {
                System.out.println(" 1  2  4   8  16  32   64  32  16   8  4  2  1");
            }
            if(i == 7) {
                System.out.println("1  2  4  8  16  32  64  128  64  32  16  8  4  2  1");
            }
            
            
            space = space-2;
        }
        
        
    }
    
}
