class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            Arrays.sort(nums);
            int p = nums[0], c = 1, maxc = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] - p == 1) {
                    c++;
                } else if (nums[i] == p) {
                } else if (nums[i] != p) {
                    c = 1;
                }
                if (c > maxc) {
                    maxc = c;
                }
                p = nums[i];
            }
            return maxc;
        }
    }
}