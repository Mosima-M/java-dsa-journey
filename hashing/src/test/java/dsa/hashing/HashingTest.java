package dsa.hashing;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class HashingTest {

    // ─── Problem 96: Count frequencies ───────────────────────────────────────

    @Test void frequency_basicCount() {
        Map<Integer, Integer> result = FrequencyCounter.count(new int[]{1,2,2,3,3,3});
        assertEquals(1, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(3, result.get(3));
    }

    @Test void frequency_singleElement() {
        Map<Integer, Integer> result = FrequencyCounter.count(new int[]{5});
        assertEquals(1, result.get(5));
    }

    // ─── Problem 98: Two Sum ──────────────────────────────────────────────────

    @Test void twoSum_basic() {
        int[] result = TwoSum.twoSum(new int[]{2,7,11,15}, 9);
        // indices 0 and 1 add up to 9
        assertTrue((result[0] == 0 && result[1] == 1) || (result[0] == 1 && result[1] == 0));
    }

    @Test void twoSum_differentPositions() {
        int[] result = TwoSum.twoSum(new int[]{3,2,4}, 6);
        assertTrue((result[0] == 1 && result[1] == 2) || (result[0] == 2 && result[1] == 1));
    }

    // ─── Problem 100: Group anagrams ─────────────────────────────────────────

    @Test void groupAnagrams_basic() {
        List<List<String>> result = GroupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        assertEquals(3, result.size());
    }

    @Test void groupAnagrams_noAnagrams() {
        List<List<String>> result = GroupAnagrams.groupAnagrams(new String[]{"abc","def","ghi"});
        assertEquals(3, result.size());
    }

    // ─── Problem 101: Most frequent element ──────────────────────────────────

    @Test void mostFrequent_basic()     { assertEquals(2, MostFrequent.mostFrequent(new int[]{1,2,2,3,2})); }
    @Test void mostFrequent_single()    { assertEquals(5, MostFrequent.mostFrequent(new int[]{5})); }
    @Test void mostFrequent_tie()       { assertEquals(1, MostFrequent.mostFrequent(new int[]{1,1,2,2})); } // first wins
}
