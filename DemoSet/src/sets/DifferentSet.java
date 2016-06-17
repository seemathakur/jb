package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSet {

	public static void main(String[] args) {
		//It does not maintain order
		Set<String> set = new HashSet<String>();
		set.add("Seema");
		set.add("Guggu");
		set.add("Thia");
		System.out.println(set);
		for(String item : set){
			System.out.println(item);
		}
Set<String> lhSet = new LinkedHashSet<String>();
// It maintains the order in which the elements are stored.
	lhSet.add("Ghugi");
	lhSet.add("Bhundi");
	lhSet.add("Chutri");
	System.out.println(lhSet);
	for(String item:lhSet){
		System.out.println(item);
		}
	
	
	//
	List<String> lSet = new ArrayList<String>();
	lSet.add("Bhanu");
	lSet.add("Anku");
	lSet.add("sharda");
	System.out.println(lSet);
	for(String item1:lSet){
		System.out.println(item1);}
		//Treeset maintains the natural order
		Set<String> tSet = new TreeSet();
	    tSet.add("Bhanu");
		tSet.add("Anku");
		tSet.add("sharda");
		System.out.println(lSet);
		for(String item2:tSet){
			System.out.println(item2);
		
	}

	}
	}
