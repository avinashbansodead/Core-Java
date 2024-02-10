package Abstract_Class;

public class Child extends Parent{
public static void main(String[] args) {
	Child c=new Child();
	c.m1();
	c.m2();
	c.m3();
	Parent.m4();
	Parent.m5();
	Child.m4();
	Child.m5();
}
public void m1()
{
	System.out.println("From child m1()");
}
public void m2()
{
	System.out.println("From child m2()");
}
public int m3()
{
	System.out.println("From child m3()");
	return 0;
}
public static void m4()
{
	System.out.println("From child m4()");
}
public static int m5()
{
	System.out.println("From child m5()");
	return 0;
}
/*default void m6()
{
	System.out.println("From child m6()");
}*/
}
