package dsa.methods;

import java.util.Arrays;

public class RotateArray {
    // rotate left by k positions
    public static int[] rotate(int[] arr, int k) {
       int n = arr.length;
       int [] result = new int[n];
       k = k % n;
       for (int i = 0; i < n; i++){
           result[i] = arr[(i + k) % n];
       }


        return result;
    }
}
