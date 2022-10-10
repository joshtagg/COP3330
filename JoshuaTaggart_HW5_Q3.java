/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw5_q3;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW5_Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        int i, j;
        
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        //create empty array
        double[][] array = new double[row][column];
        
        System.out.println("Enter the array: ");
        for(i = 0; i < row; i++) {
            for(j = 0; j < column; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        
        Location location1 = Location.locateLargest(array);
        
        /*
        int maxValue = 0;
        Location location1 = new Location(row, column, maxValue);
        Location.locateLargest(array);
        */
        
        System.out.println("The location of the largest element is " + location1.maxValue + " at (" + location1.row + ", " + location1.column + ")");
        
        
        
    }
    
}

class Location {
    
    public int row;
    public int column;
    public double maxValue;
    
    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
    
    
    public static Location locateLargest(double[][] array) {
        int i, j;
        int row = 0;
        int column = 0;
        double maxValue = array[row][column];
        
        //i < row; j < column
        for(i = 0; i < array.length; i++) {
            for(j = 0; j < array[i].length; j++) {
                if(maxValue < array[i][j]) {
                    maxValue = array[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        
        //update constructor
        return new Location(row, column, maxValue);
        
        
    }
    
    
}