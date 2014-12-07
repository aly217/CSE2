//Anjela Yates
//10-24-2014
//Methods java program

import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter three ints");
    a=getInt(scan);
    b=getInt(scan);
    c=getInt(scan);

    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
    System.out.println("The larger of "+a+", "+b+", and "+c+ " is "+larger(a,larger(b,c)));
                       
    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+ ", and "+c+" are in ascending order");
                       
  }
  
  public static int getInt(Scanner scan) {
    
    while(true){
      System.out.println("Enter an int");
    
      if(scan.hasNextInt()){
       int value = scan.nextInt();
        return value;
      }
      
      else{
        System.out.println("You did not enter an int");
        scan.next();
      }
    
    }
  }
  
  
  public static int larger(int a, int b) {
    if(a>b){
      return a;
      
    }
      
      else{
        return b;
      }
    }
    
  public static boolean ascending(int a, int b, int c){
    
    if(a<b && b<c){
      return true;
    }
    
    else{
      return false;
    }
  }
  
  
}
  