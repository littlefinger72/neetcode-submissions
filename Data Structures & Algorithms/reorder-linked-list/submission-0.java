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
    public void reorderList(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null;
        ListNode reverseHead = reverseSecondHalf(secondHalf);
        ListNode curr = head;
        while (reverseHead != null) {
            ListNode next1 = curr.next;
            ListNode next2 = reverseHead.next;
            curr.next = reverseHead;
            reverseHead.next = next1;
            curr = next1;
            reverseHead = next2;
        }
        //return head;
    }
    public ListNode reverseSecondHalf(ListNode head) {
        ListNode prev = null;
        while(head!=null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
