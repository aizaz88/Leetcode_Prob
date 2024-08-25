class Solution {
    public boolean isFascinating(int n) {
        
        String str=String.valueOf(n)+String.valueOf(2*n)+String.valueOf(3*n);
        
         if(str.length()!=9){
            return false;
        }
        
        Set<Character> digitset=new HashSet<>();
        
        for(char ch:str.toCharArray()){
            if(ch=='0' || !digitset.add(ch)){
                return false;
            }
        }
        
      return digitset.size()==9;
    }
}