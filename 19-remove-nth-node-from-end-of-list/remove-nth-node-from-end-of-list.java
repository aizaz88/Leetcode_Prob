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
       int nodes=0;
       ListNode curr=head;

       while(curr!=null){
        nodes++;
        curr=curr.next;
       }

        if (n == nodes) return head.next;

     ListNode stepNode=head;

     for(int i=1;i<nodes-n;i++){
        stepNode=stepNode.next;
     }

     stepNode.next=stepNode.next.next;
     
     return head;
    }
}

//Optimal
/*

 ListNode dummy=new ListNode(0);
        dummy.next=head;
        
        ListNode slow=dummy;
        ListNode fast=dummy;
        
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        
        return dummy.next;
*/ 