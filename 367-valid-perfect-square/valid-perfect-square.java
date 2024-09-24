class Solution {
    public boolean isPerfectSquare(int num) {
        
        if(num==1){
            return true;
        }
        
        int start=1,end=num/2;
        while(start<=end){
            int mid=(start+end)/2;
            
            long square=(long)mid*mid;
            if(square==num){
                return true;
            }else if(square>num){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}