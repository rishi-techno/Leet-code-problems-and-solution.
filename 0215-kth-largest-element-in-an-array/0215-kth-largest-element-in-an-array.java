class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int element:nums){
            minHeap.add(element);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
       return minHeap.peek();
    }
}