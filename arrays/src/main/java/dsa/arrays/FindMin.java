package dsa.arrays;
public class FindMin {
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < min){
                min = num;
            }
        }
        return min ;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{2,3,4,5,6,2,66,2,5,22,48,8,77}));
    }
}
