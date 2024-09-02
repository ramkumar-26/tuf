package structured.linkedList;

import java.util.Iterator;

/**
 * The type Linked list.
 */
public class LinkedList<T> implements Iterable<T> {
    /**
     * The Head.
     */
    Node<T> head;

    /**
     * Instantiates a new Linked list.
     */
    LinkedList() {
        head = null;
    }

    /**
     * Add all.
     *
     * @param val the val
     */
    void add(T val) {
        Node<T> newNode = new Node<>(val);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    /**
     * Inset at beginning.
     *
     * @param val the val
     */
    void insetAtBeginning(T val) {
        Node<T> newNode = new Node<>(val);
        if (null != head) {
            newNode.next = head;
        }
        head = newNode;
    }

    /**
     * Inset at pos.
     *
     * @param val the val
     * @param pos the pos
     */
    void insetAtPos(T val, int pos) {
        if (pos == 0) insetAtBeginning(val);
        Node<T> newNode = new Node<>(val);
        Node<T> temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
            if (temp == null) {
                throw new IndexOutOfBoundsException("Invalid Position!");
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    /**
     * Delete at pos.
     *
     * @param pos the pos
     */
    void deleteAtPos(int pos) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty!");
        }
        if (pos == 0) {
            deleteAtBeginning();
            return;
        }
        Node<T> temp = head;
        Node<T> prev = temp;
        for (int i = 0; i < pos; i++) {
            prev = temp;
            temp = temp.next;
            if (temp == null) {
                throw new IndexOutOfBoundsException("Invalid Position!");
            }
        }
        prev.next = temp.next;
    }

    /**
     * Delete at beginning.
     */
    void deleteAtBeginning() {
        head = head.next;
    }

    /**
     * Print list.
     */
    void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public Node<T> get(int pos) {
        if (null == head) {
            throw new IndexOutOfBoundsException("Empty List!");
        }
        Node<T> temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void updateIndex(T newVal, int pos) {
        if (null == head) {
            throw new IndexOutOfBoundsException("Empty List!");
        }
        Node<T> temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.next;
            if (temp == null) {
                throw new IndexOutOfBoundsException("Invalid Position!");
            }
        }
        temp.val = newVal;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> temp = head;

            @Override
            public boolean hasNext() {
                return null != temp;
            }

            @Override
            public T next() {
                T val = temp.val;
                temp = temp.next;
                return val;
            }
        };
    }
}
