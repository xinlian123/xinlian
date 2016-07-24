/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
   
      ListNode odd = head;
    ListNode even =head.next;
    ListNode res = head;
    ListNode connect = head.next;
    
    
    if(head==null)
    return head;
 
    
    while(odd!=null&&even!=null){
        ListNode t = even.next;
        if(t==null){
        break;
    }
    odd.next = even.next;
    odd = odd.next;
    
    even.next= odd.next;
    even = even.next;
    
    
    }
    odd.next = connect;
    return res;
    }
    
    }
