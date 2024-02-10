package Is_A_Relation_ChildReference;

public class Driver {

	public static void main(String[] args) {
		Parent ab=new Child();
		System.out.println("Child Members:");
		System.out.println(ab.a);
		ab.m1();
		System.out.println();
		System.out.println("Parent Members:");
		System.out.println(ab.name);
		ab.m2();
		
	}

}
