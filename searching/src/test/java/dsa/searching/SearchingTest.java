package dsa.searching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchingTest {

    // ─── Problem 51: Linear search ───────────────────────────────────────────

    @Test void linearSearch_found()         { assertEquals(2,  LinearSearch.search(new int[]{1,2,3,4,5}, 3)); }
    @Test void linearSearch_notFound()      { assertEquals(-1, LinearSearch.search(new int[]{1,2,3}, 9)); }
    @Test void linearSearch_firstElement()  { assertEquals(0,  LinearSearch.search(new int[]{7,2,3}, 7)); }
    @Test void linearSearch_lastElement()   { assertEquals(4,  LinearSearch.search(new int[]{1,2,3,4,9}, 9)); }

    // ─── Problem 52: Binary search (array must be sorted) ────────────────────

    @Test void binarySearch_found()         { assertEquals(2,  BinarySearch.search(new int[]{1,2,3,4,5}, 3)); }
    @Test void binarySearch_notFound()      { assertEquals(-1, BinarySearch.search(new int[]{1,2,3,4,5}, 9)); }
    @Test void binarySearch_firstElement()  { assertEquals(0,  BinarySearch.search(new int[]{1,2,3,4,5}, 1)); }
    @Test void binarySearch_lastElement()   { assertEquals(4,  BinarySearch.search(new int[]{1,2,3,4,5}, 5)); }
    @Test void binarySearch_singleElement() { assertEquals(0,  BinarySearch.search(new int[]{42}, 42)); }

    // ─── Problem 53: First occurrence ────────────────────────────────────────

    @Test void firstOccurrence_found()      { assertEquals(1,  FirstOccurrence.firstOccurrence(new int[]{1,2,2,2,3}, 2)); }
    @Test void firstOccurrence_notFound()   { assertEquals(-1, FirstOccurrence.firstOccurrence(new int[]{1,2,3}, 9)); }
    @Test void firstOccurrence_atStart()    { assertEquals(0,  FirstOccurrence.firstOccurrence(new int[]{2,2,3,4}, 2)); }

    // ─── Problem 54: Last occurrence ─────────────────────────────────────────

    @Test void lastOccurrence_found()       { assertEquals(3,  LastOccurrence.lastOccurrence(new int[]{1,2,2,2,3}, 2)); }
    @Test void lastOccurrence_notFound()    { assertEquals(-1, LastOccurrence.lastOccurrence(new int[]{1,2,3}, 9)); }
    @Test void lastOccurrence_atEnd()       { assertEquals(3,  LastOccurrence.lastOccurrence(new int[]{1,2,3,3}, 3)); }

    // ─── Problem 55: Count occurrences using binary search ───────────────────

    @Test void countOccurrences_multiple()  { assertEquals(3, CountOccurrences.count(new int[]{1,2,2,2,3}, 2)); }
    @Test void countOccurrences_one()       { assertEquals(1, CountOccurrences.count(new int[]{1,2,3,4,5}, 3)); }
    @Test void countOccurrences_none()      { assertEquals(0, CountOccurrences.count(new int[]{1,2,3}, 9)); }

    // ─── Problem 56: Insertion position ──────────────────────────────────────

    @Test void insertionPosition_middle()   { assertEquals(2, InsertionPosition.findPosition(new int[]{1,2,4,5}, 3)); }
    @Test void insertionPosition_start()    { assertEquals(0, InsertionPosition.findPosition(new int[]{2,3,4,5}, 1)); }
    @Test void insertionPosition_end()      { assertEquals(4, InsertionPosition.findPosition(new int[]{1,2,3,4}, 5)); }
}
