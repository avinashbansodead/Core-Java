package Has_A_Relation_Composition;

public class Demo1 {
int a;
int b;
int c;
Demo e1;

public Demo1(int a, int b, int c) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
e1=new Demo(40,50,60);
	//e1.displayDemo();
}

public void displayDemo1()
{
	System.out.println("a:"+this.a);
	System.out.println("b:"+this.b);
	System.out.println("c:"+this.c);
}
}
