package Constructor;

public class CopyConstructor {
	int roll;
	int mark;
	String name;
	
	public CopyConstructor(CopyConstructor s1)
	{
		roll=s1.roll;
		mark=s1.mark;
		name=s1.name;
	}
	
	

	public CopyConstructor(int roll, int mark, String name) {
		//super();
		this.roll = roll;
		this.mark = mark;
		this.name = name;
	}
	public void display()
	{
		System.out.println(roll+" "+mark+" "+name);
	}
	public static void main(String[] args) {
		CopyConstructor s1=new CopyConstructor(1,89,"Tushar");
		s1.display();
		CopyConstructor s2=new CopyConstructor(s1);
		s2.display();
	}

}
