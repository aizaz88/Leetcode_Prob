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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;

        for(int i=1;i<left;i++){
            prev=prev.next;
        }

        Stack<ListNode> st=new Stack<>();
        ListNode curr=prev.next; //(left 1st node)
        for(int i=left;i<=right;i++){
            st.push(curr);
            curr=curr.next;
        }

        while(!st.isEmpty()){
            prev.next=st.pop();
            prev=prev.next;
        }

        prev.next=curr;

        return dummy.next;
    }
}