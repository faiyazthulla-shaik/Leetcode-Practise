class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first_num = Integer.MAX_VALUE;
        int sec_num = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<=first_num){
                first_num = nums[i];
            }else if(nums[i] <= sec_num){
                sec_num = nums[i];
            }else{
                return true;
            }
        }
        return false;
    }
}

//Time compelxity: O(n)
//Space complexity: O(1)
