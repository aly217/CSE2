
/* Insert System.out.println() statements in the code

 * below, displaying the status of n and k, which 

 * should help you identify when n  or k becomes 0 and causes

 * the program to crash

 */


import java.util.Scanner;

public class Enigma3{

  public static void main(String [] arg){

    int n=40,k=60;

    String out="";

    switch(k%14){

      case 12: 

      case 13: out+=13;

         break;

      default: out+=40;

          n/=3;

          k-=7;
          
          System.out.println(n+ " "+ k);

    }

    if(n*k%12< 12){

      n-=20;

      out+=n;

    }

    if(n*n>k){

      n=42;

      out+=n+k;

    }

    else {

      n=45;

      out+=n+k;

    }

    switch(n+k){

      case 114: 

        n-=11;

        k-=3;
        
         System.out.println(n +" "+ k);

        break;

      case 97:

        n-=14;

        k-=2;

        System.out.println(n +" " +k);
        break;
        
         

      case 98:

        n/=5;

        k/=9;
        
         System.out.println(n+ " "+ k);

      default:

        n-=3;

        k-=5;
        
         System.out.println(n +" " +k);

    }

     //out+=1/n + 1/k;   

    //System.out.println(out);

  }

}


/*

 * Error report:

 * 

 * The error occurs on line 100. int is equal to 0 at this point and then later when the code tries to print out "out" i/k causes the program to crash

 * 

 * 

 */

