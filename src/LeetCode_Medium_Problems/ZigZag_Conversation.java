class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        char[] result = new char[s.length()];
        int n = s.length();
        int cycleLen = 2 * numRows - 2;
        int index = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                result[index++] = s.charAt(j + i);
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n) {
                    result[index++] = s.charAt(j + cycleLen - i);
                }
            }
        }

        return new String(result);
    }
}