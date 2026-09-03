package dsa.methods;

import java.util.Arrays;

public class SecondLargest {
    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i : arr){
            if (i > max){
                secondLargest = max;
                max = i;
            }
            else if (i > secondLargest && i < max){
                secondLargest = i;
            }
        }
        return secondLargest;

    }
}
