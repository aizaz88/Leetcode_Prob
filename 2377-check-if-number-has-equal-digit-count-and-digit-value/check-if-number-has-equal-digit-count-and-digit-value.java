class Solution {
    public boolean digitCount(String num) {
        
         Map<Integer,Integer> nummap=new HashMap<>();
        
        for(char ch:num.toCharArray()){
            int digit=ch-'0';
            nummap.put(digit,nummap.getOrDefault(digit,0)+1);
        }
        
        for(int i=0;i<num.length();i++){
           int expect=num.charAt(i)-'0';
            int actual=nummap.getOrDefault(i,0);
            if(expect!=actual){
                return false;
            }
        }
        return true;
    }
}