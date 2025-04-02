class Solution {
    public long maximumTripletValue(int[] nums) {
       
    long res = 0, maxI = 0, maxIMinusJ = 0;
    for (int n: nums) {
        res = Math.max(res, maxIMinusJ * n);
        maxIMinusJ = Math.max(maxIMinusJ, maxI - n);
        maxI = Math.max(maxI, n);
    }
    return res;
}
    }
 