package dsa.arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class Union {
    public static List<Integer> union(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            set.add(num);
        }

        return new ArrayList<>(set);
    }
}
