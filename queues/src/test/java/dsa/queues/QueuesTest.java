package dsa.queues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueuesTest {

    // ─── Problems 89-93: Queue using array ───────────────────────────────────

    @Test void queue_isEmptyOnCreation() {
        ArrayQueue q = new ArrayQueue(5);
        assertTrue(q.isEmpty());
    }

    @Test void queue_enqueueAndPeek() {
        ArrayQueue q = new ArrayQueue(5);
        q.enqueue(10);
        assertEquals(10, q.peek());
    }

    @Test void queue_enqueueAndDequeue() {
        ArrayQueue q = new ArrayQueue(5);
        q.enqueue(10);
        assertEquals(10, q.dequeue());
        assertTrue(q.isEmpty());
    }

    @Test void queue_fifoOrder() {
        ArrayQueue q = new ArrayQueue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        assertEquals(1, q.dequeue());
        assertEquals(2, q.dequeue());
        assertEquals(3, q.dequeue());
    }

    @Test void queue_sizeTracked() {
        ArrayQueue q = new ArrayQueue(5);
        q.enqueue(1);
        q.enqueue(2);
        assertEquals(2, q.size());
        q.dequeue();
        assertEquals(1, q.size());
    }
}
