class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        int vowelCount=0,consonantCount=0;
        for(char c:word.toCharArray()){
            if(!Character.isLetterOrDigit(c)) return false;
            if("AEIOUaeiou".indexOf(c)!=-1) vowelCount++;
            else if(Character.isDigit(c)) {}
            else
              consonantCount++;
        }
        return (vowelCount>0&&consonantCount>0);
        
    }
}