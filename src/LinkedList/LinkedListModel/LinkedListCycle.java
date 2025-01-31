package LinkedList.LinkedListModel;

//Problem No-141 https://leetcode.com/problems/linked-list-cycle/description/?envType=problem-list-v2&envId=linked-list
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;

    }
}
