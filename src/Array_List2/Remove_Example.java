package Array_List2;

import java.util.ArrayList;
import java.util.List;

public class Remove_Example {
	public static void main(String[] args) {
		List l=new ArrayList();
		List s=new ArrayList();
		List in=new ArrayList();
		List c=new ArrayList();
		
		l.add(10);
		l.add("A");
		l.add("BBB");
		l.add("CCC");
		l.add("B");
		l.add('j');
		l.add(17);
		l.add("D");
		l.add('u');
		l.add(19);
		l.add("J");
		l.add('s');
		l.add(11);
		l.add("Q");
		l.add('t');
		l.add(13);
		l.add("P");
		l.add('a');
		l.add(16);
		l.add("N");
		l.add('b');
		for(int i=0;i<l.size();i++)
		{
			Object obj=l.get(i);
			if(obj instanceof String)
			{
				l.remove(i);
				i--;
				
			}
		}
		System.out.println(l);
}
}
