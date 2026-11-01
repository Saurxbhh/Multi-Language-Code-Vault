package LinkedLists;

public class LoopStartNode {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    public static Node findLoopStart(Node head) {
        Node slow = head, fast = head;
        boolean loopExists = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                loopExists = true;
                break;
            }
        }

        if (!loopExists) return null;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow; // Intersection node is the loop start
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next; // Cycle points back to 2

        Node startNode = findLoopStart(head);
        if (startNode != null) System.out.println("Loop starts at node value: " + startNode.data);
    }
}
