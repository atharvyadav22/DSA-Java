package LinkedList.Hashing;

import LinkedList.LinkedListModel.ListNode;

import java.util.HashSet;

//Problem No-160 https://leetcode.com/problems/intersection-of-two-linked-lists/?envType=problem-list-v2&envId=linked-list
public class IntersectionOfTwoLinkedList {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;

        HashSet<ListNode> set = new HashSet<>();

        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }


        while (headB != null) {

            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }


        return null;
    }
}
