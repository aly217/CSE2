//anjela Yates
//pokerodds java code


//////////////////////////////
//i had alot of trubble getting the second part to the code to compile so i just commented out the call of method
/////////////////////////////////

import java.util.Random;  //call in random function

import java.util.Scanner;  //call in scanner to use

public class PokerOdds{   //define class

  public static void main(String [] arg){  //main method

    showHands();  //calls new method

    //simulateOdds();   //calls new method

  }
  
  public static int[] showHands(){  //method that returns the hand array
      
      int test=2;
      
      int[] deck=new int[52];   //create dck array
      
      int[] hand=new int[5];   //create hand array
      
      while (test!=0){  //loop to keep promting user
      
      

      for(int number=0; number<=51; number++){
          deck[number]=number;
      }
      
      Random rand = new Random();  //this part of the cod numbers the deck array from 0-51
      
      for(int i=0; i<hand.length; i++) {
          
          int cardValue= rand.nextInt(52);   //gives each element of the hand array a random number between 0 and 51
          
          int count =1;
          
          while (count!=0){
              count= 0;
              
              cardValue= rand.nextInt(52);
          for(int m=0; m<hand.length; m++){
              
              if (cardValue==hand[m]) {
                  count++;
              }
          }
          
          }
          hand[i] = cardValue;
          deck[cardValue]=-1;
          
          //System.out.print(cardValue);
          
          for(int j=cardValue; j!=deck.length - 1; j++){
              deck[j]=deck[j+1];
              //System.out.print(j);
          }
          
          //System.out.print("loop finished");
      }
      
      
      
      System.out.print ("Clubs:" );   //prints out the cards that are clubs
      for(int k=0; k<hand.length; k++){
      
      if (hand[k]/13 ==0) {
          if(14-hand[k]==14){
          System.out.print("A ");
      }
      
      else if (14-hand[k]==13){
          System.out.print("K ");
      }
      
      else if (14-hand[k]==12){
          System.out.print("Q ");
      }
      
      else if (14-hand[k]==11){
          System.out.print("J ");
      }
      
      else{
          System.out.print(14-hand[k]+" ");
      }
      }
      }
      System.out.println(" ");
      
      
      
      System.out.print ("Diamonds:" );  //prints out the cards that are diamonds
      for(int k=0; k<hand.length; k++){
      
      if (hand[k]/13 ==1) {
          if(27-hand[k]==14){
          System.out.print("A ");
      }
      
      else if (27-hand[k]==13){
          System.out.print("K ");
      }
      
      else if (27-hand[k]==12){
          System.out.print("Q ");
      }
      
      else if (27-hand[k]==11){
          System.out.print("J ");
      }
      
      else{
          System.out.print(27-hand[k]+" ");
      }
      }
      }
      System.out.println(" ");
      
      
      
      System.out.print ("Hearts:" );   //prints out the cards that are hearts
      for(int k=0; k<hand.length; k++){
      
      if (hand[k]/13 ==2) {
          if(40-hand[k]==14){
          System.out.print("A ");
      }
      
      else if (40-hand[k]==13){
          System.out.print("K ");
      }
      
      else if (40-hand[k]==12){
          System.out.print("Q ");
      }
      
      else if (40-hand[k]==11){
          System.out.print("J ");
      }
      
      else{
          System.out.print(40-hand[k]+" ");
      }
      }
      }
      System.out.println(" ");
      
      
      
      System.out.print ("Spades:" );    //prints out the cards that are spades
      for(int k=0; k<hand.length; k++){
      
      if (hand[k]/13 ==3) {
          if(53-hand[k]==14){
          System.out.print("A ");
      }
      
      else if (53-hand[k]==13){
          System.out.print("K ");
      }
      
      else if (53-hand[k]==12){
          System.out.print("Q ");
      }
      
      else if (53-hand[k]==11){
          System.out.print("J ");
      }
      
      else{
          System.out.print(53-hand[k]+" ");
      }
      }
      }
      System.out.println(" ");
      
      
      System.out.print ("Go again?");
      
      Scanner scan=new Scanner(System.in);
      
      String accept = scan.next();
      
      if(accept.equals("y")) {
          test=1;
      }
      else if(accept.equals("Y")) {
          test=1;
      }
      else{
          test=0;
      }
      
      
      } 
      return hand;
  }
  
  
  
  public static void simulateOdds(int[] hand){  //main method that generates 10000 hands of 5 cards
    
    for(int counter=0; counter<10000; counter++){
      
      int thisHand[]= new int[13];
      
      int total =findDuplicates(hand);
      
      System.out.println(total);
      
      }
  }


public static int findDuplicates(int[] hand){  //method that finds how many times there is a duplicate
    
    int count=0;
    int total=0;
    
    for(int i=0; i<hand.length; i++) {
      
      for (int j=i+1; j<hand.length; j++){
        
        
        if(hand[i]==hand[j]){
           count ++;
        }
      }
    }
    if(count==1){
      total++;
        }
        
    return total;
  }

}

