class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> selfdivideNumber=new ArrayList<>();
        
        for(int i=left;i<=right;i++){
           if(isSelfDivide(i)){
               selfdivideNumber.add(i);
           }
       }
    return selfdivideNumber;
    }
    
    //helper method
    
    private boolean isSelfDivide(int num){
        int number=num;
        
        while(num>0){
            int digit=num%10;
            if(digit==0 || number%digit!=0){
                return false;
            }
            num/=10;
        }
        return true;
    }
}