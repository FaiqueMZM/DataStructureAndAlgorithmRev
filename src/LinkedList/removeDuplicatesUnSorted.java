package LinkedList;

// remove duplicates from a unsorted linked list

import java.util.HashSet;

public class removeDuplicatesUnSorted {
    public Node head;

    public void removeDuplicates() {
        HashSet<Integer> seen = new HashSet<>();

        Node current = head;
        Node previous = null;

        while (current != null) {
            if (seen.contains(current.data)) {
                previous.next = current.next;
            } else {
                seen.add(current.data);
                previous = current;
            }
            current = current.next;
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
        removeDuplicatesUnSorted list = new removeDuplicatesUnSorted();

        list.add(4);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(3);

        System.out.print("Linked List : ");
        list.printList();

        list.removeDuplicates();
        System.out.print("Linked List after removing duplicates : ");
        list.printList();
    }
}
