class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
        int half=i/2;
        int doub=i*2;
        if(map.containsKey(half)&&i%2==0||map.containsKey(doub))
           return true;
           else
             map.put(i,1);
        }
        return false;
    }
}