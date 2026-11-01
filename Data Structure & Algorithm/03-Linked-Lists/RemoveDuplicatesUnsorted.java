package LinkedLists;

import java.util.HashSet;

public class RemoveDuplicatesUnsorted {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    public static void removeDuplicates(Node head) {
        HashSet<Integer> hs = new HashSet<>();
        Node current = head;
        Node prev = null;
        
        while (current != null) {
            if (hs.contains(current.data)) {
                prev.next = current.next; // Skip current node
            } else {
                hs.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(11);
        head.next.next = new Node(12);

        removeDuplicates(head);
        // Standard printing routine displays filtered sequence
    }
}
