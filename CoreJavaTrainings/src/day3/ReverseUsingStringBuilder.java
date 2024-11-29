package day3;

public class ReverseUsingStringBuilder {
    public static void main(String[] args) {
        String input = "Hello World";
        StringBuilder sb = new StringBuilder(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + sb.reverse());
    }
}

