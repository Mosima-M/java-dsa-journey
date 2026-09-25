package dsa.methods;
public class ArrayMax {
    public static int max(int[] arr) {
        int maxNum = arr[0];
        for (int num : arr ){
            if(num > maxNum){
                maxNum = num;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println(max(new int[]{3, 1, 7, 4, 25, 8}));
    }

}
