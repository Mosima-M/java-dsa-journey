package dsa.methods;
public class ArrayMin {
    public static int min(int[] arr) {
        int less = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < less){
                less = arr[i];
            }
        }
        return less;
    }
}
