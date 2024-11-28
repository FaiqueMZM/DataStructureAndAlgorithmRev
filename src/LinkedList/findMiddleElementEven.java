package LinkedList;

// find middle element of a linked list which has even number of elements

public class findMiddleElementEven {
    public Node head;

    public void middleElement() {
        if (head == null) {
            System.out.println("Linked list is empty");
        }

        Node slow = head;
        Node fast = head;
        Node previous = null;

        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast == null) { // Even number of elements
            System.out.println("The middle elements are: " + previous.data + " and " + slow.data);
        } else { // Odd number of elements
            System.out.println("The middle element is: " + slow.data);
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
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        findMiddleElementEven list = new findMiddleElementEven();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.print("Linked list : ");
        list.printList();

        System.out.println();

        list.middleElement();
    }
}
