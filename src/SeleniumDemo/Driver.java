package SeleniumDemo;

public class Driver {

	public static void main(String[] args) {
		//Parent p=new Parent();
		//Child c=new Child();
		Parent p1=new Child();
		Child c= (Child)p1;
		c.m4();	
		}

}
