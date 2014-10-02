//Anjela Yates
//10-1-14
//Burger King Java Program

//bring in scanner to use
import java.util.Scanner;

    //define class
    public class BurgerKing{
        
        //create main method
        public static void main(String[] args){
            
            //use scanner and ask user for input
            Scanner myscanner;
            myscanner = new Scanner(System.in);
            
            System.out.println("Enter a letter to indicate a choice of \n Burger (B or b) \n Soda (S or s) \n Fries (F or f)");
            
            String order = myscanner.next();
            
            if (order.length()==1){
            
            //use switch statements to ask questions about Burger King order and than print the correct statements
            switch(order.charAt(0)) {
                
                //case if burger is selected
                case 'B':
                case 'b':
                    
                    System.out.println(" Enter A for all the fixens \n C or c for cheese \n N or n for no cheese");
                    
                    String burger = myscanner.next();
                    
                        if (burger.length()==1) {
                            
                        switch(burger.charAt(0)) {
                            
                            case 'A':
                            case 'a':
                                System.out.println("You ordered a burger with all the fixens");
                                break;
                                
                            case 'C':
                            case 'c':
                                System.out.println("You ordered a burger with cheese");
                                break;
                            
                            case 'N':
                            case 'n':
                                System.out.println("You ordered a burger with no cheese");
                                break;
                                
                            default:
                                System.out.println("You did not enter A,a,C,c,N,or n");
                                break;
                                
                
                        }
                    
                        }
                        else {
                            System.out.println("Invalid Entry");
                        }
                        break;                
            
                //case if soda is selected
                case 'S': 
                case 's':
                    System.out.println("Enter P or p for pepsi \n C or c for Coke \n S or s for Sprite \n M or m for Mountain Dew");
                    
                    String soda = myscanner.next();
                    
                    if (soda.length()==1) {
                    
                    switch(soda.charAt(0)){
                        case 'P':
                        case 'p':
                                
                            System.out.print("You orderd Pepsi");
                            break;
                        
                        case 'C':
                        case 'c':
                            System.out.println("You ordered Coke");
                            break;
                            
                        case 'S':
                        case 's':
                            System.out.println("You ordered Sprite");
                            break;
                            
                        case 'M':
                        case 'm':
                            System.out.println("You ordered Mountain Dew");
                            break;
                            
                        default:
                            System.out.println("You did not enter P,p,C,c,S,s,M,or m");
                            break;
                    }
                            
                    }
                    else {
                        System.out.println("Invalid Entry");
                    }
                    break;
                
                //case if fries are selected
                case 'F': 
                case 'f':
                    System.out.println("Do you want a large or small? (L, l, S, s)");
                    
                    String fries = myscanner.next();
                    
                    if (fries.length()==1) {
                    
                    switch(fries.charAt(0)){
                        
                        case 'L':
                        case 'l':
                            System.out.println("You ordered large Fries");
                            break;
                            
                        case 'S':
                        case 's':
                            System.out.println("You ordered small fries");
                            break;
                    
                    
                
                 default:
                     System.out.println("You did not enter B, b, S, s, F, or f");
                    }
                    }
                    else {
                        System.out.println("Invalid Entry");
                    }
            }
        }
        //rejects other inputs outside of B,S, or F
        else{
            System.out.println("Invalid entry");
        }
        }
    }