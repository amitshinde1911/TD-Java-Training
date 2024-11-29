package day2;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]); 
            int result = 10 / 0; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

