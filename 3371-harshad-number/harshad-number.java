class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int originalX=x;
        int sum=0;
        while(x>0){
            int digit=x%10;
            sum=sum+digit;
            
            x=x/10;
        }
        
        if(originalX%sum==0){
            return sum;
        }
        return -1;
    }
}