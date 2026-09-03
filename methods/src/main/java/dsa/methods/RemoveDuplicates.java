package dsa.methods;
import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        if (arr == null){
            return new int[0];
        }
        Set<Integer> removedDuplicates = new LinkedHashSet<>();
        for (int num : arr){
            removedDuplicates.add(num);
        }
        int[] noDuplicates = new int[removedDuplicates.size()];
        int index = 0;
        for (int num : removedDuplicates){
            noDuplicates[index++] = num;

        }
        return noDuplicates;
}
}
