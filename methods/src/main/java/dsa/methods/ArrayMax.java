package dsa.methods;
public class ArrayMax {
    public static int max(int[] arr) {
        int large = arr[0];
        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }
}
