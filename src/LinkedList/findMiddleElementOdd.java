package LinkedList;

// find middle element of a linked list which has odd number of elements

public class findMiddleElementOdd {
    public Node head;

    public Node middleElement() {
        if (head == null) {
            System.out.println("Linked list is empty");
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
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
        findMiddleElementOdd list = new findMiddleElementOdd();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("Linked list : ");
        list.printList();

        System.out.println();

        Node middle = list.middleElement();
        System.out.println("Middle element of the linked list : " + middle.data);
    }
}
