 class Solution {
    public boolean wordPattern(String p, String s) {
        String[] str = s.split(" ");
        if(p.length() != str.length) return false;
        Map<Character, Integer> mp1 = new HashMap<>(); 
        Map<String, Integer> mp2 = new HashMap<>(); 
        for(int i=0; i<p.length(); i++){
            char ch  = p.charAt(i);
            String st = str[i];

            mp1.putIfAbsent(ch, i);
            mp2.putIfAbsent(st, i);

            if (!mp1.get(ch).equals(mp2.get(st))) {
                return false;
            }
            
        }
       return true;
        
    }
}