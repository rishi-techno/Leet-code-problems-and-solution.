class Solution {
    public String sortVowels(String s) {
        List<Character> vowelList = new ArrayList<>();
        for (char i : s.toCharArray()) {
            if ("AEIOUaeiou".indexOf(i)!=-1)
               vowelList.add(i);
        }
        Collections.sort(vowelList);
        StringBuilder res = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
             if ("AEIOUaeiou".indexOf(c) != -1) {
                res.append(vowelList.get(i));
                i++;
            } else
                res.append(c);
        }
        return res.toString();
    }
}