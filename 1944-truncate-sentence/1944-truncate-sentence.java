class Solution {
    public String truncateSentence(String s, int k) {
        String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(k!=0){
            sb.append(words[i]+" ");
            i++;
            k--;
        } return sb.toString().trim();
    }
}