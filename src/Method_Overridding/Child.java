package Method_Overridding;

public class Child extends Parent {
	public  String m1()
	{
		System.out.println("From Child m1()");
		return null;
	}
	public StringBuffer m2()
	{
		System.out.println("From Child m2()");
		return null;
	}
	public Object m3()
	{
		System.out.println("From Child m3()");
		return null;
	}
	public int m4()
	{
		System.out.println("From Child m4()");
		return 0;
	}

}
