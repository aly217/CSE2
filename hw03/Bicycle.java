//Anjela Yates
//hw03.a
//Bicycle Java Program

import java.util.Scanner;

    //define class
    public class Bicycle{
        
        //add main method
        public static void main(String[] args){
            
            //define and use scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            //ask user for info
            System.out.print("Enter the number of seconds:");
            
            //store input in scanner
            int seconds = myScanner.nextInt();
            
            System.out.print("Enter the number of counts:");
            
            int counts = myScanner.nextInt();
            
            //enter code to compute distance traveled and avaerage miles per hour
            double wheelDiameter = 27.0,
                    PI = 3.14159,
                    feetPerMile = 5280,
                    inchesPerFoot = 12,
                    secondsPerMinute = 60;
                    double totalDistance;
                    double mph;
                    double time;
                    
                    
                    totalDistance=counts*wheelDiameter*PI;
                    totalDistance/=inchesPerFoot*feetPerMile;
                    time=seconds/secondsPerMinute;
                    mph=time/60;
                    time=(int)(time*100)/100.0;
                    totalDistance= (int)(totalDistance*100)/100.0;
                    mph=(int)(mph*100)/100.0;
                    
                    System.out.print("The distance was "+totalDistance+"  miles and took "+time+" minutes, ");
                    
                    System.out.print("The average mph was "+mph+" mph");
                    
                    
        }
    }
            
            
        