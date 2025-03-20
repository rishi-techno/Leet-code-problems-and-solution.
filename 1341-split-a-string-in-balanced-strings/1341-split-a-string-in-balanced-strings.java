class Solution {
    public int balancedStringSplit(String s) {
        if(s.length()==0||s==null)
          return 0;
          int left=0;
          int right=0;
          int count=0;
  for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
    if(c=='L')
       left++;
    else if(c=='R')
      right++;

      if(left==right)
        count++;
  }return count;
    }
}