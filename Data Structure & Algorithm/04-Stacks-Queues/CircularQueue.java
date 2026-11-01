package StacksQueues;

public class CircularQueue {
    private int size, front, rear;
    private int[] queue;

    public CircularQueue(int k) {
        this.size = k;
        this.queue = new int[k];
        this.front = this.rear = -1;
    }

    public boolean enqueue(int value) {
        if ((rear + 1) % size == front) return false; // Full condition
        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        queue[rear] = value;
        return true;
    }

    public int dequeue() {
        if (front == -1) return -1; // Empty condition
        int result = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        cq.enqueue(1); cq.enqueue(2);
        System.out.println("Dequeued: " + cq.dequeue());
    }
}
