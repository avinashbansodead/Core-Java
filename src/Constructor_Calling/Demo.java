package Constructor_Calling;

public class Demo {
int a;
int b;
int c;
int d;
public Demo(int a, int b) {
this(10,"Hello");
	this.a = a;
	this.b = b;
}
public Demo(int c, int d) {
	super();
	this.c = c;
	this.d = d;
}
public void m1()
{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
}
}
