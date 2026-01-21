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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(
            (a,b)->a.val-b.val
        );

        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        for(ListNode node:lists){
            if(node!=null){
                pq.offer(node);
            }
        }
        
        while(!pq.isEmpty()){
            ListNode temp=pq.poll();
            if(temp.next!=null){
                pq.offer(temp.next);
            }
            curr.next=temp;
            curr=curr.next;
        }
        return dummy.next;

    }
}