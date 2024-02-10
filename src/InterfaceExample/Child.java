package InterfaceExample;

public class Child implements Parent {
	public void m1()
	{
		System.out.println("From child m1()");
	}
	public void m2()
	{
		System.out.println("From child m2()");
	}
	
	public static void main(String[] args) {
		Parent p=new Child();
		p.m1();
		p.m2();
		
	}
	
}
