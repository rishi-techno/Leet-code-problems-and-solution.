class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        generateHelper(n,0,0,result,"");
        return result; 
    }
    private void  generateHelper(int max,int open,int close, List<String> result,String s){
        if(s.length()==(2*max)){
            result.add(s);
            return;
        }
        if(open<max)
           generateHelper(max,open+1,close,result,s+"(");
        if(close<open)
           generateHelper(max,open,close+1,result,s+")");
    }
}