/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw4_q6;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW4_Q6 {

    /**
     * @param args the command line arguments
     */
    
    public static boolean isMarkovMatrix(double[][] m) {
        int i;
        
        //column 1
        double sum1 = m[0][0] + m[1][0] + m[2][0];
        //column 2
        double sum2 = m[0][1] + m[1][1] + m[2][1];
        //column 3
        double sum3 = m[0][2] + m[1][2] + m[2][2];
        
        if(sum1 >= 0 && sum2 >= 0 && sum3 >= 0) {
            //continue
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        int i, j;
        
        double matrix[][] = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for(i = 0; i < 3; i++) {
          for(j = 0; j < 3; j++) {
              matrix[i][j] = input.nextDouble();
          }  
        }
        
        if(isMarkovMatrix(matrix) == true) {
            System.out.println("It is a Markov matrix");
        }
        else {
            System.out.println("It is not a Markov matrix");
        }
        
        
    }
    
}
