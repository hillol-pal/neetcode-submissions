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
    public boolean hasCycle(ListNode head) {
        ListNode index = new ListNode(-1000000,head);
        ListNode fast = index;
        ListNode slow = index;


        if(head == null || head.next == null)
           return false;

        while(slow.next != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast.next == slow)
              return true;

        }

        return false;
         
    }
}
