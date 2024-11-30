package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;

    // insert node at the end
    public void addLast(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {     // list is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // insert node at the beginning
    public void addFirst(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {     // list is empty
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // delete node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        DoublyNode current = head;

        // find the node tp delete
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node with value " + data + " not found");
            return;
        }

        // only node
        if (current == head && current == tail) {
            head = null;
            tail = null;
        }
        // head node
        else if (current == head) {
            head = head.next;
            head.prev = null;
        }
        // tail node
        else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        // node is in the middle
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // print the list forward (head to tail)
    public void printForward() {
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // print the list backward (tail to head)
    public void printBackward() {
        DoublyNode current = tail;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        System.out.print("Linked list after adding nodes at the end : ");
        list.printForward();

        System.out.println();

        list.addFirst(0);
        System.out.print("Linked list after adding nodes at the start : ");
        list.printForward();

        System.out.println();

        System.out.print("Linked list printed backward : ");
        list.printBackward();

        System.out.println();

        list.delete(2);
        System.out.print("List after deleting node with value 2 : ");
        list.printForward();

        System.out.println();

        list.delete(0);
        System.out.print("List after deleting the head : ");
        list.printForward();

        System.out.println();

        list.delete(3);
        System.out.print("List after deleting the tail : ");
        list.printForward();

        System.out.println();

        list.delete(10);
    }
}
