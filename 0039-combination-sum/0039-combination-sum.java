class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(0,candidates,target,new ArrayList<Integer>(),result);
        return result;
    }
    void backtrack(int idx,int[] candidates,int target,List<Integer> temp,List<List<Integer>> result){
        if(idx==candidates.length||target<0)
            return; 
          if(target==0) {
            result.add(new ArrayList<>(temp));  
            return;       
             } 
             temp.add(candidates[idx]);
             backtrack(idx,candidates,target-candidates[idx],temp,result);
              temp.remove(temp.size() - 1);  
 
        backtrack(idx + 1, candidates, target, temp, result);
 
    }
}