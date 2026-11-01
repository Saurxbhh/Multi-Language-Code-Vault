package LinkedLists;

public class AddOneToList {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    private static Node reverse(Node head) {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static Node addOne(Node head) {
        head = reverse(head); // Reverse to perform manual calculation from least significant digit
        Node res = head;
        Node temp = null;
        int carry = 1, sum;

        while (head != null) {
            sum = head.data + carry;
            carry = (sum >= 10) ? 1 : 0;
            head.data = sum % 10;
            temp = head;
            head = head.next;
        }

        if (carry > 0) temp.next = new Node(carry);

        return reverse(res); // Restore structural orientation
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(9); // Represents numeric literal 199

        head = addOne(head); // Converts structure to represent 200
    }
}
