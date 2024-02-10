package Method_Shadowing;

public class Child extends Parent {
	public static String m1()
	{
		System.out.println("From Child m1()");
		return null;
	}
	public static StringBuffer m2()
	{
		System.out.println("From Child m2()");
		return null;
	}
	public static Object m3()
	{
		System.out.println("From Child m3()");
		return null;
	}
	public static String m4()
	{
		System.out.println("From Child m4()");
		return null;
	}

}
