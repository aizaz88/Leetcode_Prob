class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet=new HashSet<>();
        for(char ch:jewels.toCharArray()){
            jewelSet.add(ch);
        }

            int count=0;
        for(char ch:stones.toCharArray()){
            if(jewelSet.contains(ch)) count++;
        }
        return count;
    }
}