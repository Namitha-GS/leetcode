/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        // find middle of linked list
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow poiner is middle of linked list
        // Reverse 2nd half of LL (from middle of LL)
        ListNode prev = null, t = slow;
        while(t != null) {
            ListNode front = t.next;
            t.next = prev;
            prev = t;
            t = front;
        }

        // initialize 2 pointers, 1 at start of LL & other at end of LL
        // at start, pointer is head & at end, pointer is prev
        while(prev != null) {
            if(head.val != prev.val) {
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}