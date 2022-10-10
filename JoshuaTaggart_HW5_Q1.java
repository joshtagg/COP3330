/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw5_q1;

//import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW5_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        
        //declaring/creating random object
        java.util.Random random1 = new java.util.Random();
        
        //create array to be sorted
        int[] numArray = new int[100000];
        
        //fill array with random numbers
        for(i = 0; i < numArray.length; i++) {
            numArray[i] = random1.nextInt(1000);
        }
        
        //create stopwatch object
        StopWatch stopWatch1 = new StopWatch();
        //stopWatch1.start();
        sort(numArray);
        stopWatch1.stop();
        
        System.out.println("Sorting 100,000 numbers took " + stopWatch1.getElapsedTime() + " milliseconds.");
        
        
    }
    
    public static void sort(int[] numArray) {
        int i, j;
        for(i = 0; i < numArray.length; i++) {
            int currentMin = numArray[i];
            int currentMinIndex = i;
            for(j = 0; j < numArray.length; j++) {
                if(currentMin > numArray[j]) {
                    currentMin = numArray[j];
                    currentMinIndex = j;
                }
            }
            
            if(currentMinIndex != i) {
                numArray[currentMinIndex] = numArray[i];
                numArray[i] = currentMin;
            }
            
        }
    }
    
}

class StopWatch {
    
    private long startTime;
    private long endTime;
    
    //constructor
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    
    public long getStartTime() {
        return this.startTime;
    }
    
    public long getEndTime() {
        return this.endTime;
    }
    
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
    
    
}
