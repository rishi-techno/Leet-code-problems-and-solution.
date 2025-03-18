class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
         
        Set<Integer>st=new HashSet<>();
        for(int e:nums1)
        st.add(e);

        
        for(int e:nums2){
            if(st.contains(e)){
                return e;
            }
        }return -1;
    }
}