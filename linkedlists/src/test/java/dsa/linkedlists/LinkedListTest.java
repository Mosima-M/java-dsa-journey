package dsa.linkedlists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList list;

    @BeforeEach
    void setup() { list = new LinkedList(); }

    // ─── Problem 71-73: Create list, add first, add last ─────────────────────

    @Test void addLast_singleNode() {
        list.addLast(1);
        assertEquals(1, list.head.value);
    }

    @Test void addLast_multipleNodes() {
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        assertEquals(1, list.head.value);
        assertEquals(2, list.head.next.value);
        assertEquals(3, list.head.next.next.value);
    }

    @Test void addFirst_prependsToHead() {
        list.addLast(2);
        list.addLast(3);
        list.addFirst(1);
        assertEquals(1, list.head.value);
        assertEquals(2, list.head.next.value);
    }

    // ─── Problem 74: Insert at position ──────────────────────────────────────

    @Test void addAt_insertsAtMiddle() {
        list.addLast(1);
        list.addLast(3);
        list.addAt(1, 2);
        assertEquals(2, list.head.next.value);
    }

    // ─── Problem 75: Delete ───────────────────────────────────────────────────

    @Test void delete_removesValue() {
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.delete(2);
        assertEquals(1, list.head.value);
        assertEquals(3, list.head.next.value);
    }

    @Test void delete_head() {
        list.addLast(1);
        list.addLast(2);
        list.delete(1);
        assertEquals(2, list.head.value);
    }

    // ─── Problem 76: Search ───────────────────────────────────────────────────

    @Test void contains_valueExists()       { list.addLast(1); list.addLast(2); assertTrue(list.contains(2)); }
    @Test void contains_valueNotExists()    { list.addLast(1); list.addLast(2); assertFalse(list.contains(9)); }

    // ─── Problem 77: Reverse ──────────────────────────────────────────────────

    @Test void reverse_basic() {
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.reverse();
        assertEquals(3, list.head.value);
        assertEquals(2, list.head.next.value);
        assertEquals(1, list.head.next.next.value);
    }

    // ─── Problem 78: Find middle ──────────────────────────────────────────────

    @Test void findMiddle_oddLength() {
        list.addLast(1); list.addLast(2); list.addLast(3);
        assertEquals(2, list.findMiddle());
    }

    @Test void findMiddle_evenLength() {
        list.addLast(1); list.addLast(2); list.addLast(3); list.addLast(4);
        assertEquals(3, list.findMiddle()); // second middle for even
    }

    // ─── Problem 79: Detect cycle ─────────────────────────────────────────────

    @Test void hasCycle_noCycle() {
        list.addLast(1); list.addLast(2); list.addLast(3);
        assertFalse(list.hasCycle());
    }

    @Test void hasCycle_withCycle() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2; n2.next = n3; n3.next = n1; // cycle
        list.head = n1;
        assertTrue(list.hasCycle());
    }
}
