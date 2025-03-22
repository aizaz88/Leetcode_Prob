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
    public int getDecimalValue(ListNode head) {
        StringBuilder binary=new StringBuilder();

        while(head!=null){
            binary.append(head.val);
            head=head.next;
        }

        int result=0;
        int i=binary.length()-1;
        for(char c:binary.toString().toCharArray()){
            result=result + (c-'0')* (int)Math.pow(2,i--);
        }
        return result;
    }
}