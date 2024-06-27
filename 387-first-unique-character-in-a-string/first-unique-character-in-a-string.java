class Solution {
    public int firstUniqChar(String s) {
        
        if (s == null || s.length() == 0) {
            return -1;
        }
        
        Map<Character,Integer> unique=new HashMap<>();
        
        for(char ch:s.toCharArray()){
            unique.put(ch,unique.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<s.length();i++){
            if(unique.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}