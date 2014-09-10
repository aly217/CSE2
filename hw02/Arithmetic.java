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
        totalSockCost$=nSocks*sockCost$;        //cost of socks
        sockTax$=totalSockCost$*taxPercent;     //cost of socks tax
        sockTax$=(int)(sockTax$*100)/100.0;     //converts tax to inter
        totalGlassCost$=nGlasses*glassCost$;    //cost of glasses
        glassTax$=totalGlassCost$*taxPercent;   //cost of glass tax
        glassTax$=(int)(glassTax$*100)/100.0;   //converts tax to integer
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;        //cost of envelopes
        envelopeTax$=totalEnvelopeCost$*taxPercent;         //cost of envelope tax
        envelopeTax$=(int)(envelopeTax$*100)/100.0;         //converts tax to integer
        totalCost$=totalSockCost$+totalEnvelopeCost$+totalGlassCost$;   //total cost with out tax
        totalPurchace$=(totalCost$)+(taxPercent*totalCost$);            //final cost with all tax included
        totalPurchace$=(int)(totalPurchace$*100)/100.0;                 //converts to integer
        totalTax$=sockTax$+glassTax$+envelopeTax$;                      //total tax of all products
        totalTax$=(int)(totalTax$*100)/100.0;                           //converts to integer
        
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
        
        
        
        
        
                   
        
            
