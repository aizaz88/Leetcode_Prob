class Solution {
    public boolean halvesAreAlike(String s) {
     
        Set<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        int n=s.length();
        int mid=n/2;
        
        int firsthalfcount=0;
        int secondhalfcount=0;

        
        for(int i=0;i<mid;i++){
            if(vowels.contains(s.charAt(i))){
                firsthalfcount++;
            }
            if(vowels.contains(s.charAt(mid+i))){
                secondhalfcount++;
            }
        }
        
        return firsthalfcount==secondhalfcount;
    }
}