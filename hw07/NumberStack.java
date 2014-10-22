//Anjela Yates
//10-20-14
//Number Stack Java program


//import scanner to use
import java.util.Scanner;

//define class
public class NumberStack{
    
    //define main method
    public static void main(String args []){
        
        //rename scanner
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
        
        //prompt user to enter an integer
        System.out.println("Enter an integer between 1-9");
        
        int number = myScanner.nextInt();
        
        //assignment using for loop
        for(int i=0; i<number ; i++){ //loop for what number is in each row
            
            for(int j=0; j<i+1; j++){ //loop for how many numbers are in each row
                
                for(int k=0; k< number-(i+1); k++){ //loop for how many of each number row
                    System.out.print(" ");}
                
                for(int k= 0; k< 2*i+1; k++){
                    
                    System.out.print(i+1); }
                
                    
            System.out.println(); }
            
            for(int d=0; d< number-(i+1); d++) {
                System.out.print(" "); 
            }
            
            for(int d=0; d<2*i+1; d++){
                System.out.print("-");}
                
                System.out.println();
            
            
                }
                
                
                //assignment using while loop
                int i=0;
                int j=0;
                int k=0; 
                
                while (i < number) {  //loop for the number in the section
                    
                    while (j < (i+1)) {  //loop for how many rows are in each section
                        
                        while(k< number-(i+1)){  //loop for how many numbers are in each row
                            
                            k++;
                            System.out.print(" ");
                            
                        }
                        k=0;
                        
                        while (k< (2*i +1)) {
                            
                            k++;
                            System.out.print(i+1); 
                            
                        }
                            
                        j++;
                        k=0;
                        System.out.println(" "); 
                        
                    }
                        
                    
                    j=0;
                    
                    while (k<number-(i+1)) {
                        System.out.print(" ");
                        k++;
                        
                    }
                    k=0;
                    
                    while (k<2*i+1) {
                        
                        System.out.print("-");
                        k++;
                    
                    }
                    k=0;
                    
                    i++;
                    System.out.println();
                }
                //assignment using do-while loop
                i=0;
                j=0;
                k=0;
                do{
                    do{
                        
                        do{
                            if(i!=number-1){
                            System.out.print(" ");
                            k++;}
                        }while(k<number-(1+i));
                        k=0;
                        do{
                            System.out.print(i+1);
                            k++;
                        }while (k<2*i+1);
                        k=0;
                    System.out.println();
                    j++;
                    }while (j<i+1);
                    j=0;
                    
                    do{
                        if(i!=number-1){
                        System.out.print(" ");
                        k++;}
                    }while (k<number-(i+1));
                    k=0;
                    
                    do{
                        System.out.print("-");
                        k++;
                    }while (k<2*i+1);
                    k=0;
                    
                    i++;
                    System.out.println();
                }while (i<number);
        
    }
    
}
                
            
        

