class Solution {
    public int climbStairs(int n) {
        
        if(n==1){
            return 1;
        }
        
        if(n==2){
            return 2;
        }
            int[] dynamicmemo=new int[n+1];
        dynamicmemo[1]=1;
        dynamicmemo[2]=2;
        
        for(int i=3;i<=n;i++){
            dynamicmemo[i]=dynamicmemo[i-1]+dynamicmemo[i-2];
        }
      return dynamicmemo[n];
    }
}