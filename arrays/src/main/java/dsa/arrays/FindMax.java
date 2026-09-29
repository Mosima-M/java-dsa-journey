package dsa.arrays;
public class FindMax {
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max ;
    }

    public static void main(String[] args) {
        System.out.println(findMax(new int[]{2,3,4,5,6,2,66,2,5,22,48,8,77}));
    }
}
