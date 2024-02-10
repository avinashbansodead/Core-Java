package Method_Shadowing;

public class Driver {

	public static void main(String[] args) {
		
Parent.m1();
Parent.m2();
Parent.m3();
Child.m1();
Child.m2();
Child.m3();
Parent.m4();
Child.m4();
	}

}
