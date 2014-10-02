//Anjela Yates
//9-19-2014
//Big Mac Agian Java Program

//bring in scanner to use
import java.util.Scanner;

    //define class
    public class BigMacAgain{
        
        //create main method
        public static void main(String[] args){
            
            //define variables
            double BigMac$;
            BigMac$=2.22;
            
            double Fries$;
            Fries$=2.15;
            
            //use scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            //prompt user for number of Big Macs and save that number in scanner
            System.out.print("Enter the number of Big Macs");
            
            
            if(myScanner.hasNextInt()){
                
                int nBigMacs = myScanner.nextInt();
            
                if (nBigMacs=> 0){
                    
                    double totalCost;
                    
                    totalCost = BigMac$*nBigMacs;
                    
                    System.out.print("You ordered "+nBigMacs+" at a cost of "+nBigMacs*BigMac$+" = "+totalCost+".");
                
                
                else{
                    System.out.print("You did not enter an integer > 0");
                }
            
            else{
                System.out.print("You did not enter an integer");
            }
                }
            
            
        }
    }
