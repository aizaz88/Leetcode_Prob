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
    public ListNode modifiedList(int[] nums, ListNode head) {
       HashSet<Integer> numSet=new HashSet<>();
       for(int num:nums){
        numSet.add(num);
       } 

       ListNode dummy=new ListNode(0,head);
       ListNode current=dummy;
       while(current.next!=null){
        if(numSet.contains(current.next.val)){
            current.next=current.next.next;
        }else{
            current=current.next;
        }
       }
       return dummy.next;
    }
}