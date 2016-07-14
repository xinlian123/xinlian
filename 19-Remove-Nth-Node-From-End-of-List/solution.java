/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head==null||head.next==null)
       return null;
       ListNode dummy = new ListNode(0);
       dummy.next==head;
       ListNode prev = dummy;
       for(int i=0;i<n;i++){
           head= head.next;
       }
       while(head!=null){
            head= head.next;
            prev=prev.next;
       }prev.next=prev.next.next;
       return dummy.next;
    }
}