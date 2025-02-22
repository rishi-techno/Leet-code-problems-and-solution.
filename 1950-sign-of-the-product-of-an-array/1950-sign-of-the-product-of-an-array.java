class Solution {
    public int arraySign(int[] nums) {
        int ncount=0;
        for(int i:nums){
            if(i==0)
               return 0;
               
            if(i<0){
                ncount++;

            }
        }if(ncount%2==0)
          return 1;
          else
           return -1;
        
    }
}