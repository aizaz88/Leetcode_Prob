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
    public ListNode reverseKGroup(ListNode head, int k) {
        //base cAse
        if(head==null || k==1) return head;
        //node count
        int nodes=0;
        ListNode temp=head;
        while(temp!=null){
            nodes++;
            temp=temp.next;
        }

        //Process
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode previous=dummy;
        ListNode current=head;

        while(nodes>=k){
            current=previous.next;
            ListNode next=current.next;

            for(int i=1;i<k;i++){
                current.next=next.next;
                next.next=previous.next;
                previous.next=next;
                next=current.next;
            }

            previous=current;
            nodes-=k;
        }
        return dummy.next;
    }
}