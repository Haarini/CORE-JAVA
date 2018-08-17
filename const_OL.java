//To implement constructor overloading 
public class const_OL
{
constOL(int a,int b){System.out.println("Sum="+(a+b));}
constOL(int a,int b,int c){System.out.println("Sum="+(a+b+c));
}


public static void main(String args[]) 
{
new constOL(20,20);	
new constOL(45,20,23);
}
}
