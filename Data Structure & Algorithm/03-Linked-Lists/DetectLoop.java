package LinkedLists;

public class DetectLoop {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    // Floyd's Cycle-Finding Algorithm (Tortoise and Hare) - O(n) Time | O(1) Space
    public static boolean hasLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true; // Loop detected
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head.next; // Creates a cycle

        System.out.println("Loop detected in Linked List: " + hasLoop(head));
    }
}
