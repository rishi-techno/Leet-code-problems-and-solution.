class Solution {
    public int minimumOperations(int[] nums) {
        int index = -1; 
        HashSet<Integer> seen = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (seen.contains(nums[i])) {
                index = i;
                break;
            }
            seen.add(nums[i]);

        }
        if(index==-1)
          return 0;
         int remainder=(index+1)%3;
         if(remainder==0) 
            return (index+1)/3;
        return ((index+1)/3)+1;
         
    }
}