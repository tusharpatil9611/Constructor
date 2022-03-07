package Constructor;

public class Rectangle {
	int length;
	int width;
	public Rectangle(int length , int width)
	{
		this.length=length;
		this.width=width;
	}
	public  void rectangleArea()
	{
		int area=length*width;
		System.out.println("Area if rectangle is ="+area);
	}
	public int rectanglePeri()
	{
		int peri=2*(length+width);
		return peri;
	}
	
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(12,18);
		rectangle.rectangleArea();
		int result=rectangle.rectanglePeri();
		System.out.println("Perimeter is ="+result);
	}

}
