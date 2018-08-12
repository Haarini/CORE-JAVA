import java.util.*;
import java.lang.*;
import java.util.Scanner;
//Function with arguement and with return type
class add_wawr
{  
    int add(int a,int b)
    {

        return a+b;
       

       
    }
        
    public static void main(String args[])
    {
                int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numbers to be added:");
        a=s.nextInt();
        b=s.nextInt();
        
       add_wawr o=new add_wawr();

         System.out.println("Sum is "+o.add(a,b));
     
}
    }
