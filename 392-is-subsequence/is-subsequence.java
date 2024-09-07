class Solution {
    public boolean isSubsequence(String s, String t) {
       
        int sindex=0;
        int tindex=0;
        
        while(sindex<s.length() && tindex<t.length()){
            
            if(s.charAt(sindex)==t.charAt(tindex)){
                sindex++;
            }
            tindex++;
        }
        return sindex==s.length();
    }
}