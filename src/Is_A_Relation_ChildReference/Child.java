package Is_A_Relation_ChildReference;

public class Child extends Parent {
String a="From child";
public void m1()
{
	System.out.println("From child m1()");
	//super.m1();
	//System.out.println(super.name);
}
public void m2()
{
	System.out.println("From child m2()");
	//super.m1();
	//System.out.println(super.name);
}

}
