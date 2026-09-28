package dsa.methods;
public class SecondSmallest {

    public static int secondSmallest(int[] arr) {
        int min = arr[1];
        int second = arr[0];
        for(int i : arr){
            if( i > min){
                min = i;
            }
        }
        for (int x : arr){
            if(x < second && x > min){
                second = x;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondSmallest(new int[]{3,9,5,2,6,7,5,36,14,8,3,2,}));
    }
}
