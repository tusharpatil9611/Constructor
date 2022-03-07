package Constructor;

public class Cal {
	int num1;
	int num2;
	public Cal()
	{
		System.out.println("Hiii ");
	}
	public Cal(int a, int b)
	{
		 num1=a;
		 num2=b;
		System.out.println("\"Hello\"");
	}
	public void add()
	{
		int result=num1+num2;
		System.out.println("Add "+result);
	}


public static void main(String[] args) {
//	int a=10; int b=20;
	Cal c=new Cal(10,20);
	Cal n=new Cal();
	c.add();

}
}