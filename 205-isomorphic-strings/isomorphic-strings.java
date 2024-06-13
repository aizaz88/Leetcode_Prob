class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<>();

        

        if (s.length() != t.length()) {

            return false;

        }

        for (int i = 0; i < s.length(); i++) {

            Character sch = s.charAt(i);

            Character tch = t.charAt(i);

            

            if (mp.containsKey(sch)) {

                if (mp.get(sch) != tch) {

                    return false;

                }

            } else if (mp.containsValue(tch)) {

                return false;

            } else {

                mp.put(sch, tch);

            }

        }

        return true;
    }
}