class Solution {
    public boolean makeEqual(String[] words) {
       int freq[] = new int[26];
        for (String s : words) {
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }
        }
       
        for (int i : freq) {
            if (i % words.length != 0) {
                return false;
                }

        }return true;
    }
}