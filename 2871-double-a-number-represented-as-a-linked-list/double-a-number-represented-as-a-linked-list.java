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
 import java.math.BigInteger;

class Solution {
    public ListNode doubleIt(ListNode head) {
        String number=ListStr(head);
        
         BigInteger num=new BigInteger(number);
         BigInteger doubledNum=num.multiply(BigInteger.valueOf(2));
         String doubledstr=doubledNum.toString();

        return StringList(doubledstr);
    }

    private String ListStr(ListNode head){
        StringBuilder str=new StringBuilder();
        ListNode curr=head;

        while(curr!=null){
            str.append(curr.val);
        curr=curr.next;
        }
        return str.toString();
    } 

    private ListNode StringList(String doubledstr){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(char digit:doubledstr.toCharArray()){
            curr.next=new ListNode(Character.getNumericValue(digit));
            curr=curr.next;
        }
        return dummy.next;
    }
}