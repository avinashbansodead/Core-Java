package MapExample;

import java.util.HashMap;
import java.util.Map;

public class Generic_Map {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "A");
		m.put(2, "B");
		m.put(3, "C");
		m.put(4, "D");
		System.out.println(m);
		}
}
