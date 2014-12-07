
public class MethodCalls{

    public static void main(String []  arg){

        int a=784,b=22,c;

        c=addDigit(a,3);

        System.out.println("Add 3 to "+a+" to get "+c);

        c=addDigit(addDigit(c,4),5);

        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);

        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));

        c=join(a,b);

        System.out.println("Join "+a+" to "+b+" to get "+c);

        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));

        System.out.println("Join -9 and -90 to get "+join(-9,-90));

    }
    
    public static int addDigit(int a, int b){

    int i=1;
    if(a<0){
        a*=-1;
        i*=-1;
    }
    
    if(b<0){
        b*=-1;
        i*=-1;
    }
    
        String a1="" +a;
        String b1= "" +b;
        
        String c= b1+a1;
        int d= Integer.parseInt(c);
        return d*i;
        
    }
    
    public static int join(int a, int b){
        
        return addDigit(b,a);
        
        // String a1="" +a;
       // String b1= "" +b;
        
        // String c= a1+b1;
        //int d= Integer.parseInt(c);
        
        
    }

}   

