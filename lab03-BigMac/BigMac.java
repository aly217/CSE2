//Anjela Yates
//09-12-2014
//BigMac Java Program

import java.util.Scanner;

    //define class
    public class BigMac{
        
        //add main method
        public static void main(String[] args){
            
            //input variables and data
            Scanner myScanner;
            myScanner = new Scanner(System.in);
           
            
            System.out.print("Enter the number of Big Macs(as integer):");
                
                int nBigMacs= myScanner.nextInt();
            
            System.out.print("Enter the price of a Big Mac:");
                
                double BigMacs$= myScanner.nextDouble();
                
            System.out.print("Enter the percent tax as a whole number(xx):");
            
                double taxRate = myScanner.nextDouble();
            
            taxRate/=100;
            
            double cost$;
            int dollars,
                dimes,
                pennies;
                
            cost$ = nBigMacs*BigMacs$*(1+taxRate);
            dollars=(int) cost$;
            dimes= (int)(cost$*10)%10;
            pennies=(int)(cost$*100)%10;
            System.out.println("The total cost of " +nBigMacs+ " Big Macs, at $" +BigMacs$+ "per Big Mac, " 
            +" with a sales tax of" +(int)(taxRate*100)+" %, is $" +dollars+'.'+dimes+pennies);
        }
        
    }