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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
            
        }
        ListNode dummy=new ListNode(-1);
        ListNode temp = dummy;
        temp.next=head;
        temp=temp.next;
         while(temp!=null &&  temp.next!=null){
            if(temp.val!=temp.next.val){
                temp =  temp.next;
            }
            else
            temp.next= temp.next.next;
     }
     return dummy.next;
    }
}