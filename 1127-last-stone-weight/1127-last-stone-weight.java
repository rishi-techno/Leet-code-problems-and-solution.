class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<> (new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b - a;  
            }
        });
        for(int stone:stones)
          pq.add(stone);

          while(pq.size()>1){
            int p1=pq.poll();
            int p2=pq.poll();
            pq.add(p1-p2);
          }
         // if(pq.isEmpty()) return 0;
          return pq.poll();

    }
}