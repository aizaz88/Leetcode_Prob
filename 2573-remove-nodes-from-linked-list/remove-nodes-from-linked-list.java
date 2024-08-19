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
    public ListNode removeNodes(ListNode head) {
        
        Stack<Integer> stack=new Stack<>();
        
      
        while(head!=null){
            while(!stack.isEmpty() && stack.peek()<head.val){
                stack.pop();
            }
            stack.push(head.val);
            head=head.next;
        }
        
        ListNode newhead=null;
        ListNode current=null;
        while(!stack.isEmpty()){
            ListNode newnode=new ListNode(stack.pop());
            if(newhead==null){
                newhead = newnode;
                current = newnode;
            }else{
                newnode.next=current;
                current=newnode;
            }
        }
        return current;
    }
}