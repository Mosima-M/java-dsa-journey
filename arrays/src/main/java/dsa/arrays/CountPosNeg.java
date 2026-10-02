package dsa.arrays;
public class CountPosNeg {
    public static int countPositive(int[] arr) {
        int count = 0;
        for(int num : arr){
            if(num % 2 == 0){
                count += 1;
            }
        }
        return count; }

    public static int countNegative(int[] arr) {
        int count = 0;
        for(int num : arr){
            if(num % 2 != 0){
                count += 1;
            }
        }
        return count; }
}
