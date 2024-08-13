class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int current=0, farest = 0;
        for(int i=0; i<nums.length-1; i++){
            farest = Math.max(farest, nums[i]+i);
            if(i == current){
                current = farest;
                jumps++;
            }
        }
        return jumps;
    }
}

//Time complexity: O(n)
//Space complexity: O(1)
