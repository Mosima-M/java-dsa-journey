package dsa.methods;
public class ReverseArray {
    public static int[] reverse(int[] arr) {
     int[] reversed = new int [arr.length];
     for (int i = 0; i < arr.length; i++){
         reversed[i] = arr[arr.length-1-i];
     }
     return reversed;
    }
}
