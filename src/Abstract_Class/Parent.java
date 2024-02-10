package Abstract_Class;

abstract class Parent {
public abstract void m1();
public int m3()
{
	System.out.println("From child m2()");
	return 0;
}

public static void m4()
{
	System.out.println("From Interface m4()");
}
public static int m5()
{
	System.out.println("From Interface m4()");
	return 0;
}
public static int m6()
{
	System.out.println("From Interface m4()");
	return 0;
}
}
