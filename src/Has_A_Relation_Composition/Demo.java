package Has_A_Relation_Composition;

public class Demo {
int aa;
int bb;
int cc;
public Demo(int aa, int bb, int cc) {
	super();
	this.aa = aa;
	this.bb = bb;
	this.cc = cc;
	displayDemo();
}

public void displayDemo()
{
	System.out.println("aa:"+this.aa);
	System.out.println("bb:"+this.bb);
	System.out.println("cc:"+this.cc);
}
}
