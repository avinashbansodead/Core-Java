package Is_A_Relation_Downcasting;

public class Driver {

	public static void main(String[] args) {
		Parent p=new Child();
		Child c=(Child)p;
		c.m1();
		c.m2();
		c.m3();
		//System.out.println(c.b);
		System.out.println(p.b);
		
	}

}
