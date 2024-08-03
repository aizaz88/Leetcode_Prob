class Solution {
    public int commonFactors(int a, int b) {
        
        int n=Math.max(a,b);
        
        int factorcounter=0;
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                factorcounter++;
            }
        }
        return factorcounter;
    }
}