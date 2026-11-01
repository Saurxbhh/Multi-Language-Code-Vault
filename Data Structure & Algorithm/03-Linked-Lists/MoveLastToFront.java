package LinkedLists;

public class MoveLastToFront {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    public static Node moveLastToFront(Node head) {
        if (head == null || head.next == null) return head;

        Node secLast = null;
        Node last = head;

        while (last.next != null) {
            secLast = last;
            last = last.next;
        }

        secLast.next = null; // Disconnect tail
        last.next = head;    // Move tail to front
        head = last;         // Update head pointer
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        head = moveLastToFront(head);
    }
}
