class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        
        int count=0;
       Set<String> unpair=new HashSet<>();
        
        for(String str:words){
            String reverse=new StringBuilder(str).reverse().toString();
            if(unpair.contains(reverse)){
                count++;
                unpair.remove(reverse);
            }
            else{
                unpair.add(str);
            }
        }
        return count;
    }
}