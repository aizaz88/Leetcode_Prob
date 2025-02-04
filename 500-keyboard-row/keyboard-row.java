class Solution {
    public String[] findWords(String[] words) {
        String first="qwertyuiop";
        String second="asdfghjkl";
        String third="zxcvbnm";

       ArrayList<String> result=new ArrayList<>();

        for(String word:words){
            if(isSameRow(word,first) ||isSameRow(word,second)|| isSameRow(word,third)){
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
    private boolean isSameRow(String word,String alphabetRow){
            for(char ch:word.toCharArray()){
                if(alphabetRow.indexOf(Character.toLowerCase(ch))==-1){
                    return false;
                }
            }
            return true;
    }
}