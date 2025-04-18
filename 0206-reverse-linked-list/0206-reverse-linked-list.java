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

    // Iterative Approach
    public ListNode reverseList(ListNode head) {
        ListNode t = head, prev = null;
        while(t != null) {
            ListNode front = t.next;
            t.next = prev;
            prev = t;
            t = front;
        }
        return prev;
    }
    //=====================================================
    // /* Recursive Approach way 1 */
    // public ListNode reverseListRecursive(ListNode head) {
    //     if(head == null || head.next == null) {
    //         return head;
    //     }
    //     ListNode newHead = reverseListRecursive(head.next);
    //     ListNode front = head.next;
    //     head.next = null;
    //     front.next = head;
    //     return newHead;
    // }
    //======================================================
    // /* Recursive Approach way 2 */
    // public ListNode reverseList2(ListNode head) {
    //     if(head == null || head.next == null) {
    //         return head;
    //     }
    //     ListNode newhead = reverseList2(head.next);
    //     head.next.next = head;
    //     head.next = null;
    //     return newhead;
    // }

}