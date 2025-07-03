class Solution {
    public boolean jumpgame(int[] nums) {
        int reachableIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachableIndex)
                return false;
            reachableIndex = Math.max(reachableIndex, i + nums[i]);
        }
        return true;
    }
}