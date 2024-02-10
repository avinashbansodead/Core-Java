package Acessibility_Of_Method;

public class Demo {
	static int a=10;
public static void main(String[] args) {
	
	Demo1 b=new Demo1();
	m1();
	Demo a=new Demo();
	
	//a.m2();
	
	b.m6();
}
public static void m1()
{
	System.out.println("Hello");
	Demo a=new Demo();
	a.m4();
	
}
public void m2()
{
	System.out.println("Good"+a);
	m4();

}
public static void m3()
{
	System.out.println("Sorry");
}
public void m4()
{
	System.out.println("Byee"+a);
	
	//b.m6();
}

}
