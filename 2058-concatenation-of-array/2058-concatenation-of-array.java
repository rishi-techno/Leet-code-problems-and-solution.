class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] concatArray=new int[2*n];
        for(int i=0;i<n;i++){
            concatArray[i]=nums[i];

        }int index=n;
        for(int i=0;i<n;i++){
            concatArray[index]=nums[i];
            index++;
        }
        return concatArray;
    }
}