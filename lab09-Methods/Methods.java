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

    System.out.println("The larger of "+a+" and "+b+" is "+ methods.Larger(a,b));
    System.out.println("The larger of "+a+", "+b+", and "+c+ " is "+methods.Larger(a,Larger(b,c)));
                       
    System.out.println("It is "+methods.Ascending(a,b,c)+" that "+a+", "+b+ ", and "+c+" are in ascending order");
                       
  }
}
  