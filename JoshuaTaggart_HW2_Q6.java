/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw2_q6;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW2_Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        double xDegreesAtlanta = 33.7489954;
        double yDegreesAtlanta = -84.3879824;
        double xDegreesCharlotte = 35.2270869;
        double yDegreesCharlotte = -80.8431267;
        double xDegreesSavannah = 32.0835407;
        double yDegreesSavannah = -81.0998342;
        double xDegreesOrlando = 28.5383355;
        double yDegreesOrlando = -81.3792365;
        
        //convert values to rad
        double xRadAtlanta = Math.toRadians(xDegreesAtlanta);
        double yRadAtlanta = Math.toRadians(yDegreesAtlanta);
        double xRadCharlotte = Math.toRadians(xDegreesCharlotte);
        double yRadCharlotte = Math.toRadians(yDegreesCharlotte);
        double xRadSavannah = Math.toRadians(xDegreesSavannah);
        double yRadSavannah = Math.toRadians(yDegreesSavannah);
        double xRadOrlando = Math.toRadians(xDegreesOrlando);
        double yRadOrlando = Math.toRadians(yDegreesOrlando);
        
        //calculate distances
        double distanceCA = 6371.01 * Math.acos((Math.sin(xRadCharlotte)*Math.sin(xRadAtlanta)) + (Math.cos(xRadCharlotte)*Math.cos(xRadAtlanta)*Math.cos(yRadCharlotte-yRadAtlanta)));
        double distanceAO = 6371.01 * Math.acos((Math.sin(xRadAtlanta)*Math.sin(xRadOrlando)) + (Math.cos(xRadAtlanta)*Math.cos(xRadOrlando)*Math.cos(yRadAtlanta-yRadOrlando)));
        double distanceOS = 6371.01 * Math.acos((Math.sin(xRadOrlando)*Math.sin(xRadSavannah)) + (Math.cos(xRadOrlando)*Math.cos(xRadSavannah)*Math.cos(yRadOrlando-yRadSavannah)));
        double distanceSC = 6371.01 * Math.acos((Math.sin(xRadSavannah)*Math.sin(xRadCharlotte)) + (Math.cos(xRadSavannah)*Math.cos(xRadCharlotte)*Math.cos(yRadSavannah-yRadCharlotte)));
        double distanceOC = 6371.01 * Math.acos((Math.sin(xRadOrlando)*Math.sin(xRadCharlotte)) + (Math.cos(xRadOrlando)*Math.cos(xRadCharlotte)*Math.cos(yRadOrlando-yRadCharlotte)));
        
        //Area of triangle, CAO
        double triangle1s = ((distanceCA + distanceAO + distanceOC) / 2);
        double triangle1Area = Math.sqrt(triangle1s*((triangle1s-distanceCA)*(triangle1s-distanceAO)*(triangle1s-distanceOC)));
        
        //Area of triangle, CSO
        double triangle2s = ((distanceSC + distanceOS + distanceOC) / 2);
        double triangle2Area = Math.sqrt(triangle2s*((triangle2s-distanceSC)*(triangle2s-distanceOS)*(triangle2s-distanceOC)));
        
        //final area
        double areaFinal = triangle1Area + triangle2Area;
        
        //final output
        System.out.println("The area is: " + areaFinal);
        
        
    }
    
}
