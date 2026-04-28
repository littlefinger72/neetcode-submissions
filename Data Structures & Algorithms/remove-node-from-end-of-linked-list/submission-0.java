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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head, ans = new ListNode(-1);
        ans.next=head;
        int len = 0;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        int index = len - n, i=0;
        curr = head;
        ListNode prev = ans;
        while(curr != null) {
            if(index == i) {
                prev.next = curr.next;
                break;
            }
            i++;
            prev = curr;
            curr = curr.next;
        }
        return ans.next;
    }
}
