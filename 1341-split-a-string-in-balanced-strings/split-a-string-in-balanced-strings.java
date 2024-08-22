class Solution {
    public int balancedStringSplit(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        
        int L=0,R=0,counter=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='L'){
                L++;
            }else{
                R++;
            }
            
            if(L==R){
                counter++;
            }
        }
        return counter;
    }
}