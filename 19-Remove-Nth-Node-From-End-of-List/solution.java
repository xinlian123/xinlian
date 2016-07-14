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
      ListNode faster =head;
      ListNode slower =head;
      
      for(int i=0;i<n;i++){
          faster = faster.next;
      }
      while(faster!=null){
          faster = faster.next;
          slower = slower.next;
      }
      slower.next= slower.next.next;
      return head;
    }
}