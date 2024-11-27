package day1;

public class PairSum {
    public static void findPairs(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("Pair: (" + array[i] + ", " + array[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 12, 5, 3};
        int targetSum = 8;
        System.out.println("Pairs with sum " + targetSum + ":");
        findPairs(numbers, targetSum);
    }
}
