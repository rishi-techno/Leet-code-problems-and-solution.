class Solution {
    public int findMin(int[] nums) {
        return findMinimum(nums, 0, nums.length - 1);
    }

    public int findMinimum(int[] nums, int left, int right) {
        if (left == right)
            return nums[left];
        if ((right - left) == 1)
            return Math.min(nums[left], nums[right]);
        int middle = left + (right - left) / 2;

        if (nums[left] < nums[right]) {
            return nums[left];

        } else if (nums[middle] > nums[left]) {
            return findMinimum(nums, middle, right);

        } else {
            return findMinimum(nums, left, middle);
        }
    }
}