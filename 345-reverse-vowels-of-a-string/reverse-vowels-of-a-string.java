class Solution {
    public String reverseVowels(String s) {

        Set<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        char[] chars=s.toCharArray();

        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(set.contains(chars[start]) && set.contains(chars[end])){
                char temp=chars[start];
                chars[start]=chars[end];
                chars[end]=temp;
                start++;
                end--;
            }else if(!set.contains(chars[start])){
                start++;
            }else{
                end--;
            }
        }
        return new String(chars);
    }
}