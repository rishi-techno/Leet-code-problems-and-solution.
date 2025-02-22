class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);

            } else
                map.put(ch, 1);
        }
        HashSet<Integer> set = new HashSet<Integer>(map.values());
        return(set.size() == 1);
            
     
    }
}