class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] sneaky=new int[2];
         int index=0;
         HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                sneaky[index++]=i;
                
            }else{
                set.add(i);
            }
        }
     return sneaky;
    }
}