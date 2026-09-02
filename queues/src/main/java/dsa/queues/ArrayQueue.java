package dsa.queues;
public class ArrayQueue {
    private int[] data;
    private int front, rear, size;

    public ArrayQueue(int capacity) {
        data = new int[capacity];
        front = 0; rear = 0; size = 0;
    }

    public void enqueue(int value) { /* TODO */ }
    public int dequeue()           { return 0; /* TODO */ }
    public int peek()              { return 0; /* TODO */ }
    public boolean isEmpty()       { return true; /* TODO */ }
    public int size()              { return 0; /* TODO */ }
}
