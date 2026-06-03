class Solution {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length;
        int[] result = new int[n];

        int start = 0;
        int end = n - 1;
        int pos = n - 1;

        while (start <= end) {
            int startSquare = nums[start] * nums[start];
            int endSquare = nums[end] * nums[end];

            if (startSquare > endSquare) {
                result[pos] = startSquare;
                start++;
            } else {
                result[pos] = endSquare;
                end--;
            }
            pos--;
        }

        return result;
 
    }
}

