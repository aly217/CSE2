//Anjela Yates
//find duplicates java program

//call scanner to use
import java.util.Scanner;

public class FindDuplicates{  //define class

  public static void main(String [] arg){  //define main method

    Scanner scan=new Scanner(System.in);   //rename scaner to use

    int num[]=new int[10];

    String answer="";

    do{

      System.out.print("Enter 10 ints- ");

      for(int j=0;j<10;j++){

        num[j]=scan.nextInt();

      }

      String out="The array ";

      out+=listArray(num); //return a string of the form "{2, 3, -9}"   

      if(hasDups(num)){

        out+="has ";

      }

      else{

        out+="does not have ";

      }

      out+="duplicates.";

      System.out.println(out);

      out="The array ";

      out+=listArray(num);    

      if(exactlyOneDup(num)){

        out+="has ";

      }

      else{

        out+="does not have ";

      }

      out+="exactly one duplicate.";

      System.out.println(out);

System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");

      answer=scan.next();

    }while(answer.equals("Y") || answer.equals("y"));

  }


  public static String listArray(int num[]){

    String out="{";

    for(int j=0;j<num.length;j++){

      if(j>0){

        out+=", ";

      }

      out+=num[j];

    }

    out+="} ";

    return out;

  }
  
  public static boolean hasDups(int array[] ) {  //method that checks to see if there is a duplicate
    
    for(int i=0; i<array.length; i++) {  //compares the first place with the rest of the eleent until therer is a match
      
      for (int j=i+1; j<array.length; j++){
        
        if(array[i]==array[j]){
          return true;       //if the loop finds a match it returns true and the main method prints out that there are duplicates
        }
      }
    }
          return false;    //if the loop does not find a match it returns false and the main method prints out that there are no duplicates
  }
  
  public static boolean exactlyOneDup(int array[]){  //method that checks to see if there is exactly one duplicate
    
    int count=0;
    
    for(int i=0; i<array.length; i++) {
      
      for (int j=i+1; j<array.length; j++){
        
        
        if(array[i]==array[j]){
           count ++;        //counter cound how many duplicates there are in the array
        }
      }
    }
    if(count==1){
        return true;}  //if the count = 1 there is exactly one duplicate and the main method prints out that there is only one duplicate
        
        
      return false;    //if the count != 1 there are more than one duplicate and the main method prints out that there is not only one duplicate
  }
  
}
