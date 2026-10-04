class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length;

        for(int i=n-1; i>=0; i--) {

            if(digits[i] < 9) { // 9 se chota hoga to direct return kr denge and aage badhenge ++ 
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // agar 9 milta raha to '0' bnate rahenge
        }
        int temp[] = new int[n+1];
        temp[0] = 1;
        return temp;
    }
}
