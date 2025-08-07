class Solution {
    public boolean detectCapitalUse(String word) {
        char start=word.charAt(0);
        int bias=(Character.isUpperCase(start))?1:0;
        int count1=0,count2=0;
        for(int i=1;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isUpperCase(c)) count1++;
            else count2++;
            
        }
         return(count1+bias==word.length() ||count2==word.length()-1 )  ;
    }
}