package StringBuffer;

public class SBDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println("Initail Capacity: " + sb.capacity());

		sb.append("Hello my name is ");
		sb.append("Cristiano Ronaldo.");

		System.out.println(sb);
		System.out.println(sb.capacity());

		System.out.println(sb.charAt(12));

//		System.out.print(sb.reverse());

		System.out.println(sb.insert(14, "GOAT "));
		
		System.out.println(sb.delete(13, 18));

	}

}
