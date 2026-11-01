package LinkedLists;

public class RemoveDuplicatesSorted {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    public static void removeDuplicates(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // Skip duplicate node
            } else {
                current = current.next;
            }
        }
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(11);
        head.next.next = new Node(12);

        removeDuplicates(head);
        System.out.print("Pruned List: ");
        printList(head);
    }
}
