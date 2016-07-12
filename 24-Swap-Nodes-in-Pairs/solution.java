/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode head = new ListNode(0);
     ListNode n =head;
     
     while(head.next!=null&&head.next.next!=null){
         ListNode n1 = head.next, n2 = head.next.next;
         
         head.next = n2;
         n1.next= n2.next;
         n2.next = n1;
         
         head = n1;
     }return n.next;
    }
}