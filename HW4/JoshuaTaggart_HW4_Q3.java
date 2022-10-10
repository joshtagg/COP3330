/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw4_q3;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW4_Q3 {

    /**
     * @param args the command line arguments
     */
    
    public static int linearSearch(int[] list, int key) {
        int i;
        
        for(i = 0; i < list.length; i++) {
            if(key == list[i]) {
                return i;
            }
        }
        return -1;
        
    }
    
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        
        while (high >= low) {
            int mid = (low + high) / 2;
            if(key < list[mid]) {
                high  = mid - 1;
            }
            else if(key == list[mid]) {
                return mid;
            }
            else {
                low = mid + 1;
            }
        }
        
        return -low - 1;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        int i;
        //int j;
        int min = 1;
        int max = 100000;
        
        //initialize array
        int array[] = new int[100000];
        
        //populate array
        for(i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        
        //shuffle array
        for(i = 0; i < array.length - 1; i++) {
            //generate an index j randomly
            int j = (int)(Math.random() * array.length);
            //swap array[i] with array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        
        //now we have a randomized array
        //now generate a key
        int keyTemp = (int)(Math.random() * (max-min) + min);
        int key = array[keyTemp];
        
        //now, perform and time linearSeach and binarySearch
        long startTime = System.currentTimeMillis();
        int linear = linearSearch(array, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        
        System.out.println("Amount of time for linearSearch: " + executionTime + " seconds");
        
        long startTime2 = System.currentTimeMillis();
        int binary = binarySearch(array, key);
        long endTime2 = System.currentTimeMillis();
        long executionTime2 = endTime2 - startTime2;
        
        System.out.println("Amount of tume for binarySearch: " + executionTime2 + " seconds");
        
    }
    
}
