class Solution {
    public boolean isPalindrome(int x) {
        //reverse the number and compare with original one 
        int rev=0,original=x;
        while(x>0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        return rev==original;
    }
}