package dsa.methods;
public class
Average {
    public static double average(int[] arr) {
        double avg = 0;
        double len = arr.length;;
        for (int i = 0; i < arr.length; i++){
            avg += arr[i];

        }
        double mean = avg / len;
        return mean;
    }
}
