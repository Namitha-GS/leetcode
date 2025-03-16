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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy, t = head;
        for(int i=0; i < left-1; i++) {
            prev = prev.next;
            t = t.next;
        }

        ListNode subHead = t;
        
        ListNode prevNode = null;
        for(int i=0; i < (right-left+1); i++) {
           ListNode front = t.next;
           t.next = prevNode;
           prevNode = t;
           t = front; 
        }

        prev.next = prevNode;
        subHead.next = t;

        return dummy.next;
    }
}