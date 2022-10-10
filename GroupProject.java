/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package groupproject;

import java.util.Scanner;



/**
 *
 * @author joshu
 */
public class GroupProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object
        Scanner input = new Scanner(System.in);
        int i;
        
        System.out.print("How many math students this semester?: ");
        int numMathStudents = input.nextInt();
        System.out.print("How many science students this semester?: ");
        int numScienceStudents = input.nextInt();
        System.out.print("How many english students this semester?: ");
        int numEnglishStudents = input.nextInt();
        
        input.nextLine();
        
        /*
        &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        */
        
        //----------------------------------------------------------------------
        //adding math students
        mathMajor[] mathArr;
        mathArr = new mathMajor[numMathStudents];
        for(i = 0; i < numMathStudents; i++) {
            
            System.out.print("Enter math student name: ");
            String name = input.nextLine();
            System.out.print("Enter math student grade: ");
            String grade = input.nextLine();
            System.out.print("Enter math student email: ");
            String email = input.nextLine();
            System.out.print("Enter number of major math classes taking this semester: ");
            int majorMathClasses = input.nextInt();
            System.out.print("Enter number of minor math classes taking this semester: ");
            int minorMathClasses = input.nextInt();
            
            input.nextLine();
            
            mathArr[i] = new mathMajor(name, grade, email, majorMathClasses, minorMathClasses);
        }
        //----------------------------------------------------------------------
        //adding science students
        scienceMajor[] scienceArr;
        scienceArr = new scienceMajor[numScienceStudents];
        for(i = 0; i < numScienceStudents; i++) {
            
            System.out.print("Enter science student name: ");
            String name = input.nextLine();
            System.out.print("Enter science student grade: ");
            String grade = input.nextLine();
            System.out.print("Enter science student email: ");
            String email = input.nextLine();
            System.out.print("Enter number of major science classes taking this semester: ");
            int majorScienceClasses = input.nextInt();
            System.out.print("Enter number of minor science classes taking this semester: ");
            int minorScienceClasses = input.nextInt();
            
            input.nextLine();
            
            scienceArr[i] = new scienceMajor(name, grade, email, majorScienceClasses, minorScienceClasses);
        }
        //----------------------------------------------------------------------
        //adding english students
        englishMajor[] englishArr;
        englishArr = new englishMajor[numEnglishStudents];
        for(i = 0; i < numEnglishStudents; i++) {
            
            System.out.print("Enter english student name: ");
            String name = input.nextLine();
            System.out.print("Enter english student grade: ");
            String grade = input.nextLine();
            System.out.print("Enter english student email: ");
            String email = input.nextLine();
            System.out.print("Enter number of major english classes taking this semester: ");
            int majorEnglishClasses = input.nextInt();
            System.out.print("Enter number of minor english classes taking this semester: ");
            int minorEnglishClasses = input.nextInt();
            
            input.nextLine();
            
            englishArr[i] = new englishMajor(name, grade, email, majorEnglishClasses, minorEnglishClasses);
        }
        
        /*
        &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        */
        
        while(true) {
            System.out.println("-----------------------------------");
            System.out.println("1. Display student details");
            System.out.println("2. Calculate funding");
            System.out.println("3. Exit Program");
            System.out.println("-----------------------------------");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            
            switch(choice) {
                case 1: System.out.println("Entered menu 1.");
                System.out.println("-----------------------------------");
                System.out.println("What kind of student is this?");
                System.out.println("1. Math Student");
                System.out.println("2. Science Student");
                System.out.println("3. English Student");
                System.out.println("-----------------------------------");
                int studentType = input.nextInt();
                
                input.nextLine();
                
                //**********if searching for math student**********
                if(studentType == 1) {
                    int studentNum = 0;
                    System.out.print("What is the name of this math student you are looking for?: ");
                    String mathStudentName = input.nextLine();
                    
                    for(i = 0; i < numMathStudents; i++) {
                        if(mathStudentName.equals(mathArr[i].getName())) {
                            studentNum = i;
                            break;
                        }
                    }
                    
                    //print out math student info
                    System.out.println("Math student name: " + mathArr[studentNum].getName());
                    System.out.println("Math student grade: " + mathArr[studentNum].getGrade());
                    System.out.println("Math student email: " + mathArr[studentNum].getEmail());
                    System.out.println("Math student number of major math classes: " + mathArr[studentNum].getMajorMathClasses());
                    System.out.println("Math student number of minor math classes: " + mathArr[studentNum].getMinorMathClasses());   
                }
                
                //**********if searching for science student**********
                if(studentType == 2) {
                    int studentNum = 0;
                    System.out.print("What is the name of this science student you are looking for?: ");
                    String scienceStudentName = input.nextLine();
                    
                    for(i = 0; i < numScienceStudents; i++) {
                        if(scienceStudentName.equals(scienceArr[i].getName())) {
                            studentNum = i;
                            break;
                        }
                    }
                    
                    //print out science student info
                    System.out.println("Science student name: " + scienceArr[studentNum].getName());
                    System.out.println("Science student grade: " + scienceArr[studentNum].getGrade());
                    System.out.println("Science student email: " + scienceArr[studentNum].getEmail());
                    System.out.println("Science student number of major science classes: " + scienceArr[studentNum].getMajorScienceClasses());
                    System.out.println("Science student number of minor science classes: " + scienceArr[studentNum].getMinorScienceClasses());   
                }
                
                //**********if searching for english student**********
                if(studentType == 3) {
                    int studentNum = 0;
                    System.out.print("What is the name of this english student you are looking for?: ");
                    String englishStudentName = input.nextLine();
                    
                    for(i = 0; i < numEnglishStudents; i++) {
                        if(englishStudentName.equals(englishArr[i].getName())) {
                            studentNum = i;
                            break;
                        }
                    }
                    
                    //print out english student info
                    System.out.println("English student name: " + englishArr[studentNum].getName());
                    System.out.println("English student grade: " + englishArr[studentNum].getGrade());
                    System.out.println("English student email: " + englishArr[studentNum].getEmail());
                    System.out.println("English student number of major english classes: " + englishArr[studentNum].getMajorEnglishClasses());
                    System.out.println("English student number of minor english classes: " + englishArr[studentNum].getMinorEnglishClasses());
                }     
           
                break;
                
                case 2: System.out.println("Entered menu 2.");
                //calculate funding
                System.out.println("-----------------------------------");
                System.out.println("Which subject would you like to calculate the funding for?");
                System.out.println("1. Math");
                System.out.println("2. Science");
                System.out.println("3. English");
                System.out.println("-----------------------------------");
                int subjectOption = input.nextInt();
                
                input.nextLine();
                
                //math subject
                if(subjectOption == 1) {
                    System.out.print("How much does it cost to fund a major math class? (cost per student): $");
                    double majorMathClassCost = input.nextDouble();
                    System.out.print("How much does it cost to fund a minor math class? (cost per student): $");
                    double minorMathClassCost = input.nextDouble();
                    mathFunding mathFunding = new mathFunding(majorMathClassCost, minorMathClassCost, numMathStudents, mathArr);
                    
                    System.out.println("The total cost of the math program this semester would be $" + mathFunding.getTotalFunding());
                    
                }
                
                //science subject
                if(subjectOption == 2) {
                    System.out.print("How much does it cost to fund a major science class? (cost per student): $");
                    double majorScienceClassCost = input.nextDouble();
                    System.out.print("How much does it cost to fund a minor science class? (cost per student): $");
                    double minorScienceClassCost = input.nextDouble();
                    scienceFunding scienceFunding = new scienceFunding(majorScienceClassCost, minorScienceClassCost, numScienceStudents, scienceArr);
                    
                    System.out.println("The total cost of the science program this semester would be $" + scienceFunding.getTotalFunding());
                }
                
                //english subject
                if(subjectOption == 3) {
                    System.out.print("How much does it cost to fund a major english class? (cost per student): $");
                    double majorEnglishClassCost = input.nextDouble();
                    System.out.print("How much does it cost to fund a minor english class? (cost per student): $");
                    double minorEnglishClassCost = input.nextDouble();
                    englishFunding englishFunding = new englishFunding(majorEnglishClassCost, minorEnglishClassCost, numEnglishStudents, englishArr);
                    
                    System.out.println("The total cost of the english program this semester would be $" + englishFunding.getTotalFunding());
                }
                
                break;
                
                case 3: System.out.println("Exiting program...");
                System.exit(0);
                default: System.out.println("Incorrect input. Try Again.");
            
            } //end of switch statement
            
            
        }//end of main menu
        
        
        
        
    }//end of main() code
}

