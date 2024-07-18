class Solution {
    public List<String> commonChars(String[] words) {
        
        List<String> result =new ArrayList<>();
            
            for (char c = 'a'; c <= 'z'; c++) {
                int mincount=Integer.MAX_VALUE;
                
                for(String word:words){
                    int count=0;
                    for(char ch:word.toCharArray()){
                        if(ch==c){
                            count++;
                        }
                    }
                    mincount=Math.min(mincount,count);
                }
                for(int i=0;i<mincount;i++){
                    result.add(String.valueOf(c));
                }
            }
        return result;
    }
}