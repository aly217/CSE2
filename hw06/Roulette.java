//Anjela Yates
//10/13/2014
//Roulette java program

//bring in scanner and random number generator to use
import java.util.Scanner;
import java.util.Random;

//define class
public class Roulette{
    
    //define main method
    public static void main(String args[]){
        
        //rename scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //rename random number generator
        Random myRandom;
        myRandom = new Random();
        
        int count = 0;
        int profit = 0;
        int trial = 0;
        int i =0 ;
        
        
        //prompt user for an integer in a given range
        System.out.println("Enter an Integer [1-38]");
        int number = myScanner.nextInt();
        
        //set up loop for 1000 trials
        while(trial<1000){
            i=0; //reset counter
        count=0;
            //loop lasts for 100 trials in one game
            while(100>count) {
            int spin=myRandom.nextInt(38)+1;
            //System.out.println(spin);
                if (number == spin){
                 i++;
                 
                }
            
                count++;
            }
                //display outcome of game
                if (i==0){
                    System.out.println("You never won");
                }
                else if (i<3){
                    System.out.println("You lost your money");
                }
                else if (i>=3){
                    System.out.println("You made a profit!");
                    profit=profit + (36*i);
                    System.out.println(profit);
                }
                
        
        trial++;
        
        }
        System.out.println("The number of times you lost was " +(1000-i));
        System.out.println("The number of times you made profit was " +i);
        System.out.println("Your total winnings is " +profit);
    }
}