package dsa.methods;

import java.util.Arrays;

public class IsSorted {
    public static boolean isSorted(int[] arr) {
    if (arr == null || arr.length <= 1){
        return true;
    }
    for (int i = 0; i < arr.length - 1 ; i++){
        if (arr[i] > arr[i + 1]){
            return false;
        }
    }
        return true;
    }
    }