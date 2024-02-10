package Multiple_Interface_Implementing_SingleClass;

public class Child implements Parent1,Parent2{

	public static void main(String[] args) {
		
	Child c=new Child();
c.m1();
c.m2();
c.m3();
c.m4();
c.m5();
c.m6();
	}

	
	public void m1() {
		System.out.println("From child m1()");
		
	}

	
	public void m2() {
		
		System.out.println("From child m2()");
	}
	public void m3() {
		System.out.println("From child m3()");
		
	}
	public void m4() {
		System.out.println("From child m4()");
		
	}
	public void m5() {
		System.out.println("From child m5()");
		
	}
	public void m6() {
		System.out.println("From child m6()");
		
	}

}
