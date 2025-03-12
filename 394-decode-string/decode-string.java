class Solution {
    public String decodeString(String s) {
        Stack<Integer> repeatNum=new Stack<>();
        Stack<StringBuilder> strStack=new Stack<>();
        StringBuilder currStr=new StringBuilder();

        int k=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }else if(c=='['){
                repeatNum.push(k);
                strStack.push(currStr);
                k=0;
                currStr=new StringBuilder();
            }else if(c==']'){
                int repitation=repeatNum.pop();
                StringBuilder decoded=strStack.pop();
                for(int i=0;i<repitation;i++){
                    decoded.append(currStr);
                }
                currStr=decoded;
            }else{
                currStr.append(c);
            }
        }
        return currStr.toString();
    }
}