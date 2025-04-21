class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        s = s + s;
        return s.substring((k % n) , (k % n) + n);

    }
}