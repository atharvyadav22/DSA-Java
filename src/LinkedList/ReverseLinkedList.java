package LinkedList;

import LinkedList.LinkedListModel.ListNode;

//Problem No- 206 https://leetcode.com/problems/reverse-linked-list/description/?envType=problem-list-v2&envId=linked-list
public class ReverseLinkedList {


    public ListNode reverseList(ListNode head) {

        if (head == null) return null;

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
