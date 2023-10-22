package LeetCode_Easy_Problems;

public class Roman_To_Integer {
    public int romanToInt(String s) {

        // FIRST SOLUTION:

        /*// create hash map to store numerical values for the roman numerals.
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int n = s.length()-1;

        // add key-value for all roman numerals.
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        // iterate over input string to determine our numerical answer.
        for(int i = 0; i < n; i++) {

            // create char variables to store the characters at s.(i) and s.(i+1).
            char c = s.charAt(i);
            char temp = s.charAt(i+1);

            // compare the numeric values of the adjacent chars to determine the operator used on ans.
            if(map.get(c) < map.get(temp)) ans -= map.get(c);
            else ans += map.get(c);
        }

        // return our answer + the numeric value of the last char as our for loop does not reach s.(n).
        return ans + map.get(s.charAt(n)); */


        
        // as per usual there is a more efficient answer, but it is less maintainable.


        // SECOND SOLUTION:
        
        // our logic here is the same as the previous solution, only we call helper instead of the HashMap.
        int ans = 0, n = s.length() - 1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            char temp = s.charAt(i + 1);
            if (helper(c) < helper(temp)) ans -= helper(c);
            else ans += helper(c);
        }

        return ans + helper(s.charAt(n));
    }

    // first we declare a helper method which returns the value of 'c'.
    private int helper(char c) {

        // then we create this switch - case to determine the returned integer.
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
