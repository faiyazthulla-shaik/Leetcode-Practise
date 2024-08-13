class Solution {
    public int missingNumber(int[] nums) {
        int sumOfN = (nums.length*(nums.length+1))/2;
        for(int i= 0; i<nums.length; i++){
            sumOfN = sumOfN - nums[i];
        }
        return sumOfN;
    }
}

//Time complexity: O(n)
//Space complexity: O(1)
