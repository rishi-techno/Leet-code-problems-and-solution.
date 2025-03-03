class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String>map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] sortedPeople=new String[names.length];
        int j=0;
      for(int i=heights.length-1;i>=0;i--){
         sortedPeople[j]=map.get(heights[i]);
         j++;
      }
      return sortedPeople;
    }
}