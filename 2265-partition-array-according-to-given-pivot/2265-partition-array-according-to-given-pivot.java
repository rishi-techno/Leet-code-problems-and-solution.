class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int k=0;
         int arr[]=new int[nums.length];

        for(int i:nums){
            if(i<pivot)
            arr[k++]=i;
        }
    for(int i:nums){
            if(i==pivot)
               arr[k++]=i;
        }
               
     for(int i:nums){
             if(i>pivot)
                arr[k++]=i;
            }
        
        return arr;

        }
}