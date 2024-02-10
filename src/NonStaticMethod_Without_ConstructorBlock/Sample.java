package NonStaticMethod_Without_ConstructorBlock;

public class Sample {
String a;
String b;
	public Sample(String a,String b) {

		this.a=a;
		this.b=b;
	
	}
	public void m1()
	{
		String a="tata";
		System.out.println(a);
		System.out.println(this.a);
	}

}