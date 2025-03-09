class Solution {
    public int maxProduct(String[] words) {
            int n=words.length;
            HashSet<Character>[] setsArray=new HashSet[n];

            for(int i=0;i<n;i++){
                setsArray[i]=new HashSet<>();
                for(char c:words[i].toCharArray()){
                    setsArray[i].add(c);
                }
            }

        int Maxreturn=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(hasNoCommonLetter(setsArray[i],setsArray[j])){
                    Maxreturn=Math.max(Maxreturn,words[i].length()*words[j].length());
                }
            }
        }
        return Maxreturn ;
    }
    private boolean hasNoCommonLetter(HashSet<Character> set1,HashSet<Character> set2){
       for(char c:set1){
        if(set2.contains(c)) return false;
       }
        return true;
    }
}