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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;

        ListNode curr=head;
        int nodes=0;
        while(curr!=null){
            nodes++;
            curr=curr.next;
        }

        int mid=nodes/2;
        if(mid==0) return head.next;

        curr=head;
        for(int i=0;i<mid-1;i++){
            curr=curr.next;
        }

        curr.next=curr.next.next;
        return head;
    }
}