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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix=new int[m][n];

        for(int i=0;i<m;i++){
            Arrays.fill(matrix[i],-1);
        }

        int rowS=0,rowE=m-1;
        int colS=0,colE=n-1;

        while(head!=null){
            for(int i=colS;i<=colE && head!=null;i++){
                matrix[rowS][i]=head.val;
                head=head.next;
            }
            rowS++;

            for(int i=rowS;i<=rowE && head!=null;i++){
                matrix[i][colE]=head.val;
                head=head.next;
            }
            colE--;

            for(int i=colE;i>=colS && head!=null;i--){
                matrix[rowE][i]=head.val;
                head=head.next;
            }
            rowE--;

            for (int i=rowE; i>=rowS && head != null; i--) {
                matrix[i][colS] = head.val;
                head = head.next;
            }
            colS++;
        }

        return matrix;
    }
}