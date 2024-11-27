package day1;

public class ReverseArray {
    public static void reverse(int[] array) {
        int start = 0, end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        reverse(numbers);
        System.out.print("Reversed Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

