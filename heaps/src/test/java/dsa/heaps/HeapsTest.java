package dsa.heaps;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class HeapsTest {

    // ─── Problem 117: Min Heap ────────────────────────────────────────────────

    @Test void minHeap_isEmpty() {
        MinHeap h = new MinHeap(10);
        assertTrue(h.isEmpty());
    }

    @Test void minHeap_peekReturnsSmallest() {
        MinHeap h = new MinHeap(10);
        h.insert(5); h.insert(3); h.insert(8);
        assertEquals(3, h.peek());
    }

    @Test void minHeap_extractMinOrder() {
        MinHeap h = new MinHeap(10);
        h.insert(5); h.insert(3); h.insert(8); h.insert(1);
        assertEquals(1, h.extractMin());
        assertEquals(3, h.extractMin());
        assertEquals(5, h.extractMin());
        assertEquals(8, h.extractMin());
    }

    @Test void minHeap_sizeTracked() {
        MinHeap h = new MinHeap(10);
        h.insert(1); h.insert(2);
        assertEquals(2, h.size());
    }

    // ─── Problem 118: Max Heap ────────────────────────────────────────────────

    @Test void maxHeap_isEmpty() {
        MaxHeap h = new MaxHeap(10);
        assertTrue(h.isEmpty());
    }

    @Test void maxHeap_peekReturnsLargest() {
        MaxHeap h = new MaxHeap(10);
        h.insert(5); h.insert(3); h.insert(8);
        assertEquals(8, h.peek());
    }

    @Test void maxHeap_extractMaxOrder() {
        MaxHeap h = new MaxHeap(10);
        h.insert(5); h.insert(3); h.insert(8); h.insert(1);
        assertEquals(8, h.extractMax());
        assertEquals(5, h.extractMax());
        assertEquals(3, h.extractMax());
        assertEquals(1, h.extractMax());
    }

    // ─── Problem 119: K largest elements ─────────────────────────────────────

    @Test void kLargest_basic() {
        List<Integer> result = KLargest.kLargest(new int[]{3,1,5,8,2,7}, 3);
        assertTrue(result.contains(5));
        assertTrue(result.contains(7));
        assertTrue(result.contains(8));
        assertEquals(3, result.size());
    }

    // ─── Problem 120: K smallest elements ────────────────────────────────────

    @Test void kSmallest_basic() {
        List<Integer> result = KLargest.kSmallest(new int[]{3,1,5,8,2,7}, 3);
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
        assertEquals(3, result.size());
    }
}
