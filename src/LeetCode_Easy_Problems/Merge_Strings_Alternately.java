class Solution {
    public String mergeAlternately(String word1, String word2) {

        return mergeStrings(word1, word2);
    }

    public String mergeStrings(String s1, String s2) {

        StringBuilder str = new StringBuilder();

        int s1l = s1.length();
        int s2l = s2.length();
        int minLen = Math.min(s1l, s2l);

        for(int i = 0; i < minLen; i++) {
            str.append(s1.charAt(i));
            str.append(s2.charAt(i));
        }

        if(s1l > s2l) {
            str.append(s1.substring(minLen));
        }
        else if(s2l > s1l) {
            str.append(s2.substring(minLen));
        }

        return str.toString();
    }
}