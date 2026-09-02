package dsa.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

    private static final int[] SORTED   = {1,2,3,4,5};
    private static final int[] UNSORTED = {5,3,1,4,2};
    private static final int[] DUPES    = {3,1,2,3,1};
    private static final int[] SORTED_DUPES = {1,1,2,3,3};
    private static final int[] SINGLE   = {42};
    private static final int[] NEGATIVES = {-3,1,-1,2,0};
    private static final int[] SORTED_NEGATIVES = {-3,-1,0,1,2};

    // ─── Problem 57: Bubble sort ──────────────────────────────────────────────

    @Test void bubble_sortsUnsorted()   { assertArrayEquals(SORTED,           BubbleSort.sort(UNSORTED.clone())); }
    @Test void bubble_alreadySorted()   { assertArrayEquals(SORTED,           BubbleSort.sort(SORTED.clone())); }
    @Test void bubble_withDuplicates()  { assertArrayEquals(SORTED_DUPES,     BubbleSort.sort(DUPES.clone())); }
    @Test void bubble_singleElement()   { assertArrayEquals(SINGLE,           BubbleSort.sort(SINGLE.clone())); }
    @Test void bubble_withNegatives()   { assertArrayEquals(SORTED_NEGATIVES, BubbleSort.sort(NEGATIVES.clone())); }

    // ─── Problem 58: Selection sort ──────────────────────────────────────────

    @Test void selection_sortsUnsorted()    { assertArrayEquals(SORTED,           SelectionSort.sort(UNSORTED.clone())); }
    @Test void selection_alreadySorted()    { assertArrayEquals(SORTED,           SelectionSort.sort(SORTED.clone())); }
    @Test void selection_withDuplicates()   { assertArrayEquals(SORTED_DUPES,     SelectionSort.sort(DUPES.clone())); }
    @Test void selection_withNegatives()    { assertArrayEquals(SORTED_NEGATIVES, SelectionSort.sort(NEGATIVES.clone())); }

    // ─── Problem 59: Insertion sort ──────────────────────────────────────────

    @Test void insertion_sortsUnsorted()    { assertArrayEquals(SORTED,           InsertionSort.sort(UNSORTED.clone())); }
    @Test void insertion_alreadySorted()    { assertArrayEquals(SORTED,           InsertionSort.sort(SORTED.clone())); }
    @Test void insertion_withDuplicates()   { assertArrayEquals(SORTED_DUPES,     InsertionSort.sort(DUPES.clone())); }
    @Test void insertion_withNegatives()    { assertArrayEquals(SORTED_NEGATIVES, InsertionSort.sort(NEGATIVES.clone())); }

    // ─── Problem 60: Merge sort ───────────────────────────────────────────────

    @Test void merge_sortsUnsorted()    { assertArrayEquals(SORTED,           MergeSort.sort(UNSORTED.clone())); }
    @Test void merge_alreadySorted()    { assertArrayEquals(SORTED,           MergeSort.sort(SORTED.clone())); }
    @Test void merge_withDuplicates()   { assertArrayEquals(SORTED_DUPES,     MergeSort.sort(DUPES.clone())); }
    @Test void merge_singleElement()    { assertArrayEquals(SINGLE,           MergeSort.sort(SINGLE.clone())); }
    @Test void merge_withNegatives()    { assertArrayEquals(SORTED_NEGATIVES, MergeSort.sort(NEGATIVES.clone())); }

    // ─── Problem 61: Quicksort ────────────────────────────────────────────────

    @Test void quick_sortsUnsorted()    { assertArrayEquals(SORTED,           QuickSort.sort(UNSORTED.clone())); }
    @Test void quick_alreadySorted()    { assertArrayEquals(SORTED,           QuickSort.sort(SORTED.clone())); }
    @Test void quick_withDuplicates()   { assertArrayEquals(SORTED_DUPES,     QuickSort.sort(DUPES.clone())); }
    @Test void quick_singleElement()    { assertArrayEquals(SINGLE,           QuickSort.sort(SINGLE.clone())); }
    @Test void quick_withNegatives()    { assertArrayEquals(SORTED_NEGATIVES, QuickSort.sort(NEGATIVES.clone())); }
}
