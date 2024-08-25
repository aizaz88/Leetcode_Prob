import java.util.*;

class Solution {
    public int numberOfSpecialChars(String word) {
        
        Set<Character> charset = new HashSet<>();
        Set<Character> specialChars = new HashSet<>();
        
        // Store all characters in the set
        for (char ch : word.toCharArray()) {
            charset.add(ch);
        }
        
        int count = 0;
        // Check each character if both its lowercase and uppercase exist
        for (char ch : word.toCharArray()) {
            char lower = Character.toLowerCase(ch);
            char upper = Character.toUpperCase(ch);
            
            if (charset.contains(lower) && charset.contains(upper) && !specialChars.contains(lower)) {
                count++;
                specialChars.add(lower); // Add to specialChars to avoid counting twice
            }
        }
        
        return count;
    }
}
