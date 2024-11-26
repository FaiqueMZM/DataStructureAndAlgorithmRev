package LinkedList.Implementation;

class LinkedList {
    private Node head;      // head of the list

    // add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;     // if head is empty, new node is the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;     // traverse to the end of the list
            }
            current.next = newNode;     // add the new node
        }
    }

    // remove the node with given data
    public void remove(int data) {
        if (head == null) {
            return;     // empty list
        }
        if (head.data == data) {        // if head contains the data
            head = head.next;           // update head
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;     // traverse the list
        }
        if (current.next != null) {     // if the data is found
            current.next = current.next.next;
        }
    }

    // display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
