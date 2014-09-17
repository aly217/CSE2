//Anjela Yates
//hw03b
//Four Digits Java Program

import java.util.Scanner;

    
    //define class
    public class FourDigits{
        
        //define main method
        public static void main(String[] args){
            
            //use scanner
            Scanner myScanner;
            myScanner= new Scanner(System.in);
            
            //promt user for input
            System.out.print("Enter a double and I'll display the four digits to the right of the decimal point:");
            
            double number= myScanner.nextDouble();
            
            number = number* 10000;
            number = (int)(number);
            
            int numberX;
            numberX =(int) number % 10000;
            
            //print out only 4 digits after decimal
            System.out.println("The four digits are "+numberX+"");
            
            
           
            
        }
    }