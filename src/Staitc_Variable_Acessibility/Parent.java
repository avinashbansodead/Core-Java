package Staitc_Variable_Acessibility;

public class Parent {
	static int b=20;
	static int d;
	public static void m1()
	{
         d=30;
         System.out.println(d);
		System.out.println("Hello");
		System.out.println(d);
	}


}
