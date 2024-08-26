class Solution {
    public int countDigits(int num) {
        
        if(num<=9){
            return 1;
        }
        
        int number=num;
        int count=0;
        while(num>0){
            int digit=num%10;
            
            if(digit!=0 && number%digit==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}