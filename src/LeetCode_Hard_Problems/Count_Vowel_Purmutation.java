class Solution {
    public int countVowelPermutation(int n) {

        // mod variable to reduce size.
        final int mod = 1000000007;

        // create our longs to represent vowel counts in the possible string.
        long a = 1, e = 1, i = 1, o = 1, u = 1;

        // start at k = 1, as our vowels summed already = for n == 1.
        for(int k = 1; k < n; k++) {

            //add possibilities to temp variables for each vowel.
            long aTemp = e;
            long eTemp = (a + i) % mod;
            long iTemp = (a + e + o + u) % mod;
            long oTemp = (i + u) % mod;
            long uTemp = a;

            // use these temp values to increment our vowel possibilites.
            a = aTemp;
            e = eTemp;
            i = iTemp;
            o = oTemp;
            u = uTemp;
        }

        long ans = (a+e+i+o+u) % mod;
        return (int) ans;
    }
}