class Solution {
    public int majorityElement(int[] nums) {
        
        int candidate = 0;
        int cnt = 0;

        for(int i=0; i<nums.length; i++) {
            if(cnt == 0) {
                candidate = nums[i];
                cnt = 1;
            } else if(nums[i] == candidate) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return candidate;
    }
}