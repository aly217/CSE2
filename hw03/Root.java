//Anjela Yates
//hw03c
//Root Java Program

import java.util.Scanner;

   //define a class
    public class Root{
        
        //define a main method
        public static void main(String[] args){
            
            //use scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            System.out.print("Enter a double and I print its cube root:");
            
                double x =myScanner.nextInt();
            
            //have initial guess. use equation to keep guessing until you get a closer value
            double guess;
            guess= x/3;
            guess = (2*guess*guess*guess+x)/(3*guess*guess);
            guess = (2*guess*guess*guess+x)/(3*guess*guess);
            guess = (2*guess*guess*guess+x)/(3*guess*guess);
            
            //print out the value
            System.out.println("The cube root is "+guess+"");
        }
    }