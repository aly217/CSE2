//Anjela Yates
//10-1-14
//Boola Boola Java Program

//bring in scanner and random number generator
import java.util.Scanner;
import java.util.Random;

    //define class
    public class BoolaBoola{
        
        //creat main method
        public static void main(String[] args){
            
            //use scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            Random myRandom;
            myRandom = new Random();
            
            //create 3 random true/false statements
            boolean a = myRandom.nextBoolean();
            boolean b = myRandom.nextBoolean();
            boolean c = myRandom.nextBoolean();
            
            //chose one of 4 possible combinations of and & or 
            //compare user's guess to the correct answer
            //print whether user is correct or wrong
            
            int number = myRandom.nextInt(4);
            
            boolean validity;
            
            if(number==0) {
                System.out.println("Is " +a+ " && " +b+ " && " +c+ " true or false (T,t,F,f)");
    
                validity= a&&b&&c;
            }
            else if(number==1) {
                System.out.println("Is " +a+ " && " +b+ " || " +c+ " true or false (T,t,F,f)");
                
                validity= a&&b||c;
            }
            else if(number==2) {
                System.out.println("Is "+a+" || "+b+ " &&" +c+ " true or false (T,t,F,f)");
                
                validity=a||b&&c;
            }
            else {
                System.out.println("Is "+a+"|| "+b+" || "+c+ "true or false (T,t,F,f)");
                
                validity = a||b||c;
            }
            String guess = myScanner.next();
                
                boolean answer;
                
                    if (guess.equals ("T") | guess.equals ("t")) {
                        answer=true;
                        
                    }
                    else{
                        answer=false;
                    }
                    
                    if (answer==validity) {
                        System.out.println("Correct");
                    }
                    else {
                        System.out.println("Wrong, try again");
                    }
            
            
            
            
        }
    }