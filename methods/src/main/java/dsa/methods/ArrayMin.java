package dsa.methods;
public class ArrayMin {
    public static int min(int[] arr) {
        int minNum = arr[0];
        for (int num : arr ){
            if(num < minNum){
                minNum = num;
            }
        }
        return minNum;
    }
    public static void main(String[] args) {
        System.out.println(min(new int[]{3, 1, 7, 4, 25, 0, 8}));
    }
}
