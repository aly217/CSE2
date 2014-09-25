//Anjela Yates
//Course Number Java program

//bring in scanner to use
import java.util.Scanner;

    //define class
    public class CourseNumber{
        
        //create a main method
        public static void main(String[] args){
            
            //prompt user to enter a 6 digit course number
            Scanner myScanner;
            myScanner=new Scanner(System.in);
             
             System.out.print("Enter a six digit number giving the course and semester");
             
             int number = myScanner.nextInt();
             
             //determine if the year is in the range
             if (number<=186510 | number>=201440){
                 System.out.print("The number is out side the range [186510 - 201440]");
             }
             
             //determine if the last two digits represent a semester
             else if (!(number % 100 ==10 |number %100 == 20 | number % 100 == 30 | number %100 == 40)){
                 System.out.println("Not a legitimate semester");
             }
             
             //if in range print the year and the semester
             else if (number % 100 == 10){
                 
                 System.out.println("The course was offered in the Spring of "+number/100+".");
             }
             
             else if (number % 100 == 20){
                 System.out.println("The course was offered in Summer 1 of "+number/100+".");
             }
             
             else if (number % 100 == 30){
                 System.out.println("The course was offered in Summer 2 of "+number/100+".");
             }
             
             else if (number % 100 ==40){
                 System.out.println("The course was offered in Fall of "+number/100+".");
             }
        }
    }
    
    
    
    