class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];

        for(int i=2; i<dp.length; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i-1]); 
        }
        return dp[dp.length - 1];
    }
}

//Time complexity: O(n)
//Space complexity: O(n)

class Solution {
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0, newRob = 0;
        for(int i=0; i<nums.length; i++){
            newRob = Math.max(rob1+nums[i], rob2);
            rob1 = rob2;
            rob2 = newRob;
        }
        return newRob;
    }
}

//Time complexity: O(n)
//Space complexity: O(1)
