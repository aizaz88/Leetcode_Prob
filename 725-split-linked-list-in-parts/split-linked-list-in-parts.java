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
    public ListNode[] splitListToParts(ListNode head, int k) {

    ListNode[] splittedlist=new ListNode[k];

       //Calculate node......
       ListNode curr=head;
       int nodes=0;
       while(curr!=null){
        curr=curr.next;
        nodes++;
       } 

    int eachPartSize=nodes/k;
    int remainingNodes=nodes%k;

        curr=head;
        for(int i=0;i<k;i++){
            splittedlist[i]=curr;
            int partsize=eachPartSize + (remainingNodes-->0?1:0);

            for(int j=1;j<partsize && curr!=null;j++){
                curr=curr.next;
            }

        if(curr!=null){
            ListNode temp=curr.next;
            curr.next=null;
            curr=temp;
        }  

    }

return splittedlist;
    }
}