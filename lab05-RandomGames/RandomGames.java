//Anjela Yates
//09-26-14
//Random Games Java Program

import java.util.Scanner;
import java.util.Random;

    public class RandomGames{
        
        public static void main(String[] args){
            
            Scanner myScanner;
            myScanner= new Scanner(System.in);
            
            System.out.println("Enter R or r for roulette, C or c for craps, P or p for pick a card");
            
            String gameString = myScanner.next();
            
            
            Random rand = new Random();
            
            switch (gameString){
                
                case "R": gameString= "R"; 
                
                    int roulette=rand.nextInt(37);
                    
                    if (roulette==37){
                        System.out.println("Roulette:00");
                    }
                    else{
                    
                    System.out.println("Roulette:"+roulette);
                    }
                
                    break;
                    
                case "r": gameString= "r";
                
                     roulette=rand.nextInt(37);
                    
                    if (roulette==37){
                        System.out.println("Roulette:00");
                    }
                    else{
                    
                    System.out.println("Roulette:"+roulette);
                    }
                
                    break;
                    
                case "C": gameString= "C";
                
                    System.out.println("Game not implemented yet");
                
                    break;
                    
                case "c": gameString= "c";
                
                     System.out.println("Game not implemented yet");
                    break;
                    
                case "P": gameString= "P";
                
                     System.out.println("Game not implemented yet");
                    break;
                    
                case "p": gameString= "p";
                
                     System.out.println("Game not implemented yet");
                    break;
                    
                    
            }
        }
    }