package dsa.methods;
public class MissingNumber {
    // array contains 1..n with one number missing
    public static int findMissing(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr){
            actualSum += num;
        }

        return expectedSum -  actualSum;
    }
}
