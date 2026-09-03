package dsa.methods;

import java.util.ArrayList;
import java.util.List;

public class MergeArrays {

    public static int[] merge(int[] a, int[] b) {
        List<Integer> merge = new ArrayList<>();
        for (int num : a){
            merge.add(num);
        }
        for (int num : b){
            merge.add(num);
        }

        int[] merged = new int[merge.size()];
        int index = 0;
        for (int num : merge){
            merged[index++] = num;

        }
        return merged;
    }
}
