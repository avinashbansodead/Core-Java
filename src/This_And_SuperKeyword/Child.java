package This_And_SuperKeyword;

public class Child extends Parent{
String d="From child";
public static void main(String[] args) {
	Child ab=new Child();
	ab.m1();
}
public void m1()
{
	System.out.println("From child m1()");
	System.out.println(d);
	System.out.println(super.d);
	super.m2();
}
public void m2()
{
	System.out.println("This is child m2()");
}

}
