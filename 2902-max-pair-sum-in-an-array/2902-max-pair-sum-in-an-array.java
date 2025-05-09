class Solution {
    public int maxSum(int[] nums) {
        int n=nums.length;
        int max=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(largDig(nums[i])==largDig(nums[j]))
                  max=Math.max(max,nums[i]+nums[j]);
            }
        }
        return max;
    }

    private static int largDig(int x){
            int larg=0;
            while(x!=0){
                if(x%10>larg)
                larg=x%10;

              x/=10;  
             
            }
            return larg;
        }
}