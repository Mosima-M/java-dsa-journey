package dsa.arrays;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    // ─── Problem 23: Find maximum ─────────────────────────────────────────────

    @Test void findMax_basic()          { assertEquals(9,  FindMax.findMax(new int[]{3,1,9,2})); }
    @Test void findMax_allNegative()    { assertEquals(-1, FindMax.findMax(new int[]{-5,-1,-3})); }
    @Test void findMax_singleElement()  { assertEquals(7,  FindMax.findMax(new int[]{7})); }

    // ─── Problem 24: Find minimum ─────────────────────────────────────────────

    @Test void findMin_basic()          { assertEquals(1,  FindMin.findMin(new int[]{3,1,9,2})); }
    @Test void findMin_allNegative()    { assertEquals(-5, FindMin.findMin(new int[]{-5,-1,-3})); }
    @Test void findMin_singleElement()  { assertEquals(7,  FindMin.findMin(new int[]{7})); }

    // ─── Problem 25: Sum of elements ─────────────────────────────────────────

    @Test void sum_basic()              { assertEquals(15, SumElements.sum(new int[]{1,2,3,4,5})); }
    @Test void sum_withNegatives()      { assertEquals(0,  SumElements.sum(new int[]{-3,0,3})); }
    @Test void sum_singleElement()      { assertEquals(7,  SumElements.sum(new int[]{7})); }

    // ─── Problem 26: Count even and odd ──────────────────────────────────────

    @Test void countEvens_mixed()       { assertEquals(2, CountEvenOdd.countEvens(new int[]{1,2,3,4,5})); }
    @Test void countOdds_mixed()        { assertEquals(3, CountEvenOdd.countOdds(new int[]{1,2,3,4,5})); }
    @Test void countEvens_allOdd()      { assertEquals(0, CountEvenOdd.countEvens(new int[]{1,3,5})); }

    // ─── Problem 27: Count positive and negative ─────────────────────────────

    @Test void countPositive_basic()    { assertEquals(3, CountPosNeg.countPositive(new int[]{1,-2,3,-4,5})); }
    @Test void countNegative_basic()    { assertEquals(2, CountPosNeg.countNegative(new int[]{1,-2,3,-4,5})); }
    @Test void countPositive_withZero() { assertEquals(2, CountPosNeg.countPositive(new int[]{0,1,2})); }

    // ─── Problem 28: Find index of value ─────────────────────────────────────

    @Test void findIndex_found()        { assertEquals(2,  FindIndex.findIndex(new int[]{1,2,3,4,5}, 3)); }
    @Test void findIndex_notFound()     { assertEquals(-1, FindIndex.findIndex(new int[]{1,2,3}, 9)); }
    @Test void findIndex_firstElement() { assertEquals(0,  FindIndex.findIndex(new int[]{7,2,3}, 7)); }

    // ─── Problem 29: Count duplicates ────────────────────────────────────────

    @Test void countDuplicates_hasDupes()   { assertEquals(2, CountDuplicates.countDuplicates(new int[]{1,2,2,3,3})); }
    @Test void countDuplicates_noDupes()    { assertEquals(0, CountDuplicates.countDuplicates(new int[]{1,2,3})); }
    @Test void countDuplicates_allSame()    { assertEquals(1, CountDuplicates.countDuplicates(new int[]{5,5,5})); }

    // ─── Problem 30: Copy array ───────────────────────────────────────────────

    @Test void copy_basicArray() {
        int[] original = {1,2,3};
        int[] copy = CopyArray.copy(original);
        assertArrayEquals(original, copy);
        assertNotSame(original, copy); // must be a real copy, not same reference
    }

    // ─── Problem 31: Reverse in-place ────────────────────────────────────────

    @Test void reverseInPlace_basicArray() {
        int[] arr = {1,2,3,4,5};
        ReverseInPlace.reverse(arr);
        assertArrayEquals(new int[]{5,4,3,2,1}, arr);
    }
    @Test void reverseInPlace_twoElements() {
        int[] arr = {1,2};
        ReverseInPlace.reverse(arr);
        assertArrayEquals(new int[]{2,1}, arr);
    }

    // ─── Problem 32: Second largest ──────────────────────────────────────────

    @Test void secondLargest_basic()        { assertEquals(4, SecondLargest.secondLargest(new int[]{1,2,3,4,5})); }
    @Test void secondLargest_duplicateMax() { assertEquals(4, SecondLargest.secondLargest(new int[]{5,5,4,3})); }

    // ─── Problem 33: Move zeros to end ───────────────────────────────────────

    @Test void moveZeros_basic()        { assertArrayEquals(new int[]{1,3,2,0,0}, MoveZerosToEnd.moveZeros(new int[]{1,0,3,0,2})); }
    @Test void moveZeros_noZeros()      { assertArrayEquals(new int[]{1,2,3},     MoveZerosToEnd.moveZeros(new int[]{1,2,3})); }
    @Test void moveZeros_allZeros()     { assertArrayEquals(new int[]{0,0,0},     MoveZerosToEnd.moveZeros(new int[]{0,0,0})); }

    // ─── Problem 34: Remove duplicates from sorted array ─────────────────────

    @Test void removeDuplicatesSorted_basic()   { assertArrayEquals(new int[]{1,2,3}, RemoveDuplicatesSorted.removeDuplicates(new int[]{1,1,2,2,3})); }
    @Test void removeDuplicatesSorted_noDupes() { assertArrayEquals(new int[]{1,2,3}, RemoveDuplicatesSorted.removeDuplicates(new int[]{1,2,3})); }

    // ─── Problem 35: Rotate left ──────────────────────────────────────────────

    @Test void rotateLeft_byOne()       { assertArrayEquals(new int[]{2,3,4,5,1}, RotateLeft.rotateLeft(new int[]{1,2,3,4,5}, 1)); }
    @Test void rotateLeft_byTwo()       { assertArrayEquals(new int[]{3,4,5,1,2}, RotateLeft.rotateLeft(new int[]{1,2,3,4,5}, 2)); }
    @Test void rotateLeft_byLength()    { assertArrayEquals(new int[]{1,2,3,4,5}, RotateLeft.rotateLeft(new int[]{1,2,3,4,5}, 5)); }

    // ─── Problem 36: Rotate right ────────────────────────────────────────────

    @Test void rotateRight_byOne()      { assertArrayEquals(new int[]{5,1,2,3,4}, RotateRight.rotateRight(new int[]{1,2,3,4,5}, 1)); }
    @Test void rotateRight_byTwo()      { assertArrayEquals(new int[]{4,5,1,2,3}, RotateRight.rotateRight(new int[]{1,2,3,4,5}, 2)); }

    // ─── Problem 37: Find missing number ─────────────────────────────────────

    @Test void findMissing_basic()          { assertEquals(3, FindMissingNumber.findMissing(new int[]{1,2,4,5}, 5)); }
    @Test void findMissing_missingFirst()   { assertEquals(1, FindMissingNumber.findMissing(new int[]{2,3,4,5}, 5)); }
    @Test void findMissing_missingLast()    { assertEquals(5, FindMissingNumber.findMissing(new int[]{1,2,3,4}, 5)); }

    // ─── Problem 38: Find duplicates ─────────────────────────────────────────

    @Test void findDuplicates_basic() {
        List<Integer> result = FindDuplicates.findDuplicates(new int[]{1,2,3,2,4,3});
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
    }
    @Test void findDuplicates_noDuplicates() {
        assertTrue(FindDuplicates.findDuplicates(new int[]{1,2,3}).isEmpty());
    }

    // ─── Problem 39: Intersection ─────────────────────────────────────────────

    @Test void intersection_basic() {
        List<Integer> result = Intersection.intersect(new int[]{1,2,3,4}, new int[]{3,4,5,6});
        assertTrue(result.contains(3));
        assertTrue(result.contains(4));
        assertEquals(2, result.size());
    }
    @Test void intersection_noCommon() {
        assertTrue(Intersection.intersect(new int[]{1,2}, new int[]{3,4}).isEmpty());
    }

    // ─── Problem 40: Union ────────────────────────────────────────────────────

    @Test void union_basic() {
        List<Integer> result = Union.union(new int[]{1,2,3}, new int[]{3,4,5});
        assertTrue(result.contains(1));
        assertTrue(result.contains(5));
        assertEquals(5, result.size()); // no duplicates
    }
}
