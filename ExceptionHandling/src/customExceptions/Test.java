package customExceptions;

public class Test {

	public static void main(String[] args) throws CheckedCustomException {

//		throw new UncheckedCustomException("Business Exception is occured");
		
		throw new CheckedCustomException("Business mandatory exception");
	}

}
