package LinkedList.Implementation;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Linked List : ");
        list.display();

        System.out.println();

        list.remove(20);
        System.out.println("Linked List after removing 20 : ");
        list.display();
    }
}
