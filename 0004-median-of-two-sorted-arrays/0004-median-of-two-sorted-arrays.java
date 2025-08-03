class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int ele1=-1,ele2=-1;
        int idx1=n/2-1,idx2=n/2;
        int i=0,j=0;
        int count=0;
        while(i<nums1.length&&j<nums2.length){ 
            if(nums1[i]<nums2[j]){
                if(count==idx1) ele1=nums1[i];
                if(count==idx2) ele2=nums1[i];  
                i++;
                count++;
            } 
             else{
                if(count==idx1) ele1=nums2[j];
                if(count==idx2) ele2=nums2[j];  
                j++;
                count++;
            } 
        }
         while( i<nums1.length){ 
           
                if(count==idx1) ele1=nums1[i];
                if(count==idx2) ele2=nums1[i];  
                i++;
                count++;
            } 
       
            while( j<nums2.length){ 
            
                if(count==idx1) ele1=nums2[j];
                if(count==idx2) ele2=nums2[j];  
                j++;
                count++;
            }  
        if(n%2==1)  return ele2;
        else return (double)(double)(ele1+ele2)/2.0;
  
    }
}