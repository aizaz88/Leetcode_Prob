class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0 || n%3!=0){
            if(n==1){
                return true;
            }
            return false;
        }
        return isPowerOfThree(n/3);
    }
}