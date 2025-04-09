class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing=true;
        boolean isDecreasing=true;
        for(int i=1;i<nums.length;i++){
            if(!isIncreasing&&!isDecreasing)
               return false;
            int prev=nums[i-1];
            int curr=nums[i];
            if(curr<prev){
                isIncreasing=false;
            }
            else if(curr>prev){
                isDecreasing=false;
            } 
            
        
                
            
        }if(isIncreasing||isDecreasing)
               return true;
              else
               
        
                return false;
         
        
    }
}