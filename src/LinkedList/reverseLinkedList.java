package LinkedList;

// reverse a linked list

public class reverseLinkedList {
    Node head;

    public void reverseList()  {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;        // store the next node
            current.next = previous;    // reverse the link
            previous = current;         // move previous to current
            current = next;             // move to current to next
        }

        head = previous;        // update head to new front
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        reverseLinkedList list = new reverseLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Before reversing the linked list : ");
        list.printList();

        System.out.println();

        System.out.println("After reversing the linked list : ");
        list.reverseList();
        list.printList();
    }
}
