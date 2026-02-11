class MinStack {

                Stack<Integer> stack=new Stack<>();
    public MinStack() {
       
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        Stack<Integer> copyStack=(Stack<Integer>) stack.clone();

        while(!copyStack.isEmpty()){
            int temp=copyStack.pop();
            min=Math.min(min,temp);
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */