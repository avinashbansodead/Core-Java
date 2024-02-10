package Extends_Interface;

public class Child implements Parent3{

	public static void main(String[] args) {
		Parent3 p=new Child();
		p.m1();
		p.m2();
		p.m3();

	}

	
	public void m1() {
		System.out.println("From Parent1");
		
	}

	
	public void m2() {
		System.out.println("From Parent2");
	}

	
	public void m3() {
		System.out.println("From Parent3");
		
	}

}
