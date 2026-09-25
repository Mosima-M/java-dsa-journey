package dsa.methods;
public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2};
        System.out.println(count(arr, 2));

    }

    public static int count(int[] arr, int value) {
        int count = 0;
        for (int num : arr) {
            if (num == value) {
                count += 1;
            }
        }
        return count;
    }
}
