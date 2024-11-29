package LinkedList;

// merge two sorted linked list

public class mergeSortedLinkedLists {

    public Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        return dummy.next;
    }

    public void printlist(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        mergeSortedLinkedLists list = new mergeSortedLinkedLists();

        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        System.out.print("Linked List1 : ");
        list.printlist(l1);

        System.out.print("Linked List2 : ");
        list.printlist(l2);

        Node mergeHead = list.mergeTwoLists(l1, l2);

        System.out.print("Merged Linked List : ");
        list.printlist(mergeHead);

    }
}
