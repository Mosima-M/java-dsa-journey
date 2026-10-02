package dsa.arrays;
public class SecondLargest {
    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num <largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{4,5,5,6,7,2,9,3,8}));
    }
}
