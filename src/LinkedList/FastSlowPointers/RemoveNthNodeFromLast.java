package LinkedList.FastSlowPointers;

import LinkedList.LinkedListModel.ListNode;

//Problem No-19 https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/?envType=problem-list-v2&envId=linked-list

public class RemoveNthNodeFromLast {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode node = new ListNode(0);
        node.next = head;

        ListNode slow = node, fast = node;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return node.next;
    }
}
