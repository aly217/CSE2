//Anjela Yates
//10-27-2014
//HW8 java program

///for some reason I could not get the third section to compile
///I also had an issue with the second part recognizing the correct values (YyNn)
import java.util.Scanner;

public class HW8{

  public static void main(String []arg){

    char input;

    Scanner scan=new Scanner(System.in);

    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");

    input=getInput(scan,"Cc");

    System.out.println("You entered '"+input+"'");

    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");

    input=getInput(scan,"yYnN",5); //give up after 5 attempts

    if(input!=' '){

      System.out.println("You entered '"+input+"'");

    }

    //input=getInput(scan,"Choose a digit.","0123456789");

    //System.out.println("You entered '"+input+"'");

  
  }
  public static char getInput(Scanner myscanner,String S){
      String input = myscanner.next();
      
      int j=0;
      while (S.charAt(j)!= input.charAt(0)){
          
          if(input.length() == 1){
      
            int i=0;
            while (i<S.length()){
                
          
                if (input.charAt(0)== S.charAt(i)){
                    return input.charAt(0);
                    
              
                }     
          
                else{
                    System.out.println("Not a valid input.  Try again!");
                    input = myscanner.next();
                    
              
                }
            i++;
            }
            
          }
            else{
                System.out.println ("Input not valid. Try again!");
                input = myscanner.next();
            }
  

    }
        return input.charAt(0);
}

    public static char getInput(Scanner myscanner,String S, int number){
      String input = myscanner.next();
      
      int i=0;
      while (i<4){
          
          
           if(input.length() == 1){
      
         i=0;
            while (i<S.length()){
                
          
                if (input.charAt(0)== S.charAt(i)){
                    return input.charAt(0);
                    
              
                }     
          
                else{
                    System.out.println("Not a valid input.  Try again!");
                    input = myscanner.next();
                    
              
                }
            i++;
            }
            
          }
      
      else{
                System.out.println ("You failed 5 times!");
                input = myscanner.next();
            }
        
      }
      return ' ';
}
//public static int getInput(Scanner myscanner,int S){
      //String input = myscanner.next();
      
      //int j=0;
  //    while (S.charAt(j)!= input.charAt(0)){
          
    //      if(input.length() == 1){
      
      //      int i=0;
        //    while (i<S.length()){
                
          
          //      if (input.charAt(0)== S.charAt(i)){
            //        return input.charAt(0);
                    
              
              //  }     
          
                //else{
                  //  System.out.println("Not a valid input.  Try again!");
                    //input = myscanner.next();
                    
              
                //}
          //  i++;
            //}
            
        //  }
          //  else{
            //    System.out.println ("Input not valid. Try again!");
              //  input = myscanner.next();
        //    }
  

  //  }
    //    return input.charAt(0);
//}
}


