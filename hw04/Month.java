//Anjela Yates
//9-23-2014
// Month Java Program

//bring in scanner to use
import java.util.Scanner;

    //define class
    public class Month{
        
        //create main method
        public static void main(String[] args){
            
            //prompt user to enter an integer from 1-12
            //integer corresponds to a month
            //if any other month except february, print how many days are in the month
            //if february, ask user for a year
            //determine if the year id a leap year or not
            //print how many years there are in the month
            Scanner myScanner;
            myScanner=new Scanner (System.in);
            
            System.out.print("Enter an int giving the number of a month (1-12)");
            
            int number= myScanner.nextInt();
            
            if(number==1){
                System.out.println("The month has 31 days");
            }
                
            else if (number == 2){
                
                System.out.println("Enter the year");
                
                int year = myScanner.nextInt(20);
                
                if (year % 4 ==0){
                    System.out.println("The month has 29 days");
                }
                
                else {
                    System.out.println("THe month has 28 days");
                    
                }
                
            }
            
            else if (number==3){
                System.out.println("The month has 31 days");
            }
            
            else if (number == 4){
                System.out.println("The month has 30 days");
            }
            
            else if (number == 5){
                System.out.println("The month has 31 days");
            }
            
            else if (number ==6){
                System.out.println("The month has 30 days");
            }
            
            else if (number ==7){
                System.out.println("The month has 31 days");
            }
            
            else if (number==8){
                System.out.println("The month has 31 days");
            }
            
            else if (number == 9){
                System.out.println("The month has 30 days");
            }
            
            else if (number ==10){
                System.out.println("THe month has 31 days");
            }
            
            else if (number ==11){
                System.out.println("The month has 30 days");
            }
            
            else if (number ==12){
                System.out.println("The month has 31 days");
            }
            
            else {
                System.out.println("You did not enter an int between 1 and 12");
            }
            
            
            
        }   
    }