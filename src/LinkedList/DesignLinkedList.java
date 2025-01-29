package LinkedList;

//Problem No- 707 https://leetcode.com/problems/design-linked-list/description/
public class DesignLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head, tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public int get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) return -1;
            current = current.next;
        }
        return current != null ? current.val : -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (tail == null) tail = head;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            if (prev == null) return;
            prev = prev.next;
        }
        if (prev == null) return;
        Node newNode = new Node(val);
        newNode.next = prev.next;
        prev.next = newNode;
        if (newNode.next == null) tail = newNode;
    }

    public void deleteAtIndex(int index) {
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;
            return;
        }
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            if (prev == null || prev.next == null) return;
            prev = prev.next;
        }
        if (prev.next == null) return;
        prev.next = prev.next.next;
        if (prev.next == null) tail = prev;
    }
}
