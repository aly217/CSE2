//Anjela Yates
//10-10-2014
//Loop the Loop java program

import java.util.Scanner;

public class LoopTheLoop{
    
    public static void main(String[] args){
        
        int nStars = 10;
        int i = 0;
        
        while(i<nStars){
            System.out.print("*");
            i++;
            
        }
        
        System.out.println();
        for(int j=1; j<11; j++){
            
            for(int k=1; k<j+1; k++){
                
                System.out.print("*");
            }
            System.out.println();
        }
       
       Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.println("Enter a value between 1 and 15");
            
            int userValue= myScanner.nextInt();
            
            
        
        System.out.println();
            
            if(userValue>0 && userValue<16){
                
                while( i<userValue+1){
            System.out.print("*");
            i++;
            
        }
                
                for(int j=1; j<userValue+1; j++){
            
            for(int k=1; k<j+1; k++){
                
                System.out.print("*");
            }
            System.out.println();
        }
                
            }
            
            else{
                System.out.println("You did not enter a number in the range");
            }
    }
}