package Java_Interface;

public class Child implements Parent{
public static void main(String[] args) {
	Parent c=new Child();
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
	System.out.println("From child m1()"+Parent.a);
}
public void m2()
{
	System.out.println("From child m2()");
}
/*public void m3()
{
	System.out.println("From child m3()");
}*/
public static void m4()
{
	System.out.println("From child m4()");
}
public static void m5()
{
	System.out.println("From child m5()");
}
public void m7()
{
	System.out.println("From child m7()");
}
}
