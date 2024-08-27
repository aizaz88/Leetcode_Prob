class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        
        List<String> result=new ArrayList<>();
        
        for(String word:words){
            String[] splitted=word.split("\\"+separator);
                for(String part:splitted){
                    if(!part.isEmpty()){
                        result.add(part);
                    }
                }
        }
        return result;
    }
}