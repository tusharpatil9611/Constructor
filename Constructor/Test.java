package Constructor;

public class Test {
   int evenOdd;
   int fact;
   int sum;
   
   public Test(int evenOdd, int fact, int sum) {
	super();
	this.evenOdd = evenOdd;
	this.fact = fact;
	this.sum = sum;
}

public void evenodd()
   {
	   if(evenOdd%2==0)
		   System.out.println("No is Even");
	   else
		   System.out.println("Ni is Odd");
   }
public void fact()
	{
		int i=1;
		int num=1;
	while(i<=fact)
	{
			num=num*i;
			i++;		
	}
	System.out.println("factorial is="+num);

	}
public void sum()
	{
	int result=0;
	while(0<sum)
	{
		result=result+sum%10;
		sum=sum/10;
	}
	System.out.println("Sum of the no is="+result);
	}



	public static void main(String[] args) {
		Test test =new Test(12,6,12345);
		test.evenodd();
		test.fact();
		test.sum();
	}

}
