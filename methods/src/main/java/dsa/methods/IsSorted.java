package dsa.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class IsSorted {
    public static boolean isSorted(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        int count = 0;
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sorted[i]) {
                count += 1;
            }
        }
        if(count == arr.length){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int [] {9,8,7,6}));
    }
}