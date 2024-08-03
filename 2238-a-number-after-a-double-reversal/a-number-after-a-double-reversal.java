class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        
        int copynum=num;
        
        int reversed1=0;
        while(num>0){
            int digit=num%10;
            reversed1=reversed1*10+digit;
            num=num/10;
        }
        
        int temp=reversed1;
        int reversed2=0;
        while(temp>0){
            int digit=temp%10;
            reversed2=reversed2*10+digit;
            temp=temp/10;
        }
        
        return reversed2==copynum;
        
    }
}