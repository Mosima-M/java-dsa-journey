package dsa.methods;
public class LinearSearch {

    // return index of value, or -1 if not found
    public static int search(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int []{1,2,4,6,3,5,4}, 9));
    }
}
