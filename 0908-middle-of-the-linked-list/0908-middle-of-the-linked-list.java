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
    public ListNode middleNode(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // public ListNode middleNode(ListNode head) {
    //     if(head == null || head.next == null) {
    //         // if there is only 1 element, then return that element
    //         return head;
    //     }

    //     ListNode temp = head;
    //     int cnt = 0;
    //     while(temp != null) {
    //         temp = temp.next;
    //         cnt++;
    //     }

    //     temp = head;
    //     for(int i=0; i<cnt/2; i++) {
    //         temp = temp.next;
    //     }
    //     return temp;
    // }
}