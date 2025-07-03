class Solution {
    public String reverseVowels(String s) {

        Set<Character> set=new HashSet<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U')
        );

        char[] chars=s.toCharArray();

        int left=0,right=s.length()-1;
        while(left<right){
            while(left<right && !set.contains(chars[left])){
                left++;
            }
            while(left<right && !set.contains(chars[right])){
                right--;
            }

            //SWAP
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;

            left++;
            right--;
        }

        return new String(chars); 
    }
}