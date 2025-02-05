package LinkedList;

import LinkedList.LinkedListModel.ListNode;

//Problem No-876 http://leetcode.com/problems/middle-of-the-linked-list/description/?envType=problem-list-v2&envId=linked-list
public class LinkedListMiddleNode {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
