package structured.linkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        LinkedList<Integer> list = new LinkedList<>();
        for (int val : arr) {
            list.add(val);
        }
        System.out.println("Before Reverse");
        list.printList();

        Node temp = list.head;
        Node newNode = null;
        while (temp != null) {
            Node node = temp.next;
            temp.next = newNode;
            newNode = temp;
            temp = node;
        }
        list.head = newNode;

        System.out.println("After Reverse");
        list.printList();

    }
}
