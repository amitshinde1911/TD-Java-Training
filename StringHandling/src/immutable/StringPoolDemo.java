package immutable;

public class StringPoolDemo {

	public static void main(String[] args) {

		User user1 = new User(1, "Amit");
		User user2 = new User(1, "Amit");
		
		System.out.println(user1);
		System.out.println(user2);
		
		
		
		String s1 = "Amit";
		String s2 = "amit";
		String s3 = "amit";
		String s4 = new String("amit");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s2==s4);
		System.out.println(s2.equals(s4));
		
		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));
		
	}

}
