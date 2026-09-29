package dsa.arrays;

import java.util.Arrays;

public class CopyArray {
    public static int[] copy(int[] arr) {
        int[] cpy = Arrays.copyOf(arr, arr.length);
        return cpy;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(copy(new int[]{1, 2, 3, 4, 5})));
    }
}