class Solution {
    public int reverse(int x) {
         
        boolean minus=false;
        if(x<0){
          minus=true;
          x*=-1;
        }
         
      int reverse=0 ;
        while(x > 0){
            int digit = x % 10;
            if(reverse > Integer.MAX_VALUE / 10) return 0;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
         
        if(minus)
          reverse*=-1;

          return reverse;

    }
}