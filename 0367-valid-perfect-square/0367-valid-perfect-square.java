class Solution {
    public boolean isPerfectSquare(int num) {
        
        if(num==1||num==0)
           return true;
           int res=num/2;
        for(int i=2;i<=res;i++){
            if(i*i==num)
               return true;
        }return false;
    }
}