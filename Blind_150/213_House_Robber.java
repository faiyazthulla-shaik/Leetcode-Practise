class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(helper(nums, 0, nums.length-1), helper(nums, 1, nums.length));
    }

    public int helper(int[] nums, int start, int end) {
        int rob1 = 0, rob2 = 0, newRob = 0;
        for(int i=start; i<end; i++){
            newRob = Math.max(rob1+nums[i], rob2);
            rob1 = rob2;
            rob2 = newRob;
        }
        return newRob;
    }
}

//Time complexity: O(n)
//Space complexity: O(1)
