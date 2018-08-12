import java.util.*;
import java.lang.*;
import java.util.Scanner;

class add_object
{  
    void add()
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numbers to be added:");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("Sum is "+c);
    }
        
    public static void main(String args[])
    {
      
        Rextester o=new Rextester();
        o.add();
       
    }
}
