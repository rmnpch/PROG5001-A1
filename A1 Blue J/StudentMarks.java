/**
 * Student Makrs calculator. This program is capable of determining 
 * the mean and Standard Deviation on the grades
 *
 * @author Ramon Pacheco
 * @version July 2024
 */

import java.util.Scanner;

public class StudentMarks {
    public static void main (String[] args) {
        int numberOfStudents = 5;
        float[] marks = new float[numberOfStudents];
        float sumOfGrades = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give marks for thirty students: \nThe marks should be from 0 to 30");
        
        for(int i=0; i<numberOfStudents; i++) {
            float temp = -10;
            
            //check for valid marks - check if the input mark is between 0 and 30
            while (temp<0||temp>30){
                temp = scanner.nextFloat();
            if (temp < 0 || temp > 30) {
                System.out.println("Invalid marks, please enter a mark between 0 and 30.");
            }
        }
            
            marks[i] = temp;
            sumOfGrades+=marks[i];       
            
        }
        
        System.out.println("Entered marks: ");
        for(int i=0; i<numberOfStudents; i++){
            System.out.print(marks[i]+" ");
        }
        
        
        //Calculate the mean        
        float mean = sumOfGrades / numberOfStudents;
        System.out.println("Mean: " + mean);

        //Calculate variance and standard deviation
        float varianceTotal = 0;

        for (float mark : marks) {
            varianceTotal += Math.pow(mark - mean, 2);
        }
        
        double standardDeviation = Math.sqrt(varianceTotal / numberOfStudents);
        System.out.println("Standard deviation is: "+standardDeviation);
        }
            
}
   
