//Anjela Yates
//hw03c
//Root Java Program

import java.util.Scanner;

    public class Root{
        
        public static void main(String[] args){
            
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            System.out.print("Enter a double and I print its cube root:");
            
                double x =myScanner.nextInt();
            
            double guess;
            guess= x/3;
            
            System.out.println("The cube root is "+(2*guess*guess*guess+x)/(3*guess*guess)+"");
        }
    }