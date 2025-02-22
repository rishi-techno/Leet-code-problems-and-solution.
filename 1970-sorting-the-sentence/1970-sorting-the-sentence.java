class Solution {
    public String sortSentence(String str) {
HashMap<Integer, String> map = new HashMap<Integer, String>();
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            int len = s[i].length();
            int num = Integer.parseInt(String.valueOf(s[i].charAt(len - 1)));
            map.put(num, s[i].substring(0, len - 1));

        }
        String result[] = new String[s.length];
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int index = entry.getKey();
            result[index - 1] = entry.getValue();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i != result.length - 1)
                sb.append(" ");

        }
        return(sb.toString());
    }
}
        
