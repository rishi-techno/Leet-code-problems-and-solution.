class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiag=0.0;
        int maxArea=0; 

        for(int arr[]:dimensions){
            int l=arr[0];
          int w=arr[1];
          double diagonal=Math.sqrt(l*l+w*w);
         int area=l*w;
          if(diagonal>maxDiag){
            maxDiag=diagonal;
           maxArea=area;}

            else if(maxDiag==diagonal)
             maxArea=Math.max(maxArea,area);
        } 
        return maxArea;
    }
}