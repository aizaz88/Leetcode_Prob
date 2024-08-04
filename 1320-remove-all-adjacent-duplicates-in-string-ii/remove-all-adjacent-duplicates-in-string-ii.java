class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!charStack.isEmpty() && charStack.peek() == ch) {
                int newCount = countStack.pop() + 1;
                if (newCount == k) {
                    charStack.pop();
                } else {
                    countStack.push(newCount);
                }
            } else {
                charStack.push(ch);
                countStack.push(1);
            }
        }
        
    
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            char ch = charStack.pop();
            int count = countStack.pop();
            for (int i = 0; i < count; i++) {
                result.append(ch);
            }
        }
        
        return result.reverse().toString();
    }
}
