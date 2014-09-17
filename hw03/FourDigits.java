//Anjela Yates
//hw03b
//Four Digits Java Program

import java.util.Scanner;

    public class FourDigits{
        
        public static void main(String[] args){
            
            Scanner myScanner;
            myScanner= new Scanner(System.in);
            
            System.out.print("Enter a double and I'll display the four digits to the right of the decimal point:");
            
            double number= myScanner.nextInt();
            
            int num1;
            int num2;
            int num3;
            
            int num = (int)(Math.random()*1000);
            num1 = num % 10;
            num2 = num / 10 % 10;
            num3 = num / 100 % 10;
            
            System.out.print("num1");
            
            
        }
    }