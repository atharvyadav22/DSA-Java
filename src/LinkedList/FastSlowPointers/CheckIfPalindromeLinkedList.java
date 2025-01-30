package LinkedList.FastSlowPointers;


import LinkedList.LinkedListModel.ListNode;

//Problem No-243 https://leetcode.com/problems/palindrome-linked-list/?envType=problem-list-v2&envId=linked-list
public class CheckIfPalindromeLinkedList {
    private ListNode mid(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null, current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;


        ListNode midNode = mid(head);


        ListNode right = reverse(midNode);
        ListNode left = head;


        while (right != null) {
            if (right.val != left.val) {
                return false;
            }
            right = right.next;
            left = left.next;
        }

        return true;
    }
}
