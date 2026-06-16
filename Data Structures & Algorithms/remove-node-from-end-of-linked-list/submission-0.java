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
    public ListNode removeNthFromEnd(ListNode head, int n) throws Exception{

        if(head== null || head.next == null && n==1 )
          return null;
       
        if(n > 30 ){
            throw new IllegalArgumentException("Invalid input n");
        }
        ListNode pad = new ListNode(-1,head);
        ListNode ahead = pad;
        ListNode behind = pad;

        int count = 0;

        while(count < n){
           if(ahead.next != null){
             ahead = ahead.next;
             count++;
           }else {
              throw new IllegalArgumentException("List size and n are mismatching");
           }
        }
        
        while(ahead.next != null){
           ahead = ahead.next;
           behind = behind.next;
        }
        behind.next = behind.next.next;

        return pad.next;
       
    }
}
