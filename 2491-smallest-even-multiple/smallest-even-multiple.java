class Solution {
    public int smallestEvenMultiple(int n) {
            if(n%2==0) return n;
        for(int i=1;i<=n;i++){
            if(n*2==2*i) return 2*i;
        }
        return 1;
    }
}