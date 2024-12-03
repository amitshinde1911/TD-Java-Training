package random;

import java.util.Random;

public class RandomClassDemo {

	public static void main(String[] args) {

		Random obj1 = new Random();
		int x = obj1.nextInt(10);
		System.out.println(x);
		
		int y = obj1.nextInt(100);
		System.out.println(y);
	}

}
