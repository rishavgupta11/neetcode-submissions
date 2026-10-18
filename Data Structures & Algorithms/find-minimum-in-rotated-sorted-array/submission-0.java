class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            int mid = left + (right -left) / 2; // mid

            if (nums[mid] > nums[right]) {
                left = mid+1; // find right side
            }else {
                right = mid; // find ;eft side
            }
        }
        return nums[left];
    }
}