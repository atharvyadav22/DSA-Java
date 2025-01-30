package LinkedList;

import LinkedList.LinkedListModel.ListNode;

//Problem No-83 https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/?envType=problem-list-v2&envId=linked-list
public class RemoveDuplicatesSortedLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
