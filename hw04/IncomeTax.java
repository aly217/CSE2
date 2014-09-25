//Anjela Yates
//9-23-2014
//Income Tax Java Program

//bring in scanner to use
import java.util.Scanner;

    //define class
    public class IncomeTax{
         
         //create main method
         public static void main(String[] args){
             
             Scanner myScanner;
             myScanner=new Scanner(System.in);
             
             //prompt user to inter an int
             System.out.println("Enter an int giving the number of thousands");
             
             //if input is not an int tell user and then end program
             if (!myScanner.hasNextInt()) {
                
                System.out.println("You did not enter an integer");
                
                return;
             }
             
             //if input is an integer,determine what range the income is in and then tax accordingly
             //print statements
             int income= myScanner.nextInt();
             double tax;
             if (income>=0 & income<20) {
                System.out.println("The tax rate on "+income+",000 is 5% and the tax is "+income* .05+".");
             }
             else if (income>=20 & income<40) { 
                 System.out.println("The tax rate on "+income+",000 is 7% and the tax is "+income* .07+".");
             }
             
             else if (income>=40 & income<78) {
                 System.out.println("The tax rate on "+income+",000 is 12% and the tax is "+income* .12+".");
             }
            
             else if (income>=78) {
                 System.out.println("The tax rate on "+income+",000 is 14% and the tax is "+income* .14+".");
             }
             
             else if (income<0){
                 System.out.println("You did not enter a positive int");
             }
             
             
             
         }
    }