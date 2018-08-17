
class ridesum
{
void sum(int a,int b)
{
System.out.println("Sum="+(a+b));
}
}
public class overriding_sum extends ridesum
{
	void sum(int a,int b)
  {
  System.out.println("Addition="+(a+b));
}


public static void main(String args[])
{
	int a=357;
	int b=234;
	overriding_sum x=new overriding_sum();
			x.sum(a,b);

	ridesum y=new ridesum();
			y.sum(a,b);
}
}
