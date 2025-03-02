class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=0;
        for(int i:nums){
            if(map.containsKey(i))
              map.put(i,map.get(i)+1);
              else
              map.put(i,1);
            if(map.containsKey(i)&&map.get(i)>max) 
              max=map.get(i); 
        } 
        ArrayList<Integer>list=new ArrayList<>(map.values());
        int maxFrequency=0;
        for(int i:list)
        {
            if(i==max)
               maxFrequency+=i;
        }return maxFrequency;
    }
}