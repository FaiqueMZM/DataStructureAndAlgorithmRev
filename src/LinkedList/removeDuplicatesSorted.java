package LinkedList;

// remove duplicate elements from a sorted linked list

public class removeDuplicatesSorted {
    public Node head;

    public void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
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
        removeDuplicatesSorted list = new removeDuplicatesSorted();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        System.out.print("Linked List : ");
        list.printList();

        System.out.println();

        list.removeDuplicates();
        System.out.print("Linked List after removing duplicates : ");
        list.printList();
    }
}
