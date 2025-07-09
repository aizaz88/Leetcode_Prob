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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st=new Stack<>();
        while(head!=null){
            st.push(head.val);
            head=head.next;
        }

            ListNode dummy=new ListNode(0);
            ListNode curr=dummy;
        while(!st.isEmpty()){
            curr.next=new ListNode(st.pop());
            curr=curr.next;
        }

        return dummy.next;
    }
}