/*
################################################################################
*/

class Student {
    
    //student name, grade, email
    private String name;
    private String grade;
    private String email;
    
    
    //constructor
    public Student(String name, String grade, String email) {
        this.name = name;
        this.grade = grade;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public String getGrade() {
        return grade;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}

class mathMajor extends Student {
    
    private int majorMathClasses;
    private int minorMathClasses;
    
    //constructor
    public mathMajor(String name, String grade, String email, int majorMathClasses, int minorMathClasses) {
        super(name, grade, email);
        this.majorMathClasses = majorMathClasses;
        this.minorMathClasses = minorMathClasses;
    }
    
    public int getMajorMathClasses() {
        return majorMathClasses;
    }
    
    public int getMinorMathClasses() {
        return minorMathClasses;
    }
    
    public void setMajorMathClasses(int majorMathClasses) {
        this.majorMathClasses = majorMathClasses;
    }
    
    public void setMinorMathClasses(int minorMathClasses) {
        this.minorMathClasses = minorMathClasses;
    }
}

class scienceMajor extends Student {
    
    private int majorScienceClasses;
    private int minorScienceClasses;
    
    //constructor
    public scienceMajor(String name, String grade, String email, int majorScienceClasses, int minorScienceClasses) {
        super(name, grade, email);
        this.majorScienceClasses = majorScienceClasses;
        this.minorScienceClasses = minorScienceClasses;
    }
    
    public int getMajorScienceClasses() {
        return majorScienceClasses;
    }
    
    public int getMinorScienceClasses() {
        return minorScienceClasses;
    }
    
    public void setMajorScienceClasses(int majorScienceClasses) {
        this.majorScienceClasses = majorScienceClasses;
    }
    
    public void setMinorScienceClasses(int minorScienceClasses) {
        this.minorScienceClasses = minorScienceClasses;
    }
}

class englishMajor extends Student {
    
    private int majorEnglishClasses;
    private int minorEnglishClasses;
    
    //constructor
    public englishMajor(String name, String grade, String email, int majorEnglishClasses, int minorEnglishClasses) {
        super(name, grade, email);
        this.majorEnglishClasses = majorEnglishClasses;
        this.minorEnglishClasses = minorEnglishClasses;
    }
    
    public int getMajorEnglishClasses() {
        return majorEnglishClasses;
    }
    
    public int getMinorEnglishClasses() {
        return minorEnglishClasses;
    }
    
    public void setMajorEnglishClasses(int majorEnglishClasses) {
        this.majorEnglishClasses = majorEnglishClasses;
    }
    
    public void setMinorEnglishClasses(int minorEnglishClasses) {
        this.minorEnglishClasses = minorEnglishClasses;
    }
}

class mathFunding {
    
    private double majorMathClassCost;
    private double minorMathClassCost;
    private int numMathStudents;
    private mathMajor[] mathArr;
    
    //constructor
    public mathFunding(double majorMathClassCost, double minorMathClassCost, int numMathStudents, mathMajor[] mathArr) {
        this.majorMathClassCost = majorMathClassCost;
        this.minorMathClassCost = minorMathClassCost;
        this.numMathStudents = numMathStudents;
        this.mathArr = mathArr;
    }
    
    public double getMajorMathClassCost() {
        return this.majorMathClassCost;
    }
    
    public double getMinorMathClassCost() {
        return this.minorMathClassCost;
    }
    
    public int getnumMathStudents() {
        return this.numMathStudents;
    }
    
    public mathMajor[] getmathArr() {
        return this.mathArr;
    }
    
    //####################
    
    public double getMajorFunding() {
        int i;
        int totalMajorClasses = 0;
        for(i = 0; i < numMathStudents; i++) {
            totalMajorClasses += mathArr[i].getMajorMathClasses();
        }
        return totalMajorClasses*majorMathClassCost;
    }
    
    public double getMinorFunding() {
        int i;
        int totalMinorClasses = 0;
        for(i = 0; i < numMathStudents; i++) {
            totalMinorClasses += mathArr[i].getMinorMathClasses();
        }
        return totalMinorClasses*minorMathClassCost;
    }
    
    public double getTotalFunding() {
        //calculate total funding to 2 decimal places
        double totalFunding = getMajorFunding() + getMinorFunding();
        totalFunding = (int)(totalFunding*100)/100.0;
        
        return totalFunding;
    }
}

class scienceFunding {
    
    private double majorScienceClassCost;
    private double minorScienceClassCost;
    private int numScienceStudents;
    private scienceMajor[] scienceArr;
    
    //constructor
    public scienceFunding(double majorScienceClassCost, double minorScienceClassCost, int numScienceStudents, scienceMajor[] scienceArr) {
        this.majorScienceClassCost = majorScienceClassCost;
        this.minorScienceClassCost = minorScienceClassCost;
        this.numScienceStudents = numScienceStudents;
        this.scienceArr = scienceArr;
    }
    
    public double getMajorScienceClassCost() {
        return this.majorScienceClassCost;
    }
    
    public double getMinorScienceClassCost() {
        return this.minorScienceClassCost;
    }
    
    public int getnumScienceStudents() {
        return this.numScienceStudents;
    }
    
    public scienceMajor[] getscienceArr() {
        return this.scienceArr;
    }
    
    //####################
    
    public double getMajorFunding() {
        int i;
        int totalMajorClasses = 0;
        for(i = 0; i < numScienceStudents; i++) {
            totalMajorClasses += scienceArr[i].getMajorScienceClasses();
        }
        return totalMajorClasses*majorScienceClassCost;
    }
    
    public double getMinorFunding() {
        int i;
        int totalMinorClasses = 0;
        for(i = 0; i < numScienceStudents; i++) {
            totalMinorClasses += scienceArr[i].getMinorScienceClasses();
        }
        return totalMinorClasses*minorScienceClassCost;
    }
    
    public double getTotalFunding() {
        //calculate total funding to 2 decimal places
        double totalFunding = getMajorFunding() + getMinorFunding();
        totalFunding = (int)(totalFunding*100)/100.0;
        
        return totalFunding;
    }
}

class englishFunding {
    
    private double majorEnglishClassCost;
    private double minorEnglishClassCost;
    private int numEnglishStudents;
    private englishMajor[] englishArr;
    
    //constructor
    public englishFunding(double majorEnglishClassCost, double minorEnglishClassCost, int numEnglishStudents, englishMajor[] englishArr) {
        this.majorEnglishClassCost = majorEnglishClassCost;
        this.minorEnglishClassCost = minorEnglishClassCost;
        this.numEnglishStudents = numEnglishStudents;
        this.englishArr = englishArr;
    }
    
    public double getMajorEnglishClassCost() {
        return this.majorEnglishClassCost;
    }
    
    public double getMinorEnglishClassCost() {
        return this.minorEnglishClassCost;
    }
    
    public int getnumEnglishStudents() {
        return this.numEnglishStudents;
    }
    
    public englishMajor[] getenglishArr() {
        return this.englishArr;
    }
    
    //####################
    
    public double getMajorFunding() {
        int i;
        int totalMajorClasses = 0;
        for(i = 0; i < numEnglishStudents; i++) {
            totalMajorClasses += englishArr[i].getMajorEnglishClasses();
        }
        return totalMajorClasses*majorEnglishClassCost;
    }
    
    public double getMinorFunding() {
        int i;
        int totalMinorClasses = 0;
        for(i = 0; i < numEnglishStudents; i++) {
            totalMinorClasses += englishArr[i].getMinorEnglishClasses();
        }
        return totalMinorClasses*minorEnglishClassCost;
    }
    
    public double getTotalFunding() {
        //calculate total funding to 2 decimal places
        double totalFunding = getMajorFunding() + getMinorFunding();
        totalFunding = (int)(totalFunding*100)/100.0;
        
        return totalFunding;
    }
}





