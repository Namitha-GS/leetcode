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
       ListNode t = head;
       Stack<Integer> stack = new Stack<>();
       while(t != null) {
        stack.push(t.val);
        t = t.next;
       }

       t = head;
       while(t != null) {
        if(stack.pop() != t.val) {
            return false;
        }
        t = t.next;
       }
       return true;
    }
}