// ✅ Key Idea:
// Use a **stack** to simulate the evaluation process:
// - Traverse the input `tokens` one by one.
// - If the current token is a number → push it onto the stack.
// - If it’s an operator (+, -, *, /):
//     - Pop the top two elements from the stack.
//     - Perform the operation.
//     - Push the result back onto the stack.

class Solution {
    public int evalRPN(String[] tokens) {
            Stack<Integer> st=new Stack<>();

            for(String s:tokens){
                if(s.equals("+")){
                    int a=st.pop();
                    int b=st.pop();
                    st.push(b+a);
                }else if(s.equals("-")){
                    int a=st.pop();
                    int b=st.pop();
                    st.push(b-a);
                }else if(s.equals("*")){
                    int a=st.pop();
                    int b=st.pop();
                    st.push(b*a);
                }else if(s.equals("/")){
                    int a=st.pop();
                    int b=st.pop();
                    st.push(b/a);
                }else{
                    st.push(Integer.parseInt(s));
                }
            }
            return st.peek();
    }
}

