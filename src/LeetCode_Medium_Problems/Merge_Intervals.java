class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();

        int[] current = intervals[0];

        list.add(current);

        for(int [] interval : intervals) {
            int currEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if(currEnd >= nextStart) {
                current[1] = Math.max(currEnd, nextEnd);
            } else {
                current = interval;
                list.add(current);
            }
        }

        return list.toArray(new int [list.size()][]);
    }
}