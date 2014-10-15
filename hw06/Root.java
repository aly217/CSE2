//Anjela Yates
//10-14-2014
//Root java program

//pring in scanner to use
import java.util.Scanner;

//define class
public class Root{
    
    //define main method
    public static void main(String args[]){
        
        //rename scanner so you can use it
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        //prompt user for a double
        System.out.println("Enter a double > 0");
        double number = myScanner.nextDouble();
        
        
        double high = number +1;
        double low = 0;
        double middle = (high+low)/2;
        
        //compare user input to guess
        //check to see if guess is closer to the high or low in range
        //loop lasts until it is as accurate as possible
        while (Math.abs((middle*middle)-number)>.0000001){
            
            if ((middle*middle)> number){
                high = middle;
            }
            else if ((middle*middle)<number){
                low = middle;
                
            }
            middle = (high+low)/2;
            
        }
        
        //print out the answer
            System.out.println("Your number is "+middle);
    
    }
}