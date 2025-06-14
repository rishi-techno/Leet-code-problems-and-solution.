class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int count=0, res=0;
         
         for(int i:nums){
            if(i%2==1)
              count++;
            res+=map.getOrDefault(count-k,0);  
            map.put(count,map.getOrDefault(count,0)+1);

         }
      return res;
            }
}