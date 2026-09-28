package dsa.methods;

import java.util.Arrays;

public class SecondLargest {
    public static int secondLargest(int[] arr) {
        int max = arr[1];
        int second = arr[0];
        for(int i : arr){
            if( i > max){
                max = i;
            }
        }
        for (int x : arr){
            if(x > second && x < max){
                second = x;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{3,9,5,2,6,7,5,36,14,8,3,2,}));
    }
}
