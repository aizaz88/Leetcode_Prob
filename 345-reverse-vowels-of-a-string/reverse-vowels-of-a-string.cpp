class Solution {
public:
    string reverseVowels(string s) {
        unordered_set<char> vowel={'a','e','i','o','u','A','E','I','O','U'};
        int i=0;
        int j=s.length()-1;
        while(i<j){
         if(vowel.find(s[i])==vowel.end()){
             i++;
         }else if(vowel.find(s[j])==vowel.end()){
             j--;
         }else{
             swap(s[i],s[j]);
             i++;
             j--;
         }
        }
        return s;
    }
};