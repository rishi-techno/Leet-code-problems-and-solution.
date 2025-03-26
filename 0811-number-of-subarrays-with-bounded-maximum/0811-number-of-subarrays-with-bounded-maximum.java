class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
          int n = nums.length;
        int begin = n;        
        int end = n;          
        int sum = 0;
        for(int i = n-1; i >= 0; i--) {
			 
            if(nums[i] > right) {
                begin = i;
                end = i;
            }
			 
            else if(nums[i] < left) {
                sum = sum + (end-begin);
            }
			 
            else {
                begin = i;
                sum = sum + (end-begin);
            }
        }
        return sum;
    }
}


         