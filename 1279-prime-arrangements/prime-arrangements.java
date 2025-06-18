class Solution {
    private static final int MOD = 1_000_000_007;
    public int numPrimeArrangements(int n) {
        int primeCount=countPrimeNum(n);
        long result=(factorial(primeCount)*factorial(n-primeCount))%MOD;
        return (int) result;
    }
    private int countPrimeNum(int x){
        int count=0;
        for(int i=2;i<=x;i++){
            if(isPrime(i)) count++;
        }
        return count;
    }

    private boolean isPrime(int p){
        if(p<=1) return false;
        for(int i=2;i*i<=p;i++){
            if(p%i==0) return false;
        }
        return true;
    }

    private long factorial(int y){
        long factorial=1;
        for(int i=2;i<=y;i++){
            factorial=(factorial*i)%MOD;
        }
        return factorial;
    }
}