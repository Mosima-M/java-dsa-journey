package dsa.arrays;
public class RotateLeft {
    public static int[] rotateLeft(int[] arr, int k) {
        int n = arr.length;

        if (n == 0) {
            return arr;
        }

        k = k % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + k) % n];
        }

        return result;
    }
}
