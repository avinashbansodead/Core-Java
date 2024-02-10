package Object_AsReference;

public class ValueDriver {

	public static void main(String[] args) {
		Value v1=new Value(7);
		Value v2=new Value(8);
		Value v3=new Value(9);
		Val v4=new Val(10);
		int sum=v1.findValue(v2,v3,v4);
System.out.println(sum);
	}

}
