/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joshuataggart_hw5_q2;

import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class JoshuaTaggart_HW5_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        //create linearequation object
        LinearEquation linearEquation1 = new LinearEquation(a, b, c, d, e, f);
        
        //calculate results
        if(linearEquation1.isSolvable()) {
            System.out.println("x is " + linearEquation1.getX() + " and y is " + linearEquation1.getY());
        }
        else {
            System.out.println("The equation has no solution.");
        }
        
    }
    
}

class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    
    //contructor
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
       this.a = a;
       this.b = b;
       this.c = c;
       this.d = d;
       this.e = e;
       this.f = f;
    }
    
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getD() {
        return this.d;
    }
    public double getE() {
        return this.e;
    }
    public double getF() {
        return this.f;
    }
    
    public boolean isSolvable() {
        if(a*d-b*c != 0) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public double getX() {
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY() {
        return (a*f-e*c)/(a*d-b*c);
    }
    
    
    
}
