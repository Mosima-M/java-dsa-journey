package dsa.arrays;
public class SumElements {
    public static int sum(int[] arr) {
        int total = 0;
        for(int num : arr){
            total += num;
        }
        return total; }
}
