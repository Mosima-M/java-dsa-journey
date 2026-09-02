package dsa.methods;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    // ─── Problem 1: Max of two integers ───────────────────────────────────────

    @Test void max_returnsSecondWhenLarger()        { assertEquals(9,  MaxOfTwo.max(4, 9)); }
    @Test void max_returnsFirstWhenLarger()         { assertEquals(10, MaxOfTwo.max(10, 3)); }
    @Test void max_returnsValueWhenEqual()          { assertEquals(5,  MaxOfTwo.max(5, 5)); }
    @Test void max_handlesNegatives()               { assertEquals(-3, MaxOfTwo.max(-3, -7)); }
    @Test void max_handlesOneNegativeOnePositive()  { assertEquals(1,  MaxOfTwo.max(-1, 1)); }

    // ─── Problem 2: Min of two integers ───────────────────────────────────────

    @Test void min_returnsFirstWhenSmaller()        { assertEquals(4,  MinOfTwo.min(4, 9)); }
    @Test void min_returnsSecondWhenSmaller()       { assertEquals(3,  MinOfTwo.min(10, 3)); }
    @Test void min_returnsValueWhenEqual()          { assertEquals(5,  MinOfTwo.min(5, 5)); }
    @Test void min_handlesNegatives()               { assertEquals(-7, MinOfTwo.min(-3, -7)); }
    @Test void min_handlesZero()                    { assertEquals(0,  MinOfTwo.min(0, 5)); }

    // ─── Problem 3: Is even ───────────────────────────────────────────────────

    @Test void isEven_trueForEvenNumber()           { assertTrue(IsEven.isEven(4)); }
    @Test void isEven_falseForOddNumber()           { assertFalse(IsEven.isEven(7)); }
    @Test void isEven_trueForZero()                 { assertTrue(IsEven.isEven(0)); }
    @Test void isEven_trueForNegativeEven()         { assertTrue(IsEven.isEven(-2)); }
    @Test void isEven_falseForNegativeOdd()         { assertFalse(IsEven.isEven(-3)); }

    // ─── Problem 4: Sign ──────────────────────────────────────────────────────

    @Test void sign_positive()                      { assertEquals("positive", Sign.sign(5)); }
    @Test void sign_negative()                      { assertEquals("negative", Sign.sign(-3)); }
    @Test void sign_zero()                          { assertEquals("zero",     Sign.sign(0)); }

    // ─── Problem 5: Square ────────────────────────────────────────────────────

    @Test void square_ofPositive()                  { assertEquals(25, Square.square(5)); }
    @Test void square_ofZero()                      { assertEquals(0,  Square.square(0)); }
    @Test void square_ofNegative()                  { assertEquals(9,  Square.square(-3)); }
    @Test void square_ofOne()                       { assertEquals(1,  Square.square(1)); }

    // ─── Problem 6: Sum of two numbers ───────────────────────────────────────

    @Test void sum_twoPositives()                   { assertEquals(7,  Sum.sum(3, 4)); }
    @Test void sum_withZero()                       { assertEquals(5,  Sum.sum(5, 0)); }
    @Test void sum_twoNegatives()                   { assertEquals(-5, Sum.sum(-2, -3)); }
    @Test void sum_positiveAndNegative()            { assertEquals(1,  Sum.sum(4, -3)); }

    // ─── Problem 7: Max in array ──────────────────────────────────────────────

    @Test void arrayMax_findsMax()                  { assertEquals(9,  ArrayMax.max(new int[]{3, 1, 9, 2})); }
    @Test void arrayMax_singleElement()             { assertEquals(5,  ArrayMax.max(new int[]{5})); }
    @Test void arrayMax_allNegatives()              { assertEquals(-1, ArrayMax.max(new int[]{-5, -1, -3})); }
    @Test void arrayMax_duplicates()                { assertEquals(7,  ArrayMax.max(new int[]{7, 7, 2})); }

    // ─── Problem 8: Min in array ──────────────────────────────────────────────

    @Test void arrayMin_findsMin()                  { assertEquals(1,  ArrayMin.min(new int[]{3, 1, 9, 2})); }
    @Test void arrayMin_singleElement()             { assertEquals(5,  ArrayMin.min(new int[]{5})); }
    @Test void arrayMin_allNegatives()              { assertEquals(-5, ArrayMin.min(new int[]{-5, -1, -3})); }
    @Test void arrayMin_duplicates()                { assertEquals(2,  ArrayMin.min(new int[]{7, 7, 2})); }

    // ─── Problem 9: Average ───────────────────────────────────────────────────

    @Test void average_basicCase()                  { assertEquals(3.0,  Average.average(new int[]{1, 2, 3, 4, 5}), 0.001); }
    @Test void average_singleElement()              { assertEquals(7.0,  Average.average(new int[]{7}), 0.001); }
    @Test void average_withNegatives()              { assertEquals(0.0,  Average.average(new int[]{-3, 0, 3}), 0.001); }
    @Test void average_decimals()                   { assertEquals(2.5,  Average.average(new int[]{1, 2, 3, 4}), 0.001); }

    // ─── Problem 10: Count evens ──────────────────────────────────────────────

    @Test void countEvens_mixedArray()              { assertEquals(2, CountEvens.countEvens(new int[]{1, 2, 3, 4, 5})); }
    @Test void countEvens_allOdd()                  { assertEquals(0, CountEvens.countEvens(new int[]{1, 3, 5})); }
    @Test void countEvens_allEven()                 { assertEquals(3, CountEvens.countEvens(new int[]{2, 4, 6})); }
    @Test void countEvens_includesZero()            { assertEquals(1, CountEvens.countEvens(new int[]{0, 1, 3})); }

    // ─── Problem 11: Reverse array ───────────────────────────────────────────

    @Test void reverse_basicArray()                 { assertArrayEquals(new int[]{5,4,3,2,1}, ReverseArray.reverse(new int[]{1,2,3,4,5})); }
    @Test void reverse_singleElement()              { assertArrayEquals(new int[]{1},         ReverseArray.reverse(new int[]{1})); }
    @Test void reverse_twoElements()                { assertArrayEquals(new int[]{2,1},       ReverseArray.reverse(new int[]{1,2})); }
    @Test void reverse_withNegatives()              { assertArrayEquals(new int[]{-1,0,1},    ReverseArray.reverse(new int[]{1,0,-1})); }

    // ─── Problem 12: Search for value ────────────────────────────────────────

    @Test void search_findsValue()                  { assertEquals(2,  LinearSearch.search(new int[]{1,2,3,4,5}, 3)); }
    @Test void search_valueNotFound()               { assertEquals(-1, LinearSearch.search(new int[]{1,2,3}, 9)); }
    @Test void search_findsFirst()                  { assertEquals(0,  LinearSearch.search(new int[]{7,2,3}, 7)); }
    @Test void search_findsLast()                   { assertEquals(4,  LinearSearch.search(new int[]{1,2,3,4,9}, 9)); }

    // ─── Problem 13: Count occurrences ───────────────────────────────────────

    @Test void countOccurrences_findsMultiple()     { assertEquals(3, CountOccurrences.count(new int[]{1,2,2,3,2}, 2)); }
    @Test void countOccurrences_findsOne()          { assertEquals(1, CountOccurrences.count(new int[]{1,2,3}, 3)); }
    @Test void countOccurrences_notFound()          { assertEquals(0, CountOccurrences.count(new int[]{1,2,3}, 9)); }

    // ─── Problem 14: Is sorted ───────────────────────────────────────────────

    @Test void isSorted_sortedArray()               { assertTrue(IsSorted.isSorted(new int[]{1,2,3,4,5})); }
    @Test void isSorted_unsortedArray()             { assertFalse(IsSorted.isSorted(new int[]{1,3,2,4})); }
    @Test void isSorted_singleElement()             { assertTrue(IsSorted.isSorted(new int[]{1})); }
    @Test void isSorted_allEqual()                  { assertTrue(IsSorted.isSorted(new int[]{3,3,3})); }

    // ─── Problem 15: Second largest ──────────────────────────────────────────

    @Test void secondLargest_basicCase()            { assertEquals(4, SecondLargest.secondLargest(new int[]{1,2,3,4,5})); }
    @Test void secondLargest_withDuplicateMax()     { assertEquals(4, SecondLargest.secondLargest(new int[]{5,5,4,3})); }
    @Test void secondLargest_twoElements()          { assertEquals(1, SecondLargest.secondLargest(new int[]{1,5})); }

    // ─── Problem 16: Second smallest ─────────────────────────────────────────

    @Test void secondSmallest_basicCase()           { assertEquals(2, SecondSmallest.secondSmallest(new int[]{1,2,3,4,5})); }
    @Test void secondSmallest_withDuplicateMin()    { assertEquals(2, SecondSmallest.secondSmallest(new int[]{1,1,2,3})); }
    @Test void secondSmallest_twoElements()         { assertEquals(5, SecondSmallest.secondSmallest(new int[]{1,5})); }

    // ─── Problem 17: Remove duplicates ───────────────────────────────────────

    @Test void removeDuplicates_basicCase()         { assertArrayEquals(new int[]{1,2,3}, RemoveDuplicates.removeDuplicates(new int[]{1,2,2,3,3})); }
    @Test void removeDuplicates_noDuplicates()      { assertArrayEquals(new int[]{1,2,3}, RemoveDuplicates.removeDuplicates(new int[]{1,2,3})); }
    @Test void removeDuplicates_allSame()           { assertArrayEquals(new int[]{5},     RemoveDuplicates.removeDuplicates(new int[]{5,5,5})); }

    // ─── Problem 18: Merge two arrays ────────────────────────────────────────

    @Test void merge_twoArrays()                    { assertArrayEquals(new int[]{1,2,3,4}, MergeArrays.merge(new int[]{1,2}, new int[]{3,4})); }
    @Test void merge_withEmptyArray()               { assertArrayEquals(new int[]{1,2,3},   MergeArrays.merge(new int[]{1,2,3}, new int[]{})); }
    @Test void merge_bothEmpty()                    { assertArrayEquals(new int[]{},         MergeArrays.merge(new int[]{}, new int[]{})); }

    // ─── Problem 19: Rotate array ────────────────────────────────────────────

    @Test void rotate_byOne()                       { assertArrayEquals(new int[]{2,3,4,5,1}, RotateArray.rotate(new int[]{1,2,3,4,5}, 1)); }
    @Test void rotate_byTwo()                       { assertArrayEquals(new int[]{3,4,5,1,2}, RotateArray.rotate(new int[]{1,2,3,4,5}, 2)); }
    @Test void rotate_byLength()                    { assertArrayEquals(new int[]{1,2,3,4,5}, RotateArray.rotate(new int[]{1,2,3,4,5}, 5)); }

    // ─── Problem 20: Missing number ──────────────────────────────────────────

    @Test void missingNumber_basic()                { assertEquals(3, MissingNumber.findMissing(new int[]{1,2,4,5}, 5)); }
    @Test void missingNumber_missingFirst()         { assertEquals(1, MissingNumber.findMissing(new int[]{2,3,4,5}, 5)); }
    @Test void missingNumber_missingLast()          { assertEquals(5, MissingNumber.findMissing(new int[]{1,2,3,4}, 5)); }
}
