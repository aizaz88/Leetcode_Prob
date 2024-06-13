class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled=s+s;
        
        String removed=doubled.substring(1,doubled.length()-1);
        
        return removed.contains(s);
    }
}