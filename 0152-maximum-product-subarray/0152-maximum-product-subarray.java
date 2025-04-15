class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct=nums[0];
        int minProduct=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int tempProduct=maxProduct;
            maxProduct=Math.max(nums[i],Math.max(nums[i]*minProduct,nums[i]*maxProduct));
            minProduct=Math.min(nums[i],Math.min(nums[i]*minProduct,nums[i]*tempProduct));
            result=Math.max(result,maxProduct);
        }
        return result;

    }
}