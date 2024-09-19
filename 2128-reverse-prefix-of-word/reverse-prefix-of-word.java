class Solution {
    public String reversePrefix(String word, char ch) {
        
        //Check
        int index=word.indexOf(ch);
        if(index==-1){
            return word;
        }
        
        
        Stack<Character> st=new Stack<>();
        
        for(char character:word.toCharArray()){
            st.push(character);
            if(character==ch){
                break;
            }
        }
        
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        
        for(int i=str.length();i<word.length();i++){
            str.append(word.charAt(i));
        }
        
        return str.toString();
    }
}