import java.util.Scanner;
import java.util.Arrays;

/**
 * PROG5001 Assignment 1
 * @author (Muhammad Kashif - Student ID: 23598588)
 * @version (Final version)
 */

public class StudentMarks
{ 
    public static void main(String[] args){
        //Getting Unit name and Total number of students from user.
        System.out.println("Please Enter the UNIT Name: ");
        String unitName = (new Scanner(System.in)).next();
        System.out.println("Please Enter the total number of students in the unit: ");
        int studentCount = (new Scanner(System.in)).nextInt();
        //declaring variables and array
        double[] marks = new double[studentCount];
        int rollNumber = 1;
        //intializing while loop variable
        int i = 0;
            //Loop to get all students numbers from the user.
            while(i< studentCount){
                
             System.out.println("Please Enter the student marks of having roll number: "+rollNumber);
             double getMark = (new Scanner(System.in)).nextDouble();
                //condition to accept only valid marks between 0 - 100. 
                if((getMark <0 ) || (getMark >100)){
                    System.out.println("Invalid marks please re-enter marks between 0 and 100");
                }
                else{
                    //storing marks in array.
                    marks[i] = getMark;
                    i = i+1;
                    rollNumber = rollNumber+1;
                }
            }
        
        //re-intializing the roll number for printing the marks.    
        rollNumber = 1;    
        System.out.println(" ");
        //printing unit name.
        System.out.println("Students marks for Unit '"+unitName+"' are given below: ");
        System.out.println(" ");
        
        //printing the marks of students using loop.
            for(int j=0;j<studentCount;j++){
                
                System.out.println("Marks of student having roll number "+(rollNumber)+" are: "+marks[j]);
                rollNumber = rollNumber+1;
            }
        
        //Calling the function to get highest marks.
        double maxMarks = GetMaxMarks(marks);
        System.out.println(" ");
        System.out.println("Highest marks obtained in this unit are: "+ maxMarks);
        
        //Calling the function to get lowest marks. 
        double minMarks = GetMinMarks(marks);
        System.out.println(" ");
        System.out.println("Lowest marks obtained in this unit are: "+ minMarks);
        
        //declaring and intializing variables to calculate the mean and standard deviation of the marks.
        double meanValue =0;
        double sum = 0;
        double sum2 = 0;
        double dev = 0;
        //calculating mean value of marks.
            for(int f=0;f<marks.length;f++){
                sum = sum+marks[f];
            }
        meanValue = sum/marks.length;
        
        //calculating standard deviation.
            for(int n=0;n<marks.length;n++){
                sum2 = sum2 + Math.pow(marks[n] - meanValue, 2);
            }
        dev = Math.sqrt(sum2/(marks.length-1));
        //printing the mean and standard deviation of the marks.
        System.out.println(" ");
        System.out.println("mean of the marks is: "+ meanValue + " and standard deviation is: "+dev);
    }
    
    //function to find highest marks
    public static double GetMaxMarks(double[] marksReceived){
        double maxValue = marksReceived[0];
        for(int k=0;k<marksReceived.length;k++){
            if(marksReceived[k]>maxValue){
                maxValue = marksReceived[k];
            }
        }
        return maxValue;
    }
    
    //function to find lowest marks.
    public static double GetMinMarks(double[] marksReceived){
        double minValue = marksReceived[0];
        for(int k=0;k<marksReceived.length;k++){
            if(marksReceived[k]<minValue){
                minValue = marksReceived[k];
            }
        }
        return minValue;
    }
}

