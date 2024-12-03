package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {

		Random obj = new Random();
		
//		Set<Integer> set = new HashSet<>();
//		Set<Integer> set = new LinkedHashSet<>();
		Set<Integer> set = new TreeSet<>();
		Iterator<Integer> itr = set.iterator();
		
		for(int i=0; i<5; i++) {
			int num = obj.nextInt(100);
			set.add(num);
			System.out.println(num);
		}
//		System.out.println("hashSet is : "+set);
//		System.out.println("LinkedhashSet is : "+set);
		System.out.println("TreeSet is : "+set);
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(set);
	}

}
