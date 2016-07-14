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
        ListNode dummy = new ListNode(0);
     dummy.next =head;
     head = dummy;
     while(head.next!=null&&head.next.next!=null){
         ListNode slow = head.next, fast = head.next.next;
         
         head.next = fast;
         slow.next= fast.next;
         fast.next = slow;
         
         head = slow;
         
     }return dummy.next;
    }
}