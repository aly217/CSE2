//Anjela Yates
//Sorting java program


import java.util.Random;

public class Sorting{  //define class

  public static void main(String [] arg){//define main method
  
  Random rand = new Random();
  
  int [][] dArray=new int [5][];
  
  for(int j=0; j<5; j++){
      int k= j*3+5;
      dArray[j]=new int [k];
      
      for(int i=0; i<k; i++){
          dArray[j][i]=rand.nextInt(39);
      }
  }
  
  for(int j=0; j<dArray.length; j++){
      
      for(int i=0; i<dArray[j].length; i++){
          
          System.out.print(dArray[j][i]+ " ");
      }
      
      System.out.println();
  }
  
  SelectionSort(dArray);
  
  for(int j=0; j<dArray.length; j++){
      
      for(int i=0; i<dArray[j].length; i++){
          
          System.out.print(dArray[j][i]+ " ");
      }
      
      System.out.println();
  }
  
  }
  
  public static void SelectionSort(int[][] dArray){
    int currentMin;
    int currentMinIndex;
    int i;
    int j;
    for(i=0; i<dArray.length; i++){
      
      currentMin = dArray[i][0];
      currentMinIndex= i;
    
    
    for(j=i+1; j<dArray[i].length-1; j++){
      if(currentMin>dArray[i][j]){
        currentMin= dArray[i][j];
        currentMinIndex= j;
      }
    }
    
    if (currentMinIndex!=j){
      dArray[i][currentMinIndex]= dArray[i][j];
      dArray[i][j]= currentMin;
    }
    }
      }
    
}