package Set;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();
		
		set.add("xyz");
		set.add("def");
		set.add("mno");
		set.add("abc");
		
		for (String obj : set) {
			System.out.println(obj);
		}
	}

}
