import java.util.*;
import java.lang.*;
import java.util.Scanner;
//Function with arguements and no return types
class add_nrwa
{  
    void add(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("Sum is "+c);

       
    }
        
    public static void main(String args[])
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numbers to be added:");
        a=s.nextInt();
        b=s.nextInt();
        Rextester o=new Rextester();
        o.add(a,b);
     
}
    }
