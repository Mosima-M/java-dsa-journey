package dsa.methods;
public class LinearSearch {

    // return index of value, or -1 if not found
    public static int search(int[] arr, int value) {
        int result;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                result = arr[i];

            }
            else {
                continue;
            }
        }
        return -1;
    }
}
