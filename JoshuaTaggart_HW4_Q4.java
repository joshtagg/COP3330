/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw4_q4;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW4_Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        int i, j;
        
        System.out.print("Enter the number of balls to drop: ");
        int numBalls = input.nextInt();
        System.out.print("Enter the number of slots in the machine: ");
        int numSlots = input.nextInt();
        
        //create array
        //initialize all to 0s
        int slotArray[] = new int[numSlots];
        for(i = 0; i < slotArray.length; i++) {
            slotArray[i] = 0;
        }
        //array for num of R's
        //initialize all to 0s
        int numR[] = new int[numBalls];
        for(i = 0; i < numR.length; i++) {
            numR[i] = 0;
        }
        
        //int min = 1;
        //int max = 2;
        //int randValue;
        
        for(i = 0; i < numBalls; i++) {
            for(j = 0; j < numSlots-1; j++) {
                //randValue = (int)(Math.random() * (max-min) + min);
                //left
                if(Math.random() < 0.5) {
                    System.out.print("L");
                }
                //right
                else {
                    System.out.print("R");
                    numR[i]++;
                }
            }
            System.out.println("");
        }
        
        //populate slots array
        int slot;
        for(i = 0; i < numR.length; i++) {
            slot = numR[i];
            
            slotArray[slot]++;
        }
        
        //print full board
        int v;
        //int gridBoard[][] = new int[numBalls][numSlots];
        //populate 2d array
        for(i = 0; i < numBalls; i++) {
            for(j = 0; j < numSlots; j++) {
                v = numBalls - slotArray[j];
                if(v > i) {
                    //gridBoard[i][j] = 1;
                    System.out.print(" ");
                }
                else {
                    //gridBoard[i][j] = 0;
                    System.out.print("0");
                }
                
            }
            System.out.println("");
        }
        
        
    }
    
}
