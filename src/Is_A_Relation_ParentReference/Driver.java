package Is_A_Relation_ParentReference;

public class Driver {

	public static void main(String[] args) {
		Parent p=new Child();
		System.out.println("Child Members:");
		System.out.println(p.name);
		p.m1();
		System.out.println();
		System.out.println("Parent Members:");
		System.out.println(p.a);
		p.m2();
		
	}

}


