package dsa.arrays;
public class FindIndex {
    public static int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findIndex(new int[]{4,2,4,2,4,1,55,6},3));
    }
}
