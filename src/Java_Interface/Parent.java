package Java_Interface;

public interface Parent {
	int a=20;
public void m1();
void m2();
default void m3()
{
	System.out.println("Hello");
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
default void m7()
{
	System.out.println("From child m6()");
}
}
