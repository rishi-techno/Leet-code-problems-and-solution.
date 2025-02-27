class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>result=new ArrayList<>();
        for(int i:nums1)
        map.put(i,1);

        for(int i:nums2)
        {
            if(map.containsKey(i)&&map.get(i)==1){            
                map.put(i,0);
                result.add(i);
            }
        }
         
        
   int arr[]=new int[result.size()];

    for(int i=0;i<arr.length;i++){ 
        arr[i]=result.get(i);
    }
       return arr;
        
    }
}