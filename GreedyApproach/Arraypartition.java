import java.util*;
class Solution {
    public int Arraypartition(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i+=2){
            count +=nums[i];
        }
        return count;
    }
}