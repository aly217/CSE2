//Anjela Yates
//hw02
//Arithmetic Java Program

    //define class
    public class Arithmetic{
    
        //add main method
        public static void main(String[] args){
        
        //input data
            //number of pairs of socks
            int nSocks=3;
            //cost per pair of socks
            double sockCost$=2.58;
            //number of drinking glases
            int nGlasses=6;
            //cost per drinking glass
            double glassCost$=2.29;
            //number of boxes of envelopes
            int nEnvelopes=1;
            //cost per box of envelopes
            double envelopeCost$=3.25;
            //define tax percent
            double taxPercent=.06;
            
            //declare variable
            double totalSockCost$,          //total cost of socks
                   totalGlassCost$,         //total cost of Glasses
                   totalEnvelopeCost$,      //total cost of Envelopes
                   totalCost$,              //total cost without tax
                   totalPurchace$,          //total cost with tax
                   sockTax$,
                   glassTax$,
                   envelopeTax$,
                   totalTax$;
                   
            
        //calculate
        totalSockCost$=nSocks*sockCost$;
        sockTax$=totalSockCost$*taxPercent;
        sockTax$=(int)(sockTax$*100)/100.0;
        totalGlassCost$=nGlasses*glassCost$;
        glassTax$=totalGlassCost$*taxPercent;
        glassTax$=(int)(glassTax$*100)/100.0;
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        envelopeTax$=totalEnvelopeCost$*taxPercent;
        envelopeTax$=(int)(envelopeTax$*100)/100.0;
        totalCost$=totalSockCost$+totalEnvelopeCost$+totalGlassCost$;
        totalPurchace$=(totalCost$)+(taxPercent*totalCost$);
        totalPurchace$=(int)(totalPurchace$*100)/100.0;
        totalTax$=sockTax$+glassTax$+envelopeTax$;
        totalTax$=(int)(totalTax$*100)/100.0;
        
        //print
        System.out.println("The three items bought were Socks, Drinking Glasses, and Boxes of Envelopes");
        System.out.println("There were "+nSocks+" socks, "+nGlasses+"  Drinking Glasses, and "+nEnvelopes+"  boxs of envelopes bought" );
        System.out.println("Socks cost $"+sockCost$+", Drinking Glasses cost $"+glassCost$+" ,and Envelopes cost $"+envelopeCost$+" .");
        System.out.println("The tax on socks was $"+sockTax$+"");
        System.out.println("The tax on Drinking Glasses was $"+glassTax$+"");
        System.out.println("The tax on Envelopes was $"+envelopeTax$+"");
        System.out.println("The subtotal of all items is $"+totalCost$+".");
        System.out.println("The total including tax of all items is $"+totalPurchace$+"");
        
        }
    }
        
        
        
        
        
                   
        
            
