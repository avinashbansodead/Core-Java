package Inheritence_SingleLevel;

public class Parent {
	String name="From Parent";
	public void m1()
	{
		System.out.println("From parent m1()");
	}
	public void m3()
	{
		//Child ch=new Child();
		System.out.println("From parent m3()");
   this.m2();
   
	}
}
