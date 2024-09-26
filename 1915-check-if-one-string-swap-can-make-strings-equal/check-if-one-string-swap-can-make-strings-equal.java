class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
       
        List<Integer> mismatch=new ArrayList<>();
        
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                mismatch.add(i);
            }
        }
            
            if(mismatch.size()==0){
                return true;
            }
            
            if(mismatch.size()==2){
                int j=mismatch.get(0);
                int k=mismatch.get(1);
                
                return s1.charAt(j)==s2.charAt(k) && s1.charAt(k)==s2.charAt(j);
            }
        return false;
    }
}