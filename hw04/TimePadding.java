//Anjela Yates
// Time Padding Java Program

//bring in scanner to use
import java.util.Scanner;

    //define class
    public class TimePadding{
        
        //create main method
        public static void main(String[] args){
            
            //prompt user to enter and int time in seconds
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            System.out.println("Enter the time in seconds");
            
            int seconds = myScanner.nextInt();
            
            //convert seconds to comventional form
            int hour;
             hour = seconds/3600;
             
            int minutes;
            minutes = (seconds-(hour*3600))/60;
            
            seconds = seconds-(hour*3600)-(minutes*60);
             
             //this notation makes it two places in each section
             System.out.printf("%02d:%02d:%02d", hour,minutes,seconds);
             
        }
    }