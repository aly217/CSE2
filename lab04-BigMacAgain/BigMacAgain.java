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
            
            double totalCost=0;
            
            if(myScanner.hasNextInt()){
                
                int nBigMacs = myScanner.nextInt();
                
                
            
                if (nBigMacs> 0){
                    
                    
                    totalCost = BigMac$*nBigMacs;
                    
                    System.out.println("You ordered "+nBigMacs+" at a cost of "+nBigMacs+" x "+BigMac$+" = "+totalCost+".");
                }
                
                else{
                    System.out.println("You did not enter an integer > 0");
                }
                
            
            
        }
        else{
            System.out.println("You did not enter an integer");
        }
        
        System.out.println("Do you want fries(Y/y/N/n) ");
        
        String fries= myScanner.next();
        
        if (fries.equals("Y") ) {
            System.out.println("You ordered fries at $"+ Fries$);
            
            double total= totalCost+Fries$;
            
            System.out.println("Your total order is$"+total);
        }
        
        else if(fries.equals("y")) {
            System.out.println("You ordered fries at $"+ Fries$);
            
            double total=+ totalCost+Fries$;
            
            System.out.println("Your total order is $"+total);
        }
        
        else{
            System.out.println("You ordered no fries");
        }
    }
    }
