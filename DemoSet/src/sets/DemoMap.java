package sets;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {
		//Always stores key-value pair : Entries
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Guggu");
		map.put(2, "Thia");
		// key always unique but value can be duplicate also
		String value1 = map.get(1);
		System.out.println(value1);

	}

}
