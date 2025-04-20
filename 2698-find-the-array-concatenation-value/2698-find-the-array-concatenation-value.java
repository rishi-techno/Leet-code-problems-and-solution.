class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
      int left=0,right=n-1;
      long sum=0;
      while(left<right){
        int concatValue=Integer.parseInt(String.valueOf(nums[left])+(nums[right]+""));
        sum+=concatValue;
        left++;
        right--;
      }  
      if(n%2==0) return sum;
      else return sum+nums[left];
    }
}