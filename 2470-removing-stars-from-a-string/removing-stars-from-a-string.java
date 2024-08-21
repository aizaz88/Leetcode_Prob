class Solution {
    public String removeStars(String s) {
        
        Stack<Character> charstack=new Stack<>();
        for(char ch:s.toCharArray()){
            
            if(!charstack.isEmpty() && ch=='*'){
                charstack.pop();
            }else{
                charstack.push(ch);
            }
            
            
        }
        
        StringBuilder str=new StringBuilder();
        for(char ch:charstack){
            str.append(ch);
        }
        return str.toString();
    }
}