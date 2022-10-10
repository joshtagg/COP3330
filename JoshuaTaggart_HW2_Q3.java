/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw2_q3;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW2_Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        int max = 999;
        int min = 100;
        String lottery = "" + (int)(Math.random()*(max-min) + min);
        
        //System.out.print(lottery);
        
        //initial prompt for user
        System.out.print("Enter your lottery pick (three digits): ");
        String guess = input.nextLine();
        
        //Get digits from lottery
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);
        char lotteryDigit3 = lottery.charAt(2);
        
        //Get digits from guess
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);
        char guessDigit3 = guess.charAt(2);
        
        System.out.println("The lottery number is " + lottery);
        
        //Check the guess
        if(guess.equals(lottery)) {
            System.out.println("Exact match: you win $10,000");
        }
        else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) {
            //win 3k
            if(guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) {
                if(guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
                    System.out.println("Match all digits: you win $3,000");
                }
            }
        }
        //match one digit
        else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
            System.out.println("Match one digit: you win $1,000");
        }
        //no match
        else {
            System.out.println("Sorry, no match");
        }
        
    }
    
}
