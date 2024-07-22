

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Split the string into words
        String[] words = s.split(" ");
        
        // If the number of characters in the pattern is not equal to the number of words, return false
        if (pattern.length() != words.length) {
            return false;
        }
        
        // Create two hash maps
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();
        
        // Iterate through the characters in the pattern and words in the string
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            // Check if there is an existing mapping from character to word
            if (charToWord.containsKey(c)) {
                // If the existing mapping does not match the current word, return false
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                // If the word is already mapped to a different character, return false
                if (wordToChar.containsKey(word)) {
                    return false;
                }
                
                // Create the mapping from character to word and word to character
                charToWord.put(c, word);
                wordToChar.put(word, c);
            }
        }
        
        // If all checks pass, return true
        return true;
    }
}
