package Inheritence_SingleLevel;

public class Child extends Parent {
String a="From child";
public void m1()
{
	System.out.println("From child m1()");
	
}
public void m2()
{
	System.out.println("From child m2()");
	m3();
}

}
