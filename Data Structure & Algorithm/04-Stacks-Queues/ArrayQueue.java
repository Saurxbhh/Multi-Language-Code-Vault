package StacksQueues;

public class ArrayQueue {
    private int front, rear, size, capacity;
    private int[] array;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    public void enqueue(int item) {
        if (size == capacity) return;
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
    }

    public int dequeue() {
        if (size == 0) return Integer.MIN_VALUE;
        int item = array[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue() + " dequeued from queue");
    }
}
