class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0,right=n-1,maxArea=0;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int w=right-left;
            int area=h*w;
            maxArea=Math.max(maxArea,area);
            while(left <right && height[left] <= h)
              left++;
             while(left <right && height[right] <= h)
              right--;

        }
        return maxArea;
    }
}