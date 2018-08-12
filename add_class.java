import java.util.*;
import java.lang.*;
import java.util.Scanner;

class add_class
{  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter numbers to be added:");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("Sum is "+c);
        
    }
}
