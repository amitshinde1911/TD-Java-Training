package day3;

public class ReverseString {
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int start = 0, end = chars.length - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Reversed String: " + reverse(input));
    }
}

