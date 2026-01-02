import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i2 = 0; i2 < nums.length; i2++) {
            if (nums[i2] != i2 + 1) {
                ans.add(nums[i2]);
            }
        }

        return ans;
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
