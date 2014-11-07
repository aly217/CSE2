//Anjela Yates      
//11-3-2014
//


import java.util.Scanner;

public class BlockedAgain{
    
    

    public static void main(String []s){

        int m;

//force user to enter int in range 1-9, inclusive.

        m = getInt(); 

        allBlocks(m);

    }
    
    public static int getInt(){
        
        while (true){
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer between 1-9");
        
        boolean isInt= checkInt(myScanner);
        
            if(isInt){
                int result=checkRange(myScanner);
                    
                    if(result==0){
                        System.out.println("Enter an integer between 1 and 9");
                    }
                    
                    else {
                        return result;
                    }
            }
            
        }  
    }
    
    public static boolean checkInt(Scanner sc){
        
        
        if (sc.hasNextInt()) {
            return true;
        }
        else {
            return false;
        }
        

    }
    
    public static int checkRange(Scanner sc) {
        
        int m= sc.nextInt();
        
        if (m>=1 && m<=9){
            return m;
          
        }
            
        else {
            return 0;
            
        }
    }
     
     public static void allBlocks(int m) {
         
       
         
         for(int i=1; i<=m ; i++){
        
           block(i);
     }   
     }
    
    public static void block(int i) {
        
        for(int j=1; j<=i; j++){
            
           line(i);
        
    }
    }
    
    public static void line(int i) {
        
        for(int k=1; k<= (9-(i*2-1)/2); k++){ //loop for how many of each number row
                    System.out.print(" ");}
                
                for(int k= 1; k<= 2*i-1; k++){
                    
                    System.out.print(i); }
                
        for(int k=1; k<= (9-(i*2-1)/2); k++){ //loop for how many of each number row
                    System.out.print(" ");}
                    
            System.out.println(); }
        
    }
        



