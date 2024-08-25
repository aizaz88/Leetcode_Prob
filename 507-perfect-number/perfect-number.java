class Solution {
    public boolean checkPerfectNumber(int num) {
         
        List<Integer> divisor=new ArrayList<>();
        
        for(int i=1;i<num;i++){
            if(num%i==0){
                divisor.add(i);
            }
        }
        
        int sum=0;
        for(int n:divisor){
            sum+=n;
        }
        
        return sum==num;
    }
}