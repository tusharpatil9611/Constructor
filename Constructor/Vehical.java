package Constructor;

public class Vehical {
	String colour="Black";
	int gearCount=3;
	int wheelCount=5;
	public Vehical()
	{
		System.out.println(colour+" "+gearCount+" "+wheelCount);
	}
	public Vehical(String colour, int gearCount)
	{
		this();					//calling Default Constructor.
		this.colour=colour;			//Assign Local Value to instance variable 
		this.gearCount=gearCount;
		System.out.println(colour+" "+gearCount+" "+wheelCount);
		
	}

	public static void main(String[] args) {
		Vehical v=new Vehical("Red" , 4);

	}

}
