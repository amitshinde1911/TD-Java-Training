package immutable;

public class ImmutableDemo {

	public static void main(String[] args) {

		String s1 = "Amit";
		String s2 = "Shinde";
		
		System.out.println("Before Concat :");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		s2 = s1.concat(s2);
		
		System.out.println("After Concat :");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		
	}

}
