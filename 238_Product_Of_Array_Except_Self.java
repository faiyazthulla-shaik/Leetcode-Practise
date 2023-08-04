class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] forward = new int[nums.length];
        int[] backward = new int[nums.length];
        int[] output = new int[nums.length];

        forward[0] = 1;
        for(int i=1; i<nums.length; i++){
            forward[i] = forward[i-1]*nums[i-1];
        }

        backward[nums.length-1]=1;
        for(int i=nums.length-2; i>=0; i--){
            backward[i] = backward[i+1] * nums[i+1];
        }

        for(int i=0; i<nums.length; i++){
            output[i] = forward[i] * backward[i];
        }
        return output;
    }
}


//Time complexity: O(n)
//Space complexity: O(n)
