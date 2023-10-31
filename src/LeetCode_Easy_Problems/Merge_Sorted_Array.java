class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {

        if(m == 0) arr1[0] = arr2[0];

        int i = m-1, j = n-1, k = m+n-1;

        while(j >= 0) {
            if(i >= 0 && arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            }
            else {
                arr1[k--] = arr2[j--];
            }
        }
    }
}