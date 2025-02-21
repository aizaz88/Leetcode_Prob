class Solution {
    public int addDigits(int num) {
        if(num<10) return num;

        int result=sumOfDigit(num);
        while(result>=10){
            result=sumOfDigit(result);
        }
        return result;
    }
    private int sumOfDigit(int number){
        int sum=0;
        while(number>0){
            sum+=(number%10);
            number/=10;
        }
        return sum;
    }
}