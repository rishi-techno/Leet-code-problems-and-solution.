class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,nums,new ArrayList<>(),result); 
        return result;
    }
   private static void backtrack(int index,int[] nums, List<Integer> temp,List<List<Integer>> result){
    result.add(new ArrayList<>(temp));
    for(int i=index;i<nums.length;i++){
        if(i>index&&nums[i]==nums[i-1]) continue;
        temp.add(nums[i]);
        backtrack(i+1,nums,temp,result);
        temp.remove(temp.size()-1);
    }
    }
}