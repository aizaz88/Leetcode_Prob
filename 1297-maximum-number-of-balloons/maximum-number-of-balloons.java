class Solution {
    public int maxNumberOfBalloons(String text) {
        
        Map<Character,Integer> charmap=new HashMap<>();
        for(char ch:text.toCharArray()){
            charmap.put(ch,charmap.getOrDefault(ch,0)+1);
        }
        
        
         String balloon="balloon";
        Map<Character,Integer> balloonmap=new HashMap<>();
        for(char ch:balloon.toCharArray()){
            balloonmap.put(ch,balloonmap.getOrDefault(ch,0)+1);
        }
        
        int maxballoon=Integer.MAX_VALUE;
        for(char ch:balloonmap.keySet()){
            if(charmap.containsKey(ch)){
                maxballoon=Math.min(maxballoon,charmap.get(ch)/balloonmap.get(ch));
            }else{
                return 0;
            }
        }
        return maxballoon;
    }
}