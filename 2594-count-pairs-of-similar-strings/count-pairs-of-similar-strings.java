class Solution {
    public int similarPairs(String[] words) {
        HashMap<HashSet<Character>, Integer> map = new HashMap<>();
        int count = 0;

        for (String word : words) {
            HashSet<Character> charSet = new HashSet<>();
            for (char c : word.toCharArray()) {
                charSet.add(c);
            }

            if (map.containsKey(charSet)) {
                count += map.get(charSet);
            }

            map.put(charSet, map.getOrDefault(charSet, 0) + 1);
        }

        return count;
    }
}