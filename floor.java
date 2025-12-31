class Solution {
    public int floor(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1; // stores floor value

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return nums[mid]; // exact match is floor
            } 
            else if (nums[mid] < target) {
                ans = nums[mid];  // possible floor
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
