package dsa.arrays;
public class CountEvenOdd {
    public static int countEvens(int[] arr) {
        int count = 0;
        for(int num : arr){
            if(num % 2 == 0){
                count += 1;
            }
        }
        return count; }


    public static int countOdds(int[] arr)  {
        int total = 0;
        for(int num : arr){
            if(num % 2 != 0){
                total += 1;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(countOdds(new int[]{1,2,3,4,5,6,7,8,9}));
    }
}
