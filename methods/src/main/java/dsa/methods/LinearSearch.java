package dsa.methods;
public class LinearSearch {

    // return index of value, or -1 if not found
    public static int search(int[] arr, int value) {
        if (arr == null){
            return -1;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                return i;

            }
        }
        return  -1;
    }
}
