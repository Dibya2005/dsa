class Solution {
    public int ceiling(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1; // stores ceiling value

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return nums[mid]; // exact match is ceiling
            } 
            else if (nums[mid] > target) {
                ans = nums[mid];   // possible ceiling
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
