package LinkedLists;

public class ReverseLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    // 1. Iterative Approach - O(n) Time | O(1) Space
    public static Node reverseIterative(Node head) {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // 2. Recursive Approach - O(n) Time | O(n) Stack Space
    public static Node reverseRecursive(Node head) {
        if (head == null || head.next == null) return head;
        Node rest = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.print("Original List: ");
        printList(head);

        head = reverseIterative(head);
        System.out.print("Reversed (Iterative): ");
        printList(head);
    }
}
