class Solution {
    public int divisorSubstrings(int num, int k) {
        
        String numstr=String.valueOf(num);
        int count=0;
        
        for(int i=0;i<=numstr.length()-k;i++){
            String substr=numstr.substring(i,i+k);
            int value=Integer.parseInt(substr);
            
            if(value!=0 && num%value==0){
                count++;
            }
        }
        return count;
    }
}