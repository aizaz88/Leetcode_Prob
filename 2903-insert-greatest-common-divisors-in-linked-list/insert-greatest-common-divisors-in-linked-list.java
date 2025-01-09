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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       
       if(head==null || head.next==null){
        return head;
       }

       ListNode curr=head;

        while(curr!=null && curr.next!=null){
            int val1=curr.val;
            int val2=curr.next.val;
            int gcd=GCD(val1,val2);

            ListNode inserted=new ListNode(gcd);
            inserted.next=curr.next;
            curr.next=inserted;

            curr=inserted.next;
        }

        return head;
    }

    private int GCD(int a,int b){
        int min=Math.min(a,b);
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
}  