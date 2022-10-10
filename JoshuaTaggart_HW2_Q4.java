/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw2_q4;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW2_Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //initial prompt for user
        System.out.print("scissor (0), rock (1), paper (2): ");
        //user input
        int userInput = input.nextInt();
        
        int computer = ((int)(Math.random()*3));
        
        //computer is scissor
        if(computer == 0) {
            if(userInput == 0) {
                System.out.println("The computer is scissor. You are scissor too. It is a draw");
                
            }
            if(userInput == 1) {
                System.out.println("The computer is scissor. You are rock. You won");
            }
            if(userInput == 2) {
                System.out.println("The computer is scissor. You are paper. You lost");
            }
        }
        //computer is rock
        else if(computer == 1) {
            if(userInput == 0) {
                System.out.println("The computer is rock. You are scissor. You lost");
            }
            if(userInput == 1) {
                System.out.println("The computer is rock. You are rock too. It is a draw");
            }
            if(userInput == 2) {
                System.out.println("The computer is rock. You are paper. You won");
            }
        }
        //computer is paper
        else if(computer == 2) {
            if(userInput == 0) {
                System.out.println("The computer is paper. You are scissor. You won");
            }
            if(userInput == 1) {
                System.out.println("The computer is paper. You are rock. You lose");
            }
            if(userInput == 2) {
                System.out.println("The computer is paper. You are paper too. It is a draw");
            }
        }
        
        
    }
    
}
