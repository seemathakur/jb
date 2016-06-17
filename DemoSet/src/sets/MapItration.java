package sets;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapItration {

	public static void main(String[] args) {
		System.out.println("Itration 1");
		Map<Integer,String> hashmap = new HashMap<Integer,String>();
		hashmap.put(1, "Guggu");
		hashmap.put(2, "Thia");
		for(Map.Entry<Integer,String> entry:hashmap.entrySet()){
			int key=entry.getKey();
			String value=entry.getValue();
			System.out.println("Key " + key + "," +"value " + value);
			
		}
		for(Integer key:hashmap.keySet()){
			String value= hashmap.get(key);
			System.out.println("Key " + key + "," +"value " + value);
			
		}
		System.out.println("Itration 2");
		Map<Integer,String> lhashmap = new LinkedHashMap<Integer,String>();
		lhashmap.put(1, "Guggu");
		lhashmap.put(2, "Thia");
		for(Integer key:lhashmap.keySet()){
			String value= lhashmap.get(key);
			System.out.println("Key " + key + "," +"value " + value);
			
			
		}
		System.out.println("Itration 3");
		Map<Integer,String> tmap = new TreeMap<Integer,String>();
		tmap.put(1, "Guggu");
		tmap.put(2, "Thia");
		for(Integer key:tmap.keySet()){
			String value= tmap.get(key);
			System.out.println("Key " + key + "," +"value " + value);
			
		}
		
		

	}

}
