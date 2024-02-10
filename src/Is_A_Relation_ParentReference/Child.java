package Is_A_Relation_ParentReference;

public class Child extends Parent {
	//String name="From child";
//String a="From child";
public void m2()
{
	System.out.println("From child m2()");
	//super.m1();
	//System.out.println(super.name);
}

public void m1()
{
	System.out.println("From child m2()");
	//super.m1();
	System.out.println(this.name);
	
}

}
