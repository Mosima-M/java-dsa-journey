package dsa.methods;
public class SecondSmallest {

    public static int secondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr){
            if (num < smallest){
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest && num > smallest){
                secondSmallest = num;

            }
        }
        return secondSmallest;
    }
}
