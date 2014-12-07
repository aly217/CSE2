//Java hw11
//Anjela Yates

import java.util.Scanner;
import java.util.Random;

public class MatrixSorter{
    
    Scanner myScanner= new Scanner(System.in);
    
     Random rand = new Random();

  public static void main(String arg[]){

    int mat3d[][][];

    mat3d=buildMat3d();

    show(mat3d);

    System.out.println("The smallest entry in the 3D matrix is "+

              findMin(mat3d));

    System.out.println("After sorting the 3rd matrix we get");

    sort(mat3d[2]);

    show(mat3d);

   }



public static void buildMat3d(int mat3d[][][]){
    for(int s=0; s<3; s++){
        
        for(int i=0; i<2+3*s; i++){
            
            for(int j=0; j<s+j+1; j++){
                
                mat3d[s][i][j]= rand.nextInt(98)+1;
            }
        }
    }
}



public static void show(int mat3d[][][]){
     
     for(int s=0; s<3; s++){
        
        for(int i=0; i<2+3*s; i++){
            
            for(int j=0; j<s+j+1; j++){
                
                System.out.print(mat3d[s][i][j]);
            }
        }
    }
}


public static int findMin(int mat3d[][][]){
    
    int low;
    
    for(int s=0; s<3; s++){
        
        for(int i=0; i<2+3*s; i++){
            
            for(int j=0; j<s+j+1; j++){
                
                 low=mat3d[0];
          
                 if (low>mat3d[j]){
              
                    low=mat3d[s][i][j];
                }
            }
            return low;
          
        }
    }
}


public static void sort(int mat3d[]){
    int currentMin;
    int currentMinIndex;
    int i;
    int j;
    for(i=0; i<mat3d.length; i++){
      
      currentMin = mat3d[i][0];
      currentMinIndex= i;
    
    
    for(j=i+1; j<mat3d[i].length-1; j++){
      if(currentMin>mat3d[i][j]){
        currentMin= mat3d[i][j];
        currentMinIndex= j;
      }
    }
    
    if (currentMinIndex!=j){
      mat3d[i][currentMinIndex]= mat3d[i][j];
      mat3d[i][j]= currentMin;
    }
    }
}


}


