class Solution {
    public int countEven(int num) {
        int result=0;
        for(int i=2;i<=num;i++){
            if(isEvenSum(i)){
                result++;
            }
        }
        return result;
    }

    private boolean isEvenSum(int num){
        int digitsum=0;
            while(num>0){
                int digit=num%10;
                num=num/10;
                digitsum=digitsum+digit;
            }
            return digitsum%2==0;
    }
}