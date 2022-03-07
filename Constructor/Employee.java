package Constructor;

public class Employee {
	int id;
	String name;
	int salary;
	public Employee()
	{
		
	}
	
	public Employee(int id, String name, int salary) {
		//super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.display();
		Employee e2=new Employee(23,"Tushar",25000);
		e2.display();

	}

}
