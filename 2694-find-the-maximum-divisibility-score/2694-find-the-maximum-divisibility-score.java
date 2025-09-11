class Solution {
    public int maxDivScore(int[] nums, int[] divisors) { 
        Arrays.sort(divisors);
        int  maxDivScores=divisors[0],maxCount=0;
        for(int i=0;i<divisors.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%divisors[i]==0)
                  count++;
                if(maxCount<count) 
                  {
                    maxCount=count;
                    maxDivScores=divisors[i];
                  }
            }
        }
        return maxDivScores;
    }
}