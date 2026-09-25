package dsa.methods;
public class Average {
    public static double average(int[] arr) {
        int total = 0;
        double ave = 0;
        for (int num : arr) {
            total += num;
        }
        return ave = (double) total / arr.length;
    }

    public static void main(String[] args) {
        System.out.println(average(new int[]{1,2,3,4,5,6,7,8}));
    }
}
