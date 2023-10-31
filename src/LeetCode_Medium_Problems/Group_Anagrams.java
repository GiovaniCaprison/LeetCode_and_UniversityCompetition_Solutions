class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char [] temp = str.toCharArray();
            Arrays.sort(temp);
            String tempstring = new String(temp);
            if(!map.containsKey(tempstring)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(tempstring, list);
            }
            else {
                map.get(tempstring).add(str);
            }
        }

        List<List<String>> ans = new ArrayList<>(map.values());

        return ans;
    }
}