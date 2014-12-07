//Anjela Yates
//java hw 11
//PokerHands code

//bring in scanner to use
import java.util.Scanner;

    //define class
    public class PokerHands{
        
        //create main method
        public static void main(String[] args){
            
            //use scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            System.out.println("Enter y or Y to enter a(nother) hand");
            String response= myScanner.next();
            
            if(response.equals("y")||response.equals("Y")){
                
             
             
             int select;
             
             String[] diamond= new String[5];
             String[] club= new String[5];
             String[] hearts= new String[5];
             String[] spades= new String[5];
             
             for(select=0; select<5; select++) {
                 
                 System.out.println("Enter the suit");
             
             String suit=myScanner.next();
             
             String card="";
             
             
                
             switch(suit){
                 
                 case "d":
                     
                     System.out.println("Enter one of 'k' 'q' 'j' '10' ... '2'");
                     //card =myScanner.next();
                     diamond[select]=myScanner.next();
                    // String diamond[select]=card;
                    
                     break;
                     
                 case "c":
                     
                     System.out.println("Enter one of 'k' 'q' 'j' '10' ... '2'");
                     //card =myScanner.next();
                     club[select]=myScanner.next();
                     //String[select] club=card;
                     
                     break;
                     
                 case "h":
                     
                     System.out.println("Enter one of 'k' 'q' 'j' '10' ... '2'");
                     //card =myScanner.next();
                    hearts[select]=myScanner.next();
                     //String[select] hearts=card;
                     
                     break; 
                     
                 case "s":
                     
                     System.out.println("Enter one of 'k' 'q' 'j' '10' ... '2'");
                     //card =myScanner.next();
                     spades[select]=myScanner.next();
                     //String[select] spades=card;
                     
                     break;
                     
                 default:
                 
                     System.out.println("You did not enter a suit");
             }
             
            }
           
           System.out.println("Diamonds:"+ diamond);
           System.out.println("Spades:"+ spades);
           System.out.println("Hearts:"+ hearts);
           System.out.println("Clubs:"+ club);
        }
    }
    }
            