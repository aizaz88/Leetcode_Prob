class Solution {
    public int getLucky(String s, int k) {
    
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int charPosition = PositionOf(s.charAt(i));
            sum += SumOfDigits(charPosition); 
        }

        for (int i = 1; i < k; i++) {
            sum = SumOfDigits(sum); 
        }

        return sum; 
    }

    
    private int PositionOf(char charac) {
        return charac - 'a' + 1; 
    }

    private int SumOfDigits(int digit) {
        int sum = 0;
        while (digit > 0) {
            int remainder = digit % 10;
            sum += remainder; 
            digit /= 10;
        }
        return sum;
    }
}
