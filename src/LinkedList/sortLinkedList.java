package LinkedList;

// sort a linked list

public class sortLinkedList {
    public Node head;

    public Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // split the list into two
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        middle.next = null;

        Node left = sort(head);
        Node right = sort(nextOfMiddle);

        return merge(left, right);
    }

    private Node merge(Node left, Node right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        Node result;
        if (left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }

    // find middle of the list
    private Node getMiddle(Node head) {
        if (head == null) return head;

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        sortLinkedList list = new sortLinkedList();

        list.add(4);
        list.add(2);
        list.add(1);
        list.add(3);

        System.out.print("Linked List : ");
        list.printList();

        list.head = list.sort(list.head);

        System.out.print("Sorted Linked List : ");
        list.printList();
    }
}
