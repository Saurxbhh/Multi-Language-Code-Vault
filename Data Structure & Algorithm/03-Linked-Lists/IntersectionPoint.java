package LinkedLists;

public class IntersectionPoint {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    private static int getCount(Node node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public static Node getIntersectionNode(Node head1, Node head2) {
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        int d = Math.abs(c1 - c2);

        Node current1 = head1;
        Node current2 = head2;

        // Shift the longer list pointer forward by d spaces
        if (c1 > c2) {
            for (int i = 0; i < d; i++) current1 = current1.next;
        } else {
            for (int i = 0; i < d; i++) current2 = current2.next;
        }

        // Advance both in unison until they match
        while (current1 != null && current2 != null) {
            if (current1 == current2) return current1;
            current1 = current1.next;
            current2 = current2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Node common = new Node(15);
        Node h1 = new Node(3); h1.next = common;
        Node h2 = new Node(10); h2.next = common;

        Node intersect = getIntersectionNode(h1, h2);
        if (intersect != null) System.out.println("Intersection found at node value: " + intersect.data);
    }
}
