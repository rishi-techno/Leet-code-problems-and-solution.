class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] prod=new int[n];
        prod[0]=1;
        for(int i=1;i<n;i++)
         {
            prod[i]=prod[i-1]*nums[i-1];
           
         }
         int right=1;
          for(int i=n-1;i>=0;i--)
         {
            prod[i]*=right;
          right*= nums[i];
         }
         return prod;
    }
}