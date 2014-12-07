import java.util.Scanner;

public class Arrays{  //define class

  public static void main(String [] arg){  //define main method

    Scanner scan=new Scanner(System.in);   //rename scaner to use

    int array[]=new int[10];
    
    System.out.print("Enter 10 ints- ");

      for(int j=0;j<10;j++){

        array[j]=scan.nextInt();

      }
      
      //find the lowest value
      
      int low=array[0];
      
      for(int i=1; i<array.length; i++){
          
          
          if (low>array[i]){
              
              low=array[i];
          }
      }
          
        System.out.println("The lowest value =" +low);  
        
        //find the greatest value
        
        int high = array[0];
        
        for(int i=1; i<array.length; i++){
          
          
          if (high<array[i]){
              
              high=array[i];
          }
      }
          
        System.out.println("The highest value =" +high); 
        
        int sum = array[0] +array[1] +array[2] +array[3] +array[4] +array[5] +array[6] +array[7] + array[8] +array[9];
        
        System.out.println("The sum =" +sum);
        
        System.out.println(array[0]+"     "+array[9]);
        System.out.println(array[1]+"     "+array[8]);
        System.out.println(array[2]+"     "+array[7]);
        System.out.println(array[3]+"     "+array[6]);
        System.out.println(array[4]+"     "+array[5]);
        System.out.println(array[5]+"     "+array[4]);
        System.out.println(array[6]+"     "+array[3]);
        System.out.println(array[7]+"     "+array[2]);
        System.out.println(array[8]+"     "+array[1]);
        System.out.println(array[9]+"     "+array[0]);
        
        
     
  }
}