class Solution {
    public String maximumOddBinaryNumber(String s) {
        int OnesCount=0;
        for(char c:s.toCharArray()){
            if(c=='1')
            OnesCount++;
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<OnesCount-1;i++){
             sb.append("1");
             }
  int zeroCount=s.length()-OnesCount;
    for(int i=0;i<zeroCount;i++){
         sb.append("0");
         }
    sb.append("1");
    return sb.toString();
        
    }
}