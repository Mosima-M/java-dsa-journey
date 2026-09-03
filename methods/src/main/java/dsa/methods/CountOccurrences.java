package dsa.methods;
public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,2};
        System.out.println(count(arr,2));

    }
    public static int count(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                count++;
            }
            else{
                continue;
            }
        }
        return count;
    }
}
