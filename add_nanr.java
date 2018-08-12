import java.util.*;
import java.lang.*;
import java.util.Scanner;
//Fucntion with no arguement and no return type
class add_nanr
{  
    void add()
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numbers to be added:");
        a=s.nextInt();
        b=s.nextInt();
        int c;
        c=a+b;
        System.out.println("Sum is "+c);

       
    }
        
    public static void main(String args[])
    {
        
        add_nanr o=new add_nanr();
        o.add();
     
}
    }
