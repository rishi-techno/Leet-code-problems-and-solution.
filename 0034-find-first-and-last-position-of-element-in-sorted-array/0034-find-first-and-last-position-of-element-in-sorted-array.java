class Solution {
    public int[] searchRange(int[] nums, int target) {
      int arr[]=new int[2];
      arr[0]=findFirstPos(nums,target);
      arr[1]=findLastPos(nums,target);
      return arr;
    }
    static int findFirstPos(int[]nums,int x){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=x)
                right=mid-1;
            else
                left=mid+1;
              if(left<nums.length&&nums[left]==x) 
                 return left; 
        }
            return-1;
    }
    static int findLastPos(int[] nums,int x){
         int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>x)
               right=mid-1;
            else
              left=mid+1;  
              if(right>=0&&nums[right]==x) 
                 return  right; 
        }
              return -1;
    }
}