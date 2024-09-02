package structured.linkedList;

/**
 * The type List node.
 */
public class Node<T> {
    T val;
    Node next;

    Node() {}

    Node(T val) {
        this.val = val;
        this.next = null;
    }

    Node(T val, Node next) {
        this.val = val;
        this.next = next;
    }
}
