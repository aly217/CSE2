
/*Sample of expected output:

 *   Enter an int- 9

 *   You entered 9

 *   sum is 25

 *   Again, you entered 9

 */


import java.util.Scanner;

public class Enigma0{

  public static void main(String arg []){

    System.out.print("Enter an int- ");

    Scanner scan=new Scanner(System.in);
    
    int n;

    if(scan.hasNextInt()){

     n=scan.nextInt();

      System.out.println("You entered "+n);

    }

    else{

      n=4;

      System.out.println("You entered "+n);

    }

    

    int k=4,p=6,q=7,r=8;

    switch(k+p+q+r){

      case 24: 

      case 25: System.out.println("sum is 25");

      default:

        System.out.println("To repeat, you entered "+n);

    }

  }

}


/* Error report:

  in the main method the int n was declared inside the if statement causeing it not to be recognized or able to be used later in the code
  to fix the problem, just move the int n right outside the if statement

 *   Expand this comment:

 *   Explain the error(s) that occurred here, and then fix them

 */

