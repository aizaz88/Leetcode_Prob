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

        ListNode point=head;
        for(int i=1;i<nodes-n;i++){
            point=point.next;
        }

            point.next=point.next.next;
        return head;
    }
}