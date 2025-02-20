class Solution {
    public int alternateDigitSum(int n) {
        String number=Integer.toString(n);
        int sum=0;
        int sign=1;
        for(char ch:number.toCharArray()){
            sum+=(ch-'0')*sign;
            sign*=-1;
        }
        return sum;
    }
}