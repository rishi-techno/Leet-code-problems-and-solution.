class Solution {
    public boolean isAnagram(String s, String t) {
        
        
        
        // Convert strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
         if(sArray.length!=tArray.length)
             return false;
        // Sort both arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);
      return Arrays.equals(sArray, tArray);

    }
